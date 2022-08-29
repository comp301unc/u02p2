package u02p2.ex2;

public class ProgrammingToAnInterface {
    public static void main (String[] args) {

        Point p1 = new CartesianPoint(5, 5);
        Point p2 = new CartesianPoint(10, 15);
        Point p3 = new CartesianPoint(15, -2);

        Triangle t1 = new Triangle(p1, p2, p3);

        System.out.println("Perimeter of T1 = " + t1.getPerimeter());

    }

}
