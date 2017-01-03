package wildlife.model;

import java.util.ArrayList;

import location.GPSLocation;

public class Plant extends Wildlife{
	
	private boolean isPoisonous;
	private boolean isEdible;
	private GPSLocation location;

	public Plant(String id, String name, String description, boolean poisonous, boolean isEdible) {
		super(id, name, description);
		this.isPoisonous = poisonous;
		this.isEdible = isEdible;
	}

	@Override
	public boolean isDangerousToHumans() {
		return isPoisonous;
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}

	public void setPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}

	public boolean isEdible() {
		return isEdible;
	}

	public void setEdible(boolean isEdible) {
		this.isEdible = isEdible;
	}

	public GPSLocation getLocation() {
		return this.location;
	}

	public void setLocation(GPSLocation location) {
		this.location = location;
	}

	@Override
	public ArrayList<GPSLocation> trackWildlife() {
		ArrayList<GPSLocation> plantLocation =  new ArrayList<GPSLocation>();
		plantLocation.add(this.location);
		return plantLocation;
	}		
}
