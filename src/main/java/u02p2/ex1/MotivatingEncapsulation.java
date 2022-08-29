package u02p2.ex1;

public class MotivatingEncapsulation {

    public static void main(String[] args) {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(10, 15);
        Point p3 = new Point(15, -2);
        Point p4 = new Point(-3, -8);

        Triangle t1 = new Triangle(p1, p2, p3);
        Triangle t2 = new Triangle(p2, p3, p4);

        System.out.println("Perimeter of T1 = " + t1.perimeter());
        System.out.println("Perimeter of T2 = " + t2.perimeter());

        t1.a.x += 5;
        t1.b.x += 5;
        t1.c.x += 5;

        System.out.println("Perimeter of T1 = " + t1.perimeter());
        System.out.println("Perimeter of T2 = " + t2.perimeter());

        t1.a = t1.c;
        t1.b = t1.c;

        System.out.println("Perimeter of T1 = " + t1.perimeter());
        System.out.println("Perimeter of T2 = " + t2.perimeter());
    }
}
