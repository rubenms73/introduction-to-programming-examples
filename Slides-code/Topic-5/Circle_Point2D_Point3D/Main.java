/**
 * Demonstrates the Circle, Point2D and Point3D classes.
 */
public class Main
{
    /**
     * Shows composition with Circle and Point2D and inheritance with
     * Point3D.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        // Constructors and the radius filter
        Circle c1 = new Circle(3, 4, 2);
        Circle c2 = new Circle(-5);
        System.out.println("c1: " + c1);
        System.out.println("c2 (invalid radius -5): " + c2);
        System.out.printf("Area of c1: %.2f\n", c1.area());
        System.out.printf("Area of a circle of radius 2: %.2f\n", Circle.area(2));

        // Deep copy: moving the copy does not move the original
        Circle copy = new Circle(c1);
        copy.setX(10);
        System.out.println("After copy.setX(10):");
        System.out.println("  c1:   " + c1);
        System.out.println("  copy: " + copy);

        // Copy of null: the default circle
        Circle empty = new Circle((Circle) null);
        System.out.println("Copy of null: " + empty);

        // Inheritance: a Point3D also has x, y, getX() and getY()
        Point3D p = new Point3D(1, 2, 2);
        System.out.println("p: " + p);
        System.out.println("p.getX(): " + p.getX());
        System.out.printf("p.norm(): %.2f\n", p.norm());

        Point3D q = new Point3D(p);
        q.setZ(7);
        System.out.println("After q.setZ(7), p: " + p + ", q: " + q);
    }
}
