/**
 * A counter whose value always stays between a minimum and a maximum.
 * The constructor arguments must satisfy the preconditions of the
 * exercise. Invalid setter values leave the previous valid state
 * unchanged.
 */
public class BoundedCounter
{
    /** The smallest value allowed. */
    private int minimum;

    /** The largest value allowed. */
    private int maximum;

    /** The current value, between minimum and maximum. */
    private int value;

    /**
     * Creates a counter.
     *
     * @param minimum the smallest value allowed
     * @param maximum the largest value allowed
     * @param initialValue the initial value, between minimum and maximum
     */
    public BoundedCounter(int minimum, int maximum, int initialValue)
    {
        // Precondition: minimum <= initialValue <= maximum.
        this.minimum = minimum;
        this.maximum = maximum;
        this.value = initialValue;
    }

    /**
     * Returns the minimum.
     *
     * @return the smallest value allowed
     */
    public int getMinimum()
    {
        return minimum;
    }

    /**
     * Changes the minimum if it is not greater than the maximum or the
     * current value.
     *
     * @param minimum the new minimum
     * @return true if the minimum was changed, false otherwise
     */
    public boolean setMinimum(int minimum)
    {
        if (minimum > maximum || value < minimum)
            return false;
        this.minimum = minimum;
        return true;
    }

    /**
     * Returns the maximum.
     *
     * @return the largest value allowed
     */
    public int getMaximum()
    {
        return maximum;
    }

    /**
     * Changes the maximum if it is not smaller than the minimum or the
     * current value.
     *
     * @param maximum the new maximum
     * @return true if the maximum was changed, false otherwise
     */
    public boolean setMaximum(int maximum)
    {
        if (maximum < minimum || value > maximum)
            return false;
        this.maximum = maximum;
        return true;
    }

    /**
     * Returns the current value.
     *
     * @return the current value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Changes the value if it is between the minimum and the maximum.
     *
     * @param value the new value
     * @return true if the value was changed, false otherwise
     */
    public boolean setValue(int value)
    {
        if (value < minimum || value > maximum)
            return false;
        this.value = value;
        return true;
    }

    /**
     * Adds 1 to the value unless it is already at the maximum.
     *
     * @return true if the value was incremented, false otherwise
     */
    public boolean increment()
    {
        if (value == maximum)
            return false;
        value++;
        return true;
    }

    /**
     * Subtracts 1 from the value unless it is already at the minimum.
     *
     * @return true if the value was decremented, false otherwise
     */
    public boolean decrement()
    {
        if (value == minimum)
            return false;
        value--;
        return true;
    }

    /** Sets the value back to the minimum. */
    public void reset()
    {
        value = minimum;
    }

    /**
     * Returns the limits and the value, for example "Counter[0..2] = 1".
     *
     * @return the text that represents the counter
     */
    @Override
    public String toString()
    {
        return String.format("Counter[%d..%d] = %d", minimum, maximum, value);
    }
}
