package de.jakobkarolus.dotabuttons.model;


/**
 * An entry of DotaButtons
 * 
 * @author Jakob
 *
 */
public class HeroResponse {

	private String response;
	private Heros heroName;
	private int soundFile;
	
	private boolean newVersion;
	
	
	public boolean isNewVersion() {
		return newVersion;
	}

	public void setNewVersion(boolean newVersion) {
		this.newVersion = newVersion;
	}

	public HeroResponse(String response, Heros heroName, int soundFile) {
		super();
		this.response = response;
		this.heroName = heroName;
		this.setSoundFile(soundFile);
		this.newVersion = false;
	}
	
	public HeroResponse(String response, Heros heroName, int soundFile, boolean newVersion) {
		super();
		this.response = response;
		this.heroName = heroName;
		this.setSoundFile(soundFile);
		this.newVersion = newVersion;
	}


	public String getResponse() {
		return response;
	}


	public void setResponse(String name) {
		this.response = name;
	}


	public Heros getHero() {
		return heroName;
	}


	public void setHero(Heros heroName) {
		this.heroName = heroName;
	}

	public int getSoundFile() {
		return soundFile;
	}


	public void setSoundFile(int soundFile) {
		this.soundFile = soundFile;
	}
	
	
	
	
}
