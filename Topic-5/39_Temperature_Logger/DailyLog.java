/**
 * The temperatures of one day, recorded at most once an hour. The readings
 * are stored in the order they arrive, which need not be the order of the
 * hours.
 */
public class DailyLog
{
    /** The date of the day, for example "2026-12-01". */
    private String date;

    /** The readings; only positions 0 to size - 1 are in use. */
    private Reading[] readings;

    /** The number of readings stored. */
    private int size;

    /** Creates an empty log for an unknown date. */
    public DailyLog()
    {
        date = "Unknown";
        readings = new Reading[24];   // one reading per hour at most
        size = 0;
    }

    /**
     * Creates an empty log.
     *
     * @param date the date of the day; if it is null, the date is "Unknown"
     */
    public DailyLog(String date)
    {
        this();
        if (date != null)
            this.date = date;
    }

    /**
     * Copy constructor: creates a log equal to other, with its own array
     * and its own copy of every reading (deep copy). If other is null, the
     * result is an empty log for an unknown date.
     *
     * @param other the log to copy
     */
    public DailyLog(DailyLog other)
    {
        this();
        if (other != null)
        {
            date = other.date;
            size = other.size;
            for (int i = 0; i < size; i++)
                readings[i] = new Reading(other.readings[i]);
        }
    }

    /**
     * Returns the date.
     *
     * @return the date of the day
     */
    public String getDate()
    {
        return date;
    }

    /**
     * Returns the number of readings stored.
     *
     * @return the number of readings, from 0 to 24
     */
    public int getSize()
    {
        return size;
    }

    /**
     * Searches the reading of an hour.
     *
     * @param hour the hour to look for
     * @return its position in the array, or -1 if that hour has no reading
     */
    private int positionOf(int hour)
    {
        for (int i = 0; i < size; i++)
            // Stop at the first match: an hour appears once at most
            if (readings[i].getHour() == hour)
                return i;
        return -1;
    }

    /**
     * Stores a copy of reading after the readings already stored.
     *
     * @param reading the reading to add
     * @return true if it was added; false if reading is null, the log is
     *         full or its hour already has a reading
     */
    public boolean addReading(Reading reading)
    {
        if (reading == null || size == readings.length || positionOf(reading.getHour()) != -1)
            // Nothing to add, no room, or that hour is already recorded.
            return false;
        else
        {
            // A copy, so that later changes to reading do not reach the log.
            readings[size] = new Reading(reading);
            size++;
            return true;
        }
    }

    /**
     * Returns a copy of the reading of an hour.
     *
     * @param hour the hour
     * @return a copy of its reading, or null if that hour has no reading
     */
    public Reading getReading(int hour)
    {
        int position = positionOf(hour);
        if (position == -1)
            // That hour has no reading.
            return null;
        else
            // A copy, so that the caller cannot change the log.
            return new Reading(readings[position]);
    }

    /**
     * Finds the reading with the highest temperature. If several readings
     * share it, the first one stored is chosen.
     *
     * @return a copy of that reading, or null if the log is empty
     */
    public Reading maximum()
    {
        if (size == 0)
            // Empty log: there is no maximum.
            return null;
        else
        {
            // Only a strictly higher temperature replaces the best so far.
            int best = 0;
            for (int i = 1; i < size; i++)
                if (readings[i].getTemperature() > readings[best].getTemperature())
                    best = i;
            return new Reading(readings[best]);
        }
    }

    /**
     * Calculates the average temperature of the day.
     *
     * @return the average of the readings, or 0 if the log is empty
     */
    public double average()
    {
        if (size == 0)
            // Empty log: there is nothing to average.
            return 0.0;
        else
        {
            double sum = 0.0;
            for (int i = 0; i < size; i++)
                sum += readings[i].getTemperature();
            return sum / size;
        }
    }

    /**
     * Counts the hours whose temperature is above a limit.
     *
     * @param limit the limit, in degrees Celsius
     * @return the number of readings strictly above limit
     */
    public int hoursAbove(double limit)
    {
        int count = 0;
        for (int i = 0; i < size; i++)
            if (readings[i].getTemperature() > limit)
                count++;
        return count;
    }

    /**
     * Two logs are equal if they have the same date and the same readings
     * in the same order.
     *
     * @param obj the object to compare with
     * @return true if obj is an equal log
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            // The same object: it is equal to itself.
            return true;
        if (!(obj instanceof DailyLog))
            // null, or an object of another class.
            return false;
        DailyLog other = (DailyLog) obj;
        if (!date.equals(other.date) || size != other.size)
            return false;
        // One different reading is enough
        for (int i = 0; i < size; i++)
            if (!readings[i].equals(other.readings[i]))
                return false;
        return true;
    }

    /**
     * Returns the date and the readings, for example
     * "2026-12-01 [08:00 12.5 C, 09:00 13.0 C]".
     *
     * @return the text that represents the log
     */
    @Override
    public String toString()
    {
        String text = date + " [";
        for (int i = 0; i < size; i++)
        {
            // A comma before every reading except the first one
            if (i > 0)
                text += ", ";
            text += readings[i];
        }
        return text + "]";
    }
}
