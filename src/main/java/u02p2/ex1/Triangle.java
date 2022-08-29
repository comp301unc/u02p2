package u02p2.ex1;

public class Triangle {

    Point a;
    Point b;
    Point c;

    Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double perimeter() {
        return sideABLength() + sideBCLength() + sideCALength();
    }

    double sideABLength() {
        return a.distanceTo(b);
    }

    double sideBCLength() {
        return b.distanceTo(c);
    }

    double sideCALength() {
        return c.distanceTo(a);
    }
}
