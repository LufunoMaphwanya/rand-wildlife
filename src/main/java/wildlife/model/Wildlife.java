package wildlife.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import location.GPSLocation;

public abstract class Wildlife {
	
	private String id;
	private String wildLifeName;
	private String description;
	
	/* super class for any form of wildlife *eg. animals, plants */
	public Wildlife(String id, String name, String description ){
		this.id = id;
		this.wildLifeName = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWildLifeName() {
		return wildLifeName;
	}

	public void setWildLifeName(String wildLifeName) {
		this.wildLifeName = wildLifeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	// method to check if wildlife is harmful to humn, poisonous, vicious, 
	public abstract boolean isDangerousToHumans(); 
	public abstract ArrayList<GPSLocation> trackWildlife();
}
