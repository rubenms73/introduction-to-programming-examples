import java.util.Scanner;

/**
 * Finds the longest run of equal consecutive values in a sequence that
 * ends with 0.
 */
public class LongestRunInSequence
{
    /**
     * Reads the sequence and displays the length of its longest run.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter positive integers ending in 0:");
        int value = keyboard.nextInt();

        if (value == 0)
            System.out.println("Empty sequence");
        else
        {
            int previous = value;
            int currentRun = 1;
            int bestRun = 1;

            value = keyboard.nextInt();
            while (value != 0)
            {
                if (value == previous)
                    currentRun++;
                else
                    currentRun = 1;

                if (currentRun > bestRun)
                    bestRun = currentRun;

                previous = value;
                value = keyboard.nextInt();
            }

            System.out.println("Longest run: " + bestRun);
        }
        keyboard.close();
    }
}
