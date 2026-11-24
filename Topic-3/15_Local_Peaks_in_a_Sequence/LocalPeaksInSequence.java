import java.util.Scanner;

/**
 * Counts the local peaks of a sequence that ends with 0: the values
 * greater than the previous one and the next one.
 */
public class LocalPeaksInSequence
{
    /**
     * Reads the sequence and displays the number of local peaks. It keeps
     * the previous, current and next values; the first and last values are
     * never peaks.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter positive integers ending in 0:");
        int previous = keyboard.nextInt();

        if (previous == 0)
            System.out.println("Local peaks: 0");
        else
        {
            int current = keyboard.nextInt();
            int peaks = 0;

            while (current != 0)
            {
                int next = keyboard.nextInt();
                if (next != 0 && current > previous && current > next)
                    peaks++;
                previous = current;
                current = next;
            }

            System.out.println("Local peaks: " + peaks);
        }
        keyboard.close();
    }
}
