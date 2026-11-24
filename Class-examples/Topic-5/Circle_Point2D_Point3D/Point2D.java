/**
 * A point in the plane with integer coordinates.
 */
public class Point2D
{
    // protected: the subclass Point3D can use x and y directly
    protected int x;
    protected int y;

    public Point2D()
    {
        x = 0;
        y = 0;
    }

    public Point2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // Copy constructor: if other is null, the point stays at (0, 0)
    public Point2D(Point2D other)
    {
        if (other != null)
        {
            this.x = other.x;
            this.y = other.y;
        }
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    @Override
    public String toString()
    {
        return String.format("(%d, %d)", x, y);
    }
}
