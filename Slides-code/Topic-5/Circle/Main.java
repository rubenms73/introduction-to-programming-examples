/**
 * Demonstrates the Circle class.
 */
public class Main
{
    /**
     * Creates several circles and shows how constructors, setters,
     * references and the copy constructor work.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(10, 20, 8);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        System.out.printf("Area of c3: %.2f\n", c3.area());

        // A radius that is not positive is ignored
        c1.setRadius(-4);
        System.out.println("c1 after setRadius(-4): " + c1);

        // Assigning copies the reference: both variables share one object
        Circle e = c2;
        e.setRadius(7);
        System.out.println("c2 after e.setRadius(7): " + c2);
        System.out.println("e and c2 are the same object: " + e.isSameObject(c2));

        // The copy constructor creates a separate object
        Circle copy = new Circle(c2);
        copy.setRadius(2);
        System.out.println("c2: " + c2 + ", copy: " + copy);
        System.out.println("copy equals c2: " + copy.equals(c2));

        if (c3.isLargerThan(c2))
            System.out.println("c3 is larger");
    }
}
