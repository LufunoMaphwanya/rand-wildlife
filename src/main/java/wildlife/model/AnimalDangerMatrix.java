package wildlife.model;

public class AnimalDangerMatrix {
	
	public AnimalDangerMatrix(int venomLevel, int aggressionLevel, int nPeopleAttacked) {
		this.venomLevel = venomLevel;
		this.aggressionLevel = aggressionLevel;
		this.nPeopleAttacked = nPeopleAttacked;
	}
	private int venomLevel;
	private int aggressionLevel;
	private int nPeopleAttacked;
	
	public int getVenomLevel() {
		return venomLevel;
	}
	public void setVenomLevel(int venomLevel) {
		this.venomLevel = venomLevel;
	}
	public int getAggressionLevel() {
		return aggressionLevel;
	}
	public void setAggressionLevel(int aggressionLevel) {
		this.aggressionLevel = aggressionLevel;
	}
	public int getnPeopleAttacked() {
		return nPeopleAttacked;
	}
	public void setnPeopleAttacked(int nPeopleAttacked) {
		this.nPeopleAttacked = nPeopleAttacked;
	}

}
