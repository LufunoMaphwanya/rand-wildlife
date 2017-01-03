package wildlife.model;

import java.util.ArrayList;

import location.GPSLocation;

public class Animal extends Wildlife{	
	private AnimalClass animalClass;
	private AnimalDangerMatrix dangerMatrix;
	private ArrayList<GPSLocation> seenAt;

	public AnimalClass getAnimalClass() {
		return animalClass;
	}

	public void setAnimalClass(AnimalClass animalClass) {
		this.animalClass = animalClass;
	}

	public AnimalDangerMatrix getDangerMatrix() {
		return dangerMatrix;
	}

	public void setDangerMatrix(AnimalDangerMatrix dangerMatrix) {
		this.dangerMatrix = dangerMatrix;
	}

	public Animal(String id, String name, String description, AnimalDangerMatrix dangerMatrix, AnimalClass animalClass) {
		super(id, name, description);
		this.dangerMatrix = dangerMatrix;
		this.animalClass = animalClass;
	}

	@Override
	public boolean isDangerousToHumans() {
		// TODO Auto-generated method stub
		return  dangerMatrix.getVenomLevel() > 0  || 
				dangerMatrix.getAggressionLevel() > 10 || 
				dangerMatrix.getnPeopleAttacked() > 0;
	}

	@Override
	public ArrayList<GPSLocation> trackWildlife() {
		return seenAt;
	}		
}
