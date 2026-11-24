/**
 * Laboratory Control 2, PL-02: removeFixed and randomCode.
 */
public class Program
{
    // Exercise 1: shifts the elements after index one position to the left
    // and puts fillValue in the last position. It changes the array itself.
    public static int[] removeFixed(int[] values, int index, int fillValue)
    {
        for (int i = index; i < values.length - 1; i++)
        {
            values[i] = values[i + 1];
        }
        values[values.length - 1] = fillValue;
        return values;
    }

    // Exercise 2: uppercase letters at even indexes and digits at odd indexes
    public static String randomCode(int length)
    {
        String result = "";
        for (int i = 0; i < length; i++)
        {
            if (i % 2 == 0)
                result += (char) ('A' + (int) (Math.random() * 26));
            else
                result += (char) ('0' + (int) (Math.random() * 10));
        }
        return result;
    }

    // Prints an array as [a, b, c]
    public static void show(int[] values)
    {
        System.out.print("[");
        for (int i = 0; i < values.length; i++)
        {
            if (i > 0)
                System.out.print(", ");
            System.out.print(values[i]);
        }
        System.out.println("]");
    }

    // Checks the stated properties of a random code
    public static boolean isValidCode(String code, int length)
    {
        if (code.length() != length)
            return false;
        for (int i = 0; i < code.length(); i++)
        {
            char c = code.charAt(i);
            if (i % 2 == 0)
            {
                if (c < 'A' || c > 'Z')
                    return false;
            }
            else if (c < '0' || c > '9')
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        // Exercise 1
        int[] original = {4, 7, 2, 9};
        int[] result = removeFixed(original, 1, 0);
        System.out.print("Expected [4, 2, 9, 0], actual ");
        show(result);
        System.out.print("Original array: expected [4, 2, 9, 0], actual ");
        show(original);
        System.out.println("Same reference: expected true, actual " + (result == original));
        System.out.print("One element: expected [-1], actual ");
        show(removeFixed(new int[] {8}, 0, -1));
        System.out.print("Last index: expected [1, 2, 7], actual ");
        show(removeFixed(new int[] {1, 2, 3}, 2, 7));

        // Exercise 2: the output varies, so we check its properties
        System.out.println("Example of length 5: " + randomCode(5));
        System.out.println("Length 0 is empty: expected true, actual " + randomCode(0).equals(""));
        System.out.println("Length 1 valid: expected true, actual " + isValidCode(randomCode(1), 1));
        System.out.println("Length 5 valid: expected true, actual " + isValidCode(randomCode(5), 5));
        System.out.println("Length 100 valid: expected true, actual " + isValidCode(randomCode(100), 100));
    }
}
