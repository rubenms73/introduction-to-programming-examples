/**
 * A temperature reading taken at an exact hour of the day.
 */
public class Reading
{
    /** The hour of the reading, from 0 to 23. */
    private int hour;

    /** The temperature, in degrees Celsius. */
    private double temperature;

    /** Creates the default reading: 0 degrees at 00:00. */
    public Reading()
    {
        hour = 0;
        temperature = 0.0;
    }

    /**
     * Creates a reading.
     *
     * @param hour the hour; if it is not between 0 and 23, the hour is 0
     * @param temperature the temperature, in degrees Celsius
     */
    public Reading(int hour, double temperature)
    {
        this();
        setHour(hour);   // the setter filters the value
        this.temperature = temperature;
    }

    /**
     * Copy constructor: creates a reading equal to other. If other is null,
     * the result is the default reading.
     *
     * @param other the reading to copy
     */
    public Reading(Reading other)
    {
        this();
        if (other != null)
        {
            hour = other.hour;
            temperature = other.temperature;
        }
    }

    /**
     * Returns the hour.
     *
     * @return the hour, from 0 to 23
     */
    public int getHour()
    {
        return hour;
    }

    /**
     * Changes the hour. An hour outside 0 to 23 leaves it unchanged.
     *
     * @param hour the proposed hour
     */
    public void setHour(int hour)
    {
        if (hour >= 0 && hour <= 23)
            this.hour = hour;
    }

    /**
     * Returns the temperature.
     *
     * @return the temperature, in degrees Celsius
     */
    public double getTemperature()
    {
        return temperature;
    }

    /**
     * Changes the temperature. Any value is valid.
     *
     * @param temperature the new temperature, in degrees Celsius
     */
    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
    }

    /**
     * Two readings are equal if they have the same hour and temperature.
     *
     * @param obj the object to compare with
     * @return true if obj is a reading with the same values
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            // The same object: it is equal to itself.
            return true;
        if (!(obj instanceof Reading))
            // null, or an object of another class.
            return false;
        Reading other = (Reading) obj;
        return hour == other.hour && temperature == other.temperature;
    }

    /**
     * Returns the hour and the temperature, for example "08:00 12.5 C".
     *
     * @return the text that represents the reading
     */
    @Override
    public String toString()
    {
        return String.format("%02d:00 %s C", hour, temperature);
    }
}
