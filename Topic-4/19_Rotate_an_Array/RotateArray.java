import java.util.Scanner;

/** Rotates an array one position to the right. */
public class RotateArray
{
    /**
     * Reads an array, rotates it and prints it.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Size: ");
        int size = keyboard.nextInt();
        int[] values = new int[size];

        for (int i = 0; i < values.length; i++)
        {
            System.out.print("Value " + i + ": ");
            values[i] = keyboard.nextInt();
        }

        rotateRight(values);
        for (int i = 0; i < values.length; i++)
            System.out.println(values[i]);
        keyboard.close();
    }

    /**
     * Moves each element one position to the right; the last element goes
     * to the first position. The array is changed in place.
     *
     * @param values the array to rotate
     */
    public static void rotateRight(int[] values)
    {
        if (values.length > 1)
        {
            int last = values[values.length - 1];
            for (int i = values.length - 1; i > 0; i--)
                values[i] = values[i - 1];
            values[0] = last;
        }
    }
}
