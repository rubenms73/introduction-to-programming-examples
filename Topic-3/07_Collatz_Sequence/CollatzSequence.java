import java.util.Scanner;

/** Prints the Collatz sequence of a positive number. */
public class CollatzSequence
{
    /**
     * Reads the number and prints its sequence until it reaches 1: even
     * numbers are halved and odd numbers become 3n + 1. Then it displays the
     * number of steps.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number: ");
        long number = keyboard.nextLong();

        if (number <= 0)
            System.out.println("The number must be positive");
        else
        {
            int steps = 0;
            System.out.print(number);

            while (number != 1)
            {
                if (number % 2 == 0)
                    number = number / 2;
                else
                    number = number * 3 + 1;
                steps++;
                System.out.print(" " + number);
            }

            System.out.printf("\nSteps: %d\n", steps);
        }
        keyboard.close();
    }
}
