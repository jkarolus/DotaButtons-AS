package de.jakobkarolus.dotabuttons.model;


/**
 * An entry of DotaButtons
 * 
 * @author Jakob
 *
 */
public class HeroResponse {

	private String response;
	private Heroes heroName;
	private int soundFile;
    private long id;
	
	private boolean newVersion;
	
	
	public boolean isNewVersion() {
		return newVersion;
	}

	public void setNewVersion(boolean newVersion) {
		this.newVersion = newVersion;
	}

	public HeroResponse(long id, String response, Heroes heroName, int soundFile) {
		super();
        this.id = id;
		this.response = response;
		this.heroName = heroName;
		this.setSoundFile(soundFile);
		this.newVersion = false;
	}
	
	public HeroResponse(long id, String response, Heroes heroName, int soundFile, boolean newVersion) {
		super();
        this.id = id;
		this.response = response;
		this.heroName = heroName;
		this.setSoundFile(soundFile);
		this.newVersion = newVersion;
	}

    public long getId() {return id;}

	public String getResponse() {
		return response;
	}


	public void setResponse(String name) {
		this.response = name;
	}


	public Heroes getHero() {
		return heroName;
	}


	public void setHero(Heroes heroName) {
		this.heroName = heroName;
	}

	public int getSoundFile() {
		return soundFile;
	}


	public void setSoundFile(int soundFile) {
		this.soundFile = soundFile;
	}
	
	
	
	
}
