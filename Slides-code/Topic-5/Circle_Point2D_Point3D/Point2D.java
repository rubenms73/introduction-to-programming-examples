/**
 * A point in the plane with integer coordinates.
 */
public class Point2D
{
    /**
     * The x coordinate. It is protected, so the subclass Point3D can use it
     * directly.
     */
    protected int x;

    /**
     * The y coordinate. It is protected, so the subclass Point3D can use it
     * directly.
     */
    protected int y;

    /** Creates the point (0, 0). */
    public Point2D()
    {
        x = 0;
        y = 0;
    }

    /**
     * Creates the point (x, y).
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Copy constructor: creates a point equal to other. If other is null,
     * the point stays at (0, 0).
     *
     * @param other the point to copy
     */
    public Point2D(Point2D other)
    {
        if (other != null)
        {
            this.x = other.x;
            this.y = other.y;
        }
    }

    /**
     * Returns the x coordinate.
     *
     * @return the x coordinate
     */
    public int getX()
    {
        return x;
    }

    /**
     * Changes the x coordinate.
     *
     * @param x the new x coordinate
     */
    public void setX(int x)
    {
        this.x = x;
    }

    /**
     * Returns the y coordinate.
     *
     * @return the y coordinate
     */
    public int getY()
    {
        return y;
    }

    /**
     * Changes the y coordinate.
     *
     * @param y the new y coordinate
     */
    public void setY(int y)
    {
        this.y = y;
    }

    /**
     * Returns the coordinates, for example "(3, 4)".
     *
     * @return the text that represents the point
     */
    @Override
    public String toString()
    {
        return String.format("(%d, %d)", x, y);
    }
}
