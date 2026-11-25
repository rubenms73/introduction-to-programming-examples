/**
 * The record of a student with a theory mark and a lab mark.
 * The constructor arguments must satisfy the preconditions of the
 * exercise. Invalid setter values leave the previous valid state
 * unchanged.
 */
public class StudentRecord
{
    /** The name of the student. */
    private String name;

    /** The theory mark, from 0 to 10. */
    private double theoryMark;

    /** The lab mark, from 0 to 10. */
    private double labMark;

    /**
     * Creates a record.
     *
     * @param name the name, not null or empty
     * @param theoryMark the theory mark, from 0 to 10
     * @param labMark the lab mark, from 0 to 10
     */
    public StudentRecord(String name, double theoryMark, double labMark)
    {
        setName(name);
        setTheoryMark(theoryMark);
        setLabMark(labMark);
    }

    /**
     * Returns the name.
     *
     * @return the name of the student
     */
    public String getName()
    {
        return name;
    }

    /**
     * Changes the name. A null or empty name is ignored.
     *
     * @param name the new name
     */
    public void setName(String name)
    {
        if (name != null && name.length() > 0)
            this.name = name;
    }

    /**
     * Returns the theory mark.
     *
     * @return the theory mark
     */
    public double getTheoryMark()
    {
        return theoryMark;
    }

    /**
     * Changes the theory mark. Values outside [0, 10] are ignored.
     *
     * @param theoryMark the new mark
     */
    public void setTheoryMark(double theoryMark)
    {
        if (theoryMark >= 0 && theoryMark <= 10)
            this.theoryMark = theoryMark;
    }

    /**
     * Returns the lab mark.
     *
     * @return the lab mark
     */
    public double getLabMark()
    {
        return labMark;
    }

    /**
     * Changes the lab mark. Values outside [0, 10] are ignored.
     *
     * @param labMark the new mark
     */
    public void setLabMark(double labMark)
    {
        if (labMark >= 0 && labMark <= 10)
            this.labMark = labMark;
    }

    /**
     * Calculates the final mark: 60% theory and 40% lab.
     *
     * @return the final mark
     */
    public double finalMark()
    {
        // Same as 0.6 * theory + 0.4 * lab, but without rounding errors such as 7.199999999999999.
        return (6 * theoryMark + 4 * labMark) / 10;
    }

    /**
     * Decides whether the student has passed: at least 4 in each part and
     * at least 5 in the final mark.
     *
     * @return true if the student has passed, false otherwise
     */
    public boolean hasPassed()
    {
        return theoryMark >= 4.0 && labMark >= 4.0 && finalMark() >= 5.0;
    }

    /**
     * Returns the name, the final mark and the result, for example
     * "Alex: 7.4 (PASS)".
     *
     * @return the report of the student
     */
    public String report()
    {
        String result = hasPassed() ? "PASS" : "FAIL";
        return String.format("%s: %s (%s)", name, finalMark(), result);
    }

    /**
     * Returns the same text as report().
     *
     * @return the text that represents the record
     */
    @Override
    public String toString()
    {
        return report();
    }
}
