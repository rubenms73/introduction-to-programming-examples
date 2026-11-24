/**
 * A point in space: a Point2D with a third coordinate.
 */
public class Point3D extends Point2D
{
    /** The z coordinate. x and y are inherited from Point2D. */
    private int z;

    /** Creates the point (0, 0, 0). */
    public Point3D()
    {
        super();   // the superclass sets x and y to 0
        z = 0;
    }

    /**
     * Creates the point (x, y, z).
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public Point3D(int x, int y, int z)
    {
        super(x, y);   // the superclass initialises x and y
        this.z = z;
    }

    /**
     * Copy constructor: creates a point equal to other. If other is null,
     * the point stays at (0, 0, 0).
     *
     * @param other the point to copy
     */
    public Point3D(Point3D other)
    {
        super(other);
        if (other != null)
            this.z = other.z;
    }

    /**
     * Returns the z coordinate.
     *
     * @return the z coordinate
     */
    public int getZ()
    {
        return z;
    }

    /**
     * Changes the z coordinate.
     *
     * @param z the new z coordinate
     */
    public void setZ(int z)
    {
        this.z = z;
    }

    /**
     * Calculates the distance to the origin. x and y are protected, so they
     * can be used directly.
     *
     * @return the distance from the point to (0, 0, 0)
     */
    public double norm()
    {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * Returns the coordinates, for example "(1, 2, 2)".
     *
     * @return the text that represents the point
     */
    @Override
    public String toString()
    {
        return String.format("(%d, %d, %d)", x, y, z);
    }
}
