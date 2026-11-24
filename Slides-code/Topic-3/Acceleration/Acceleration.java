/**
 * Calculates an acceleration with a static method.
 */
public class Acceleration
{
    /**
     * Calculates the acceleration of a body that changes its velocity
     * uniformly.
     *
     * @param initialVelocity the initial velocity, in m/s
     * @param finalVelocity the final velocity, in m/s
     * @param time the time taken, in seconds
     * @return the acceleration, in m/s2
     */
    public static double acceleration(double initialVelocity,
            double finalVelocity,
            double time)
    {
        return (finalVelocity - initialVelocity) / time;
    }

    /**
     * Displays the acceleration of a car that goes from 0 to 27.8 m/s
     * in 10 seconds.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        double a = acceleration(0.0, 27.8, 10.0);
        System.out.printf("Acceleration: %.2f m/s2\n", a);
    }
}
