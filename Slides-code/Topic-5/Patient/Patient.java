/**
 * A patient with a name, weight, height and membership number.
 * Weight is in kilograms and height in metres; zero means unknown.
 */
public class Patient
{
    /** The first name. */
    private String firstName;

    /** The last name. */
    private String lastName;

    /** The weight in kilograms; zero means unknown. */
    private double weight;

    /** The height in metres; zero means unknown. */
    private double height;

    /** The membership number. */
    private String memberNumber;

    /** Creates a patient whose data are unknown. */
    public Patient()
    {
        this("", "", 0, 0, "");
    }

    /**
     * Creates a patient with the given data. A negative weight or height
     * is ignored and stays unknown (zero).
     *
     * @param firstName the first name
     * @param lastName the last name
     * @param weight the weight in kilograms
     * @param height the height in metres
     * @param memberNumber the membership number
     */
    public Patient(String firstName, String lastName,
            double weight, double height,
            String memberNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        setWeight(weight);   // the setters filter the values
        setHeight(height);
        this.memberNumber = memberNumber;
    }

    /**
     * Returns the first name.
     *
     * @return the first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Returns the last name.
     *
     * @return the last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Returns the weight.
     *
     * @return the weight in kilograms, or zero if it is unknown
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * Returns the height.
     *
     * @return the height in metres, or zero if it is unknown
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Returns the membership number.
     *
     * @return the membership number
     */
    public String getMemberNumber()
    {
        return memberNumber;
    }

    /**
     * Changes the weight. Negative values are ignored.
     *
     * @param weight the new weight in kilograms
     */
    public void setWeight(double weight)
    {
        if (weight >= 0)
            this.weight = weight;
    }

    /**
     * Changes the height. Negative values are ignored.
     *
     * @param height the new height in metres
     */
    public void setHeight(double height)
    {
        if (height >= 0)
            this.height = height;
    }

    /**
     * Calculates the body mass index. Call it only when weight and height
     * are positive.
     *
     * @return the weight divided by the square of the height
     */
    public double bmi()
    {
        return weight / (height * height);
    }

    /**
     * Returns the name and the membership number, for example
     * "Ana García (A-1024)".
     *
     * @return the text that represents the patient
     */
    @Override
    public String toString()
    {
        return String.format("%s %s (%s)",
                firstName, lastName, memberNumber);
    }
}
