package de.jakobkarolus.dotabuttons.io;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;

import java.util.List;
import java.util.Vector;

import de.jakobkarolus.dotabuttons.io.DotaButtonsContract.HeroResponseEntry;
import de.jakobkarolus.dotabuttons.model.HeroResponse;
import de.jakobkarolus.dotabuttons.model.Heroes;

/**
 * Created by Jakob on 01.03.2015.
 */
public class SQLAdapter {

    public class DotaButtonsDbHelper extends SQLiteOpenHelper{


        public static final int DB_VERSION = 1;
        public static final String DB_NAME = "DotaButtons.db";

        private static final String TEXT_TYPE = " TEXT";
        private static final String INT_TYPE = " INTEGER";
        private static final String COMMA_SEP = ",";
        private static final String SQL_CREATE_ENTRIES = "CREATE TABLE " +
                HeroResponseEntry.TABLE_NAME + " (" + HeroResponseEntry.COLUMN_NAME_ID + " INTEGER PRIMARY KEY," +
                HeroResponseEntry.COLUMN_NAME_HERO + TEXT_TYPE + COMMA_SEP +
                HeroResponseEntry.COLUMN_NAME_RESPONSE + TEXT_TYPE + COMMA_SEP +
                HeroResponseEntry.COLUMN_NAME_SOUND_FILE + INT_TYPE + " )";

        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + HeroResponseEntry.TABLE_NAME;

        public DotaButtonsDbHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(SQL_CREATE_ENTRIES);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL(SQL_DELETE_ENTRIES);
            onCreate(db);
        }

        @Override
        public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            onUpgrade(db, oldVersion, newVersion);
        }
    }

    private DotaButtonsDbHelper mDbHelper;
    private DotaButtonsDbCallback callback;

    public SQLAdapter(Context ctx, DotaButtonsDbCallback callback){
        this.mDbHelper = new DotaButtonsDbHelper(ctx);
        this.callback = callback;
    }

    public void addHeroResponseToDB(HeroResponse response){
        new AddHeroResponseToDbTask().execute(response);
    }

    public class AddHeroResponseToDbTask extends AsyncTask<HeroResponse, Void, Void>{

        @Override
        protected Void doInBackground(HeroResponse... params) {
            SQLiteDatabase db = mDbHelper.getReadableDatabase();

            ContentValues cv = new ContentValues();
            cv.put(HeroResponseEntry.COLUMN_NAME_ID, params[0].getId());
            cv.put(HeroResponseEntry.COLUMN_NAME_HERO, params[0].getHero().name());
            cv.put(HeroResponseEntry.COLUMN_NAME_RESPONSE, params[0].getResponse());
            cv.put(HeroResponseEntry.COLUMN_NAME_SOUND_FILE, params[0].getSoundFile());

            long rowId = db.insertWithOnConflict(HeroResponseEntry.TABLE_NAME, null, cv, SQLiteDatabase.CONFLICT_REPLACE);
            if(rowId == -1)
                callback.onAddHeroResponseError(params[0]);

            return null;
        }
    }

    public void removeHeroResponseFromDB(HeroResponse response){
        new RemoveHeroResponseFromDbTask().execute(response);
    }

    public class RemoveHeroResponseFromDbTask extends AsyncTask<HeroResponse, Void, Void>{

        @Override
        protected Void doInBackground(HeroResponse... params) {
            SQLiteDatabase db = mDbHelper.getWritableDatabase();

            String where = HeroResponseEntry.COLUMN_NAME_ID + " = ?";
            String[] whereArgs = {String.valueOf(params[0].getId())};

            int removeCount = db.delete(HeroResponseEntry.TABLE_NAME, where, whereArgs);

            if(removeCount == 0)
                callback.onRemoveHeroResponseError(params[0]);

            return null;
        }
    }

    public void getFavorites(){
        new RetrieveFavoritesFromDbTask().execute();
    }

    public class RetrieveFavoritesFromDbTask extends AsyncTask<Void, Void, Void>{

        @Override
        protected Void doInBackground(Void... params) {
            SQLiteDatabase db = mDbHelper.getReadableDatabase();


            String[] projection = {HeroResponseEntry.COLUMN_NAME_ID, HeroResponseEntry.COLUMN_NAME_HERO, HeroResponseEntry.COLUMN_NAME_RESPONSE, HeroResponseEntry.COLUMN_NAME_SOUND_FILE};

            Cursor c = db.query(HeroResponseEntry.TABLE_NAME, projection, null, null, null, null, null);
            c.moveToFirst();
            List<HeroResponse> responses = new Vector<>();
            for(int i=0; i < c.getCount(); i++){
                responses.add(new HeroResponse(c.getLong(0), c.getString(2), Heroes.valueOf(c.getString(1)), c.getInt(3)));
                c.moveToNext();
            }

            callback.onRetrieveFavorites(HeroResponseParser.toMap(responses));
            return null;
        }
    }
}
