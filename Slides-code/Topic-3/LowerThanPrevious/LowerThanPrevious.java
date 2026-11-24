import java.util.Scanner;

/**
 * Counts how many numbers are lower than the previous one.
 * The sequence ends with 0.
 */
public class LowerThanPrevious
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Numbers (0 to finish): ");
        int count = 0;
        int previous = keyboard.nextInt();
        if (previous != 0)
        {
            int current = keyboard.nextInt();
            while (current != 0)
            {
                if (current < previous)
                    count++;
                previous = current;
                current = keyboard.nextInt();
            }
        }
        System.out.printf("Count: %d\n", count);
        keyboard.close();
    }
}
