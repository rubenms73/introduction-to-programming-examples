/** Constructor arguments must satisfy the exercise preconditions.
 * Invalid setter values leave the previous valid state unchanged. */
public class StudentRecord
{
    private String name;
    private double theoryMark;
    private double labMark;

    public StudentRecord(String name, double theoryMark, double labMark)
    {
        setName(name);
        setTheoryMark(theoryMark);
        setLabMark(labMark);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (name != null && name.length() > 0)
            this.name = name;
    }

    public double getTheoryMark()
    {
        return theoryMark;
    }

    public void setTheoryMark(double theoryMark)
    {
        if (theoryMark >= 0 && theoryMark <= 10)
            this.theoryMark = theoryMark;
    }

    public double getLabMark()
    {
        return labMark;
    }

    public void setLabMark(double labMark)
    {
        if (labMark >= 0 && labMark <= 10)
            this.labMark = labMark;
    }

    public double finalMark()
    {
        return theoryMark * 0.6 + labMark * 0.4;
    }

    public boolean hasPassed()
    {
        return theoryMark >= 4.0 && labMark >= 4.0 && finalMark() >= 5.0;
    }

    public String report()
    {
        String result = hasPassed() ? "PASS" : "FAIL";
        return name + ": " + finalMark() + " (" + result + ")";
    }

    @Override public String toString()
    {
        return report();
    }
}
