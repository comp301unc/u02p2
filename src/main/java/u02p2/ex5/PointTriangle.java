package u02p2.ex5;

public class PointTriangle implements Triangle {

	private Point a;
	private Point b;
	private Point c;

	public PointTriangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;

		if (check_colinearity()) {
			throw new RuntimeException("Triangle points are co-linear");
		}
	}

	public Point getA() {
		return a;
	}

	public void setA(Point p) {
		if (p.equals(b) || p.equals(c)) {
			throw new RuntimeException("Attempting to set point A to same value as either B or C");
		}

		a = p;

		if (check_colinearity()) {
			throw new RuntimeException("Triangle points are co-linear");
		}
	}

	public Point getB() {
		return b;
	}

	public void setB(Point p) {
		if (p.equals(a) || p.equals(c)) {
			throw new RuntimeException("Attempting to set point B to same value as either A or C");
		}

		b = p;

		if (check_colinearity()) {
			throw new RuntimeException("Triangle points are co-linear");
		}
	}

	public Point getC() {
		return c;
	}

	public void setC(Point p) {
		if (p.equals(a) || p.equals(b)) {
			throw new RuntimeException("Attempting to set point C to same value as either A or B");
		}

		c = p;

		if (check_colinearity()) {
			throw new RuntimeException("Triangle points are co-linear");
		}
	}

	public Point[] getPoints() {
		Point[] point_array = {a, b, c};
		return point_array;
	}

	public void setPoints(Point[] points) {
		if (points[0].equals(points[1]) ||
				points[0].equals(points[2]) ||
				points[1].equals(points[2])) {
			throw new RuntimeException("At least two points have same value");
		}

		a = points[0];
		b = points[1];
		c = points[2];

		if (check_colinearity()) {
			throw new RuntimeException("Triangle points are co-linear");
		}
	}

	public double getPerimeter() {
		return sideABLength() + sideBCLength() + sideCALength();
	}

	public double getArea() {
		double s = getPerimeter() / 2.0;
		return Math.sqrt(s * (s-sideABLength()) * (s-sideBCLength()) * (s-sideCALength()));
	}

	private boolean check_colinearity() {
		return (getArea() < 0.000001);
	}

	private double sideABLength() {
		return a.distanceTo(b);
	}

	private double sideBCLength() {
		return b.distanceTo(c);
	}

	private double sideCALength() {
		return c.distanceTo(a);
	}
}
