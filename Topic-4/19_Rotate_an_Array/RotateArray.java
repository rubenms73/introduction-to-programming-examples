import java.util.Scanner;

public class RotateArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Size: ");
        int size = in.nextInt();
        int[] values = new int[size];

        for (int i = 0; i < values.length; i++)
        {
            System.out.print("Value " + i + ": ");
            values[i] = in.nextInt();
        }

        rotateRight(values);
        for (int i = 0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }
    }

    public static void rotateRight(int[] values)
    {
        if (values.length > 1)
        {
            int last = values[values.length - 1];
            for (int i = values.length - 1; i > 0; i--)
            {
                values[i] = values[i - 1];
            }
            values[0] = last;
        }
    }
}
