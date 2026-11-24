/**
 * Represents circles with an integer centre and a positive integer radius.
 */
public class Circle
{
    /** The x coordinate of the centre. */
    private int x;

    /** The y coordinate of the centre. */
    private int y;

    /** The radius, always positive. */
    private int radius;

    /** Creates the default circle: centre (0, 0) and radius 1. */
    public Circle()
    {
        this(0, 0, 1);
    }

    /**
     * Creates a circle centred at (0, 0).
     *
     * @param radius the radius; if it is not positive, the radius is 1
     */
    public Circle(int radius)
    {
        this(0, 0, radius);
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
        this.x = x;
        this.y = y;
        this.radius = 1;
        setRadius(radius);   // the setter filters the value
    }

    /**
     * Copy constructor: creates a circle equal to other. If other is null,
     * the new circle is the default one.
     *
     * @param other the circle to copy
     */
    public Circle(Circle other)
    {
        this();
        if (other != null)
        {
            x = other.x;
            y = other.y;
            radius = other.radius;
        }
    }

    /**
     * Returns the x coordinate of the centre.
     *
     * @return the x coordinate of the centre
     */
    public int getX()
    {
        return x;
    }

    /**
     * Returns the y coordinate of the centre.
     *
     * @return the y coordinate of the centre
     */
    public int getY()
    {
        return y;
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
     * Changes the radius when the new value is positive.
     * Other values leave the current radius unchanged.
     * @param radius the proposed radius
     */
    public void setRadius(int radius)
    {
        if (radius > 0)
            this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * @return the area of the circle
     */
    public double area()
    {
        return Math.PI * radius * radius;
    }

    /**
     * Checks whether this circle and other are the same object, that is,
     * whether both references point to the same place in memory.
     *
     * @param other the circle to compare with
     * @return true if this and other are the same object
     */
    public boolean isSameObject(Circle other)
    {
        return this == other;
    }

    /**
     * Checks whether this circle has a larger area than other.
     *
     * @param other the circle to compare with; it must not be null
     * @return true if the area of this circle is larger
     */
    public boolean isLargerThan(Circle other)
    {
        return this.area() > other.area();
    }

    /**
     * Two circles are equal when they have the same centre and radius,
     * even if they are different objects.
     *
     * @param obj the object to compare with
     * @return true if obj is a circle with the same centre and radius
     */
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Circle))
            return false;
        Circle other = (Circle) obj;
        return x == other.x && y == other.y
                && radius == other.radius;
    }

    /**
     * Returns the centre and the radius, for example "Circle[(3, 4), r=2]".
     *
     * @return the text that represents the circle
     */
    @Override
    public String toString()
    {
        return String.format("Circle[(%d, %d), r=%d]",
                x, y, radius);
    }
}
