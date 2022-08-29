package u02p2.ex5;

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


}
