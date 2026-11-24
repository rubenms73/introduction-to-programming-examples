import java.util.Scanner;

/**
 * Says whether a value appears in an integer array, using a method.
 */
public class LinearSearchReturn
{
    /**
     * Reads the size of an array and then its components.
     *
     * @param keyboard the scanner to read from
     * @return a new array with the values read
     */
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

    /**
     * Searches for a value in an array, from the first position to the last.
     *
     * @param values the array to search
     * @param number the value to search for
     * @return true if number is in values, false otherwise
     */
    public static boolean linearSearch(int[] values, int number)
    {
        int i = 0;
        while (i < values.length)
        {
            if (values[i] == number)
                return true;
            i++;
        }
        return false;
    }

    /**
     * Reads an array and a value and says whether the value is in the array.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int[] v = readIntArray(keyboard);
        System.out.print("Value to search for: ");
        int number = keyboard.nextInt();

        if (linearSearch(v, number))
            System.out.printf("%d is in the array\n", number);
        else
            System.out.printf("%d is not in the array\n", number);
        keyboard.close();
    }
}
