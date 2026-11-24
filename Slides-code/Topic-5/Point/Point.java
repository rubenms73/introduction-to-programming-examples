/**
 * A point of any dimension with real coordinates.
 * The dimension is positive and the coordinates are finite,
 * between -1000000 and 1000000.
 */
public class Point
{
    private double[] coordinates;

    // A two-dimensional point at the origin
    public Point()
    {
        this(2);
    }

    // A point at the origin; dimension must be positive
    public Point(int dimension)
    {
        coordinates = new double[dimension];
    }

    // values must not be null; the coordinates are copied
    public Point(double[] values)
    {
        this(values.length);
        for (int i = 0; i < values.length; i++)
            coordinates[i] = values[i];
    }

    // Copy constructor; point must not be null
    public Point(Point point)
    {
        this(point.coordinates);
    }

    public int dimension()
    {
        return coordinates.length;
    }

    // index goes from 0 to dimension() - 1
    public double getCoordinate(int index)
    {
        return coordinates[index];
    }

    // index goes from 0 to dimension() - 1
    public void setCoordinate(int index, double value)
    {
        coordinates[index] = value;
    }

    // Square root of the sum of the squared coordinates
    public double norm()
    {
        double sum = 0;
        for (int i = 0; i < coordinates.length; i++)
            sum += coordinates[i] * coordinates[i];
        return Math.sqrt(sum);
    }

    // point must not be null and must have the same dimension
    public double dotProduct(Point point)
    {
        double sum = 0;
        for (int i = 0; i < coordinates.length; i++)
            sum += coordinates[i] * point.coordinates[i];
        return sum;
    }

    // point must not be null and must have the same dimension
    public double distance(Point point)
    {
        double sum = 0;
        for (int i = 0; i < coordinates.length; i++)
        {
            double difference = coordinates[i] - point.coordinates[i];
            sum += difference * difference;
        }
        return Math.sqrt(sum);
    }

    // Both norms must be nonzero. Rounding can push the result
    // slightly outside [-1, 1], so it is clamped to that interval.
    private double cosine(Point point)
    {
        double result = dotProduct(point) / (norm() * point.norm());
        if (result > 1)
            result = 1;
        else if (result < -1)
            result = -1;
        return result;
    }

    // Angle in radians; both norms must be nonzero
    public double angle(Point point)
    {
        return Math.acos(cosine(point));
    }

    // The zero vector is orthogonal to every vector
    public boolean isOrthogonal(Point point)
    {
        if (norm() == 0 || point.norm() == 0)
            return true;
        return Math.abs(cosine(point)) <= 1e-12;
    }

    @Override
    public String toString()
    {
        String text = "(";
        for (int i = 0; i < coordinates.length; i++)
        {
            if (i > 0)
                text = text + ", ";
            text = text + String.format("%.2f", coordinates[i]);
        }
        return text + ")";
    }

    // Exact comparison: it does not check whether two points are merely close
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Point))
            return false;
        Point other = (Point) obj;
        if (coordinates.length != other.coordinates.length)
            return false;
        for (int i = 0; i < coordinates.length; i++)
            if (coordinates[i] != other.coordinates[i])
                return false;
        return true;
    }
}
