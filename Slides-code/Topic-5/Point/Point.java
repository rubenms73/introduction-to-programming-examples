/**
 * A point of any dimension with real coordinates.
 * The dimension is positive and the coordinates are finite,
 * between -1000000 and 1000000.
 */
public class Point
{
    /** The coordinates; the length of the array is the dimension. */
    private double[] coordinates;

    /** Creates a two-dimensional point at the origin. */
    public Point()
    {
        this(2);
    }

    /**
     * Creates a point at the origin.
     *
     * @param dimension the dimension; it must be positive
     */
    public Point(int dimension)
    {
        coordinates = new double[dimension];
    }

    /**
     * Creates a point with the given coordinates. The values are copied, so
     * later changes to the array do not change the point.
     *
     * @param values the coordinates; it must not be null
     */
    public Point(double[] values)
    {
        this(values.length);
        for (int i = 0; i < values.length; i++)
            coordinates[i] = values[i];
    }

    /**
     * Copy constructor: creates a point equal to the given one.
     *
     * @param point the point to copy; it must not be null
     */
    public Point(Point point)
    {
        this(point.coordinates);
    }

    /**
     * Returns the dimension of the point.
     *
     * @return the number of coordinates
     */
    public int dimension()
    {
        return coordinates.length;
    }

    /**
     * Returns one coordinate.
     *
     * @param index the position, from 0 to dimension() - 1
     * @return the coordinate at that position
     */
    public double getCoordinate(int index)
    {
        return coordinates[index];
    }

    /**
     * Changes one coordinate.
     *
     * @param index the position, from 0 to dimension() - 1
     * @param value the new value of the coordinate
     */
    public void setCoordinate(int index, double value)
    {
        coordinates[index] = value;
    }

    /**
     * Calculates the norm: the square root of the sum of the squared
     * coordinates.
     *
     * @return the norm of the point
     */
    public double norm()
    {
        double sum = 0;
        for (int i = 0; i < coordinates.length; i++)
            sum += coordinates[i] * coordinates[i];
        return Math.sqrt(sum);
    }

    /**
     * Calculates the dot product with another point.
     *
     * @param point a point with the same dimension; it must not be null
     * @return the sum of the products of the coordinates
     */
    public double dotProduct(Point point)
    {
        double sum = 0;
        for (int i = 0; i < coordinates.length; i++)
            sum += coordinates[i] * point.coordinates[i];
        return sum;
    }

    /**
     * Calculates the distance to another point.
     *
     * @param point a point with the same dimension; it must not be null
     * @return the distance between both points
     */
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

    /**
     * Calculates the cosine of the angle with another point. Both norms must
     * be nonzero. Rounding can push the result slightly outside [-1, 1], so
     * it is clamped to that interval.
     *
     * @param point a point with the same dimension
     * @return the cosine of the angle, between -1 and 1
     */
    private double cosine(Point point)
    {
        double result = dotProduct(point) / (norm() * point.norm());
        if (result > 1)
            result = 1;
        else if (result < -1)
            result = -1;
        return result;
    }

    /**
     * Calculates the angle with another point. Both norms must be nonzero.
     *
     * @param point a point with the same dimension
     * @return the angle in radians, between 0 and pi
     */
    public double angle(Point point)
    {
        return Math.acos(cosine(point));
    }

    /**
     * Checks whether this point and another one are orthogonal. The zero
     * vector is orthogonal to every vector.
     *
     * @param point a point with the same dimension
     * @return true if the cosine of the angle is practically zero
     */
    public boolean isOrthogonal(Point point)
    {
        if (norm() == 0 || point.norm() == 0)
            return true;
        return Math.abs(cosine(point)) <= 1e-12;
    }

    /**
     * Returns the coordinates with two decimals, for example "(3.00, 4.00)".
     *
     * @return the text that represents the point
     */
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

    /**
     * Two points are equal when they have the same dimension and the same
     * coordinates. The comparison is exact: it does not check whether two
     * points are merely close.
     *
     * @param obj the object to compare with
     * @return true if obj is a point with the same coordinates
     */
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
