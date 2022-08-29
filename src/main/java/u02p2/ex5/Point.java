package u02p2.ex5;

public interface Point {
	int getX();
	int getY();

	default double distanceTo(Point other) {
		return Math.sqrt((getX() - other.getX())*(getX() - other.getX()) +
				(getY() - other.getY())*(getY() - other.getY()));
	}

	default boolean equals(Point other) {
		return ((getX() == other.getX()) && (getY() == other.getY()));
	}
}
