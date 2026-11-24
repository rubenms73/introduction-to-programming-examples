import java.util.Scanner;

/**
 * Says whether a value appears in an integer array.
 */
public class LinearSearchBreak
{
    public static int[] readIntArray(Scanner keyboard)
    {
        System.out.print("Array size: ");
        int size = keyboard.nextInt();

        int[] values = new int[size];
        System.out.print("Components: ");
        for (int i = 0; i < values.length; i++)
            values[i] = keyboard.nextInt();
        return values;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int[] v = readIntArray(keyboard);
        System.out.print("Value to search for: ");
        int number = keyboard.nextInt();

        int i = 0;

        while (i < v.length)
        {
            if (v[i] == number)
                break;
            i++;
        }

        if (i < v.length)
            System.out.printf("%d is in the array\n", number);
        else
            System.out.printf("%d is not in the array\n", number);
        keyboard.close();
    }
}
