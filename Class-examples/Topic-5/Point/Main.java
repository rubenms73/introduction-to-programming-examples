/**
 * Demonstrates the Point class.
 */
public class Main
{
    public static void main(String[] args)
    {
        Point p = new Point(new double[] {3, 4});
        Point q = new Point(new double[] {-4, 3});
        Point r = new Point(new double[] {1, 2, 2});

        System.out.println("p = " + p + ", q = " + q + ", r = " + r);
        System.out.println("Dimension of r: " + r.dimension());
        System.out.printf("Norm of p: %.2f\n", p.norm());
        System.out.printf("Dot product p.q: %.2f\n", p.dotProduct(q));
        System.out.printf("Distance p-q: %.2f\n", p.distance(q));
        System.out.printf("Angle p-q: %.4f radians\n", p.angle(q));
        System.out.println("p and q orthogonal: " + p.isOrthogonal(q));

        // Defensive copy: changing the array does not change the point
        double[] values = {1, 1};
        Point s = new Point(values);
        values[0] = 99;
        System.out.println("s after changing the array: " + s);

        // Copy constructor and equals
        Point copy = new Point(p);
        System.out.println("copy equals p: " + copy.equals(p));
        copy.setCoordinate(0, 0);
        System.out.println("After copy.setCoordinate(0, 0): p = " + p + ", copy = " + copy);
        System.out.println("copy equals p: " + copy.equals(p));
    }
}
