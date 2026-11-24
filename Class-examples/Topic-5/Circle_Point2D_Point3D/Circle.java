/**
 * A circle with an integer centre and a positive integer radius.
 */
public class Circle
{
    private Point2D centre;
    private int radius;

    // Default circle: centre (0, 0) and radius 1
    public Circle()
    {
        centre = new Point2D();
        radius = 1;
    }

    public Circle(int radius)
    {
        this();
        setRadius(radius);   // the setter filters the value
    }

    public Circle(int x, int y, int radius)
    {
        this(radius);
        centre.setX(x);
        centre.setY(y);
    }

    // Copy constructor: if other is null, the result is the default circle
    public Circle(Circle other)
    {
        this();
        if (other == null)
            return;

        // Deep copy: the new circle gets its own centre
        centre = new Point2D(other.centre);
        radius = other.radius;
    }

    // The centre stays hidden: the circle offers its own methods
    public int getX()
    {
        return centre.getX();
    }

    public void setX(int x)
    {
        centre.setX(x);
    }

    public int getY()
    {
        return centre.getY();
    }

    public void setY(int y)
    {
        centre.setY(y);
    }

    public int getRadius()
    {
        return radius;
    }

    // Values that are not positive leave the radius unchanged
    public void setRadius(int radius)
    {
        if (radius > 0)
            this.radius = radius;
    }

    // Instance method
    public double area()
    {
        return Math.PI * radius * radius;
    }

    // Class method
    public static double area(int radius)
    {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString()
    {
        return String.format("Circle[centre=%s, r=%d]", centre, radius);
    }
}
