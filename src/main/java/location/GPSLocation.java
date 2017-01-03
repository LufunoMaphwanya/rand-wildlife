package location;

public class GPSLocation {
	
	private double minutes;
	private double seconds;
	private Direction direction;
	private double degrees;
	
	public GPSLocation(double minutes, double seconds, Direction direction, double degrees) {
		this.minutes = minutes;
		this.seconds = seconds;
		this.direction = direction;
		this.degrees = degrees;
	}
	public double getMinutes() {
		return minutes;
	}
	public void setMinutes(double minutes) {
		this.minutes = minutes;
	}
	public double getSeconds() {
		return seconds;
	}
	public void setSeconds(double seconds) {
		this.seconds = seconds;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public double getDegrees() {
		return degrees;
	}
	public void setDegrees(double degrees) {
		this.degrees = degrees;
	}
	
	

}
