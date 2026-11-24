/**
 * Demonstrates the Patient class.
 */
public class Main
{
    /**
     * Creates two patients and shows how the setters filter the values.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Patient ana = new Patient("Ana", "García", 60, 1.65, "A-1024");
        System.out.println(ana);
        System.out.printf("BMI: %.1f\n", ana.bmi());

        // A negative weight is ignored: the weight does not change
        ana.setWeight(-70);
        System.out.printf("Weight after setWeight(-70): %.1f\n", ana.getWeight());

        // Zero means unknown, so the caller checks it before calling bmi()
        Patient unknown = new Patient();
        if (unknown.getWeight() > 0 && unknown.getHeight() > 0)
            System.out.printf("BMI: %.1f\n", unknown.bmi());
        else
            System.out.println("The BMI of a patient with unknown data cannot be calculated");
    }
}
