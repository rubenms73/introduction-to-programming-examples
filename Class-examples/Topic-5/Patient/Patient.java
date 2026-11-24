/**
 * A patient with a name, weight, height and membership number.
 * Weight is in kilograms and height in metres; zero means unknown.
 */
public class Patient
{
    private String firstName;
    private String lastName;
    private double weight;
    private double height;
    private String memberNumber;

    // A patient whose data are unknown
    public Patient()
    {
        this("", "", 0, 0, "");
    }

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

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getHeight()
    {
        return height;
    }

    public String getMemberNumber()
    {
        return memberNumber;
    }

    // Negative values are ignored
    public void setWeight(double weight)
    {
        if (weight >= 0)
            this.weight = weight;
    }

    // Negative values are ignored
    public void setHeight(double height)
    {
        if (height >= 0)
            this.height = height;
    }

    // Body mass index; call it only when weight and height are positive
    public double bmi()
    {
        return weight / (height * height);
    }

    @Override
    public String toString()
    {
        return String.format("%s %s (%s)",
                firstName, lastName, memberNumber);
    }
}
