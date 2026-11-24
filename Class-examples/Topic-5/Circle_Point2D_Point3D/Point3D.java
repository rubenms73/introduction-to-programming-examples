/**
 * A point in space: a Point2D with a third coordinate.
 */
public class Point3D extends Point2D
{
    private int z;

    public Point3D()
    {
        super();   // the superclass sets x and y to 0
        z = 0;
    }

    public Point3D(int x, int y, int z)
    {
        super(x, y);   // the superclass initialises x and y
        this.z = z;
    }

    // Copy constructor: if other is null, the point stays at (0, 0, 0)
    public Point3D(Point3D other)
    {
        super(other);
        if (other != null)
            this.z = other.z;
    }

    public int getZ()
    {
        return z;
    }

    public void setZ(int z)
    {
        this.z = z;
    }

    // Distance to the origin; x and y are protected, so they can be used directly
    public double norm()
    {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public String toString()
    {
        return String.format("(%d, %d, %d)", x, y, z);
    }
}
