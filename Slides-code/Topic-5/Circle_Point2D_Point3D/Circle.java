/**
 * A circle with an integer centre and a positive integer radius.
 */
public class Circle
{
    /** The centre. It is hidden: the circle offers getX, setX, getY and setY. */
    private Point2D centre;

    /** The radius, always positive. */
    private int radius;

    /** Creates the default circle: centre (0, 0) and radius 1. */
    public Circle()
    {
        centre = new Point2D();
        radius = 1;
    }

    /**
     * Creates a circle centred at (0, 0).
     *
     * @param radius the radius; if it is not positive, the radius is 1
     */
    public Circle(int radius)
    {
        this();
        setRadius(radius);   // the setter filters the value
    }

    /**
     * Creates a circle with the given centre and radius.
     *
     * @param x the x coordinate of the centre
     * @param y the y coordinate of the centre
     * @param radius the radius; if it is not positive, the radius is 1
     */
    public Circle(int x, int y, int radius)
    {
        this(radius);
        centre.setX(x);
        centre.setY(y);
    }

    /**
     * Copy constructor: creates a circle equal to other. If other is null,
     * the result is the default circle.
     *
     * @param other the circle to copy
     */
    public Circle(Circle other)
    {
        this();
        if (other == null)
            return;

        // Deep copy: the new circle gets its own centre
        centre = new Point2D(other.centre);
        radius = other.radius;
    }

    /**
     * Returns the x coordinate of the centre. The centre stays hidden, so
     * the circle offers its own methods that use it.
     *
     * @return the x coordinate of the centre
     */
    public int getX()
    {
        return centre.getX();
    }

    /**
     * Moves the centre horizontally.
     *
     * @param x the new x coordinate of the centre
     */
    public void setX(int x)
    {
        centre.setX(x);
    }

    /**
     * Returns the y coordinate of the centre.
     *
     * @return the y coordinate of the centre
     */
    public int getY()
    {
        return centre.getY();
    }

    /**
     * Moves the centre vertically.
     *
     * @param y the new y coordinate of the centre
     */
    public void setY(int y)
    {
        centre.setY(y);
    }

    /**
     * Returns the radius.
     *
     * @return the radius
     */
    public int getRadius()
    {
        return radius;
    }

    /**
     * Changes the radius. Values that are not positive leave the radius
     * unchanged.
     *
     * @param radius the proposed radius
     */
    public void setRadius(int radius)
    {
        if (radius > 0)
            this.radius = radius;
    }

    /**
     * Instance method: calculates the area of this circle.
     *
     * @return the area of the circle
     */
    public double area()
    {
        return Math.PI * radius * radius;
    }

    /**
     * Class method: calculates the area of a circle of the given radius,
     * without creating any object.
     *
     * @param radius the radius
     * @return the area of a circle with that radius
     */
    public static double area(int radius)
    {
        return Math.PI * radius * radius;
    }

    /**
     * Returns the centre and the radius, for example "Circle[centre=(3, 4), r=2]".
     *
     * @return the text that represents the circle
     */
    @Override
    public String toString()
    {
        return String.format("Circle[centre=%s, r=%d]", centre, radius);
    }
}
