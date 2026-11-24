/** Tests the BoundedCounter class. */
public class Main
{
    /**
     * Creates a counter and tries to go past its limits.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        BoundedCounter counter = new BoundedCounter(0, 2, 1);
        System.out.println(counter);
        System.out.println("Increment accepted: " + counter.increment());
        System.out.println("Increment at maximum accepted: " + counter.increment());
        System.out.println(counter);
        counter.reset();
        System.out.println("After reset: " + counter);
        System.out.println("Decrement at minimum accepted: " + counter.decrement());
    }
}
