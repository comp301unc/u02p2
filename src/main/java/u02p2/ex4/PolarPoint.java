package u02p2.ex4;

public class PolarPoint implements Point {

	private double theta;
	private double r;
	
	public PolarPoint(double theta, double r) {
		this.theta = theta;
		this.r = r;
	}
	
	public int getX() {
		return (int) (r * Math.cos(theta));
	}

	public int getY() {
		return (int) (r * Math.sin(theta));
	}

	public double distanceTo(Point other) {
		return Math.sqrt((getX() - other.getX())*(getX() - other.getX()) +
		         (getY() - other.getY())*(getY() - other.getY()));
	}

	public boolean equals(Point other) {
		return ((getX() == other.getX()) && (getY() == other.getY()));
	}

}
