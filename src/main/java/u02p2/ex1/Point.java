package u02p2.ex1;

public class Point {

    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distanceTo(Point other) {
        return Math.sqrt((this.x - other.x)*(this.x - other.x) +
                (this.y - other.y)*(this.y - other.y));
    }
}