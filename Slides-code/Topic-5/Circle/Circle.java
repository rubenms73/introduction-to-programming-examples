/**
 * Represents circles with an integer centre and a positive integer radius.
 */
public class Circle
{
    private int x;
    private int y;
    private int radius;

    // Default circle: centre (0, 0) and radius 1
    public Circle()
    {
        this(0, 0, 1);
    }

    public Circle(int radius)
    {
        this(0, 0, radius);
    }

    public Circle(int x, int y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = 1;
        setRadius(radius);   // the setter filters the value
    }

    // Copy constructor: if other is null, the new circle is the default one
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

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

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

    public boolean isSameObject(Circle other)
    {
        return this == other;
    }

    public boolean isLargerThan(Circle other)
    {
        return this.area() > other.area();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Circle))
            return false;
        Circle other = (Circle) obj;
        return x == other.x && y == other.y
                && radius == other.radius;
    }

    @Override
    public String toString()
    {
        return String.format("Circle[(%d, %d), r=%d]",
                x, y, radius);
    }
}
