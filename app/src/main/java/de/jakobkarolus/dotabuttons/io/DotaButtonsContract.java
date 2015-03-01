package de.jakobkarolus.dotabuttons.io;

import android.provider.BaseColumns;

/**
 *
 * DB contract for all DotaButtons tables
 *
 * Created by Jakob on 01.03.2015.
 */
public class DotaButtonsContract {

    private DotaButtonsContract(){}

    /**
     * table for HeroResponses, defining columns
     */
    public static abstract class HeroResponseEntry implements BaseColumns{

        public static final String TABLE_NAME = "favorites";
        public static final String COLUMN_NAME_ID = "id";
        public static final String COLUMN_NAME_HERO = "hero";
        public static final String COLUMN_NAME_RESPONSE = "response";
        public static final String COLUMN_NAME_SOUND_FILE = "soundFile";
    }
}
