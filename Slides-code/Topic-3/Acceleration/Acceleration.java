/**
 * Calculates an acceleration with a static method.
 */
public class Acceleration
{
    public static double acceleration(double initialVelocity,
            double finalVelocity,
            double time)
    {
        return (finalVelocity - initialVelocity) / time;
    }

    public static void main(String[] args)
    {
        double a = acceleration(0.0, 27.8, 10.0);
        System.out.printf("Acceleration: %.2f m/s2\n", a);
    }
}
