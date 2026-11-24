public class Program
{
    // Shifts the elements after index one position to the left and puts
    // fillValue in the last position. It changes the array it receives,
    // so it returns the same reference.
    public static int[] removeFixed(int[] values, int index, int fillValue)
    {
        for (int i = index; i < values.length - 1; i++)
            values[i] = values[i + 1];
        values[values.length - 1] = fillValue;
        return values;
    }

    // Even positions get a random letter and odd positions a random digit.
    // Math.random() * 26 is in [0, 26), so the cast gives 0..25, and
    // adding it to 'A' gives a letter from 'A' to 'Z'.
    public static String randomCode(int length)
    {
        String code = "";
        for (int i = 0; i < length; i++)
            if (i % 2 == 0)
                code += (char) ('A' + (int) (Math.random() * 26));
            else
                code += (char) ('0' + (int) (Math.random() * 10));
        return code;
    }

    // Prints the components of an array on one line
    public static void printArray(int[] values)
    {
        for (int i = 0; i < values.length; i++)
            System.out.print(values[i] + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        // Exercise 1: the example and the boundary cases
        // (one element and the last index)
        int[] values = {4, 7, 2, 9};
        int[] result = removeFixed(values, 1, 0);
        System.out.print("Expected 4 2 9 0, actual ");
        printArray(result);
        System.out.println("Same array: expected true, actual " + (result == values));
        System.out.print("Expected -1, actual ");
        printArray(removeFixed(new int[] {8}, 0, -1));
        System.out.print("Expected 1 2 7, actual ");
        printArray(removeFixed(new int[] {1, 2, 3}, 2, 7));

        // Exercise 2: the codes are random, so we check that they
        // have the right length and alternate letters and digits
        System.out.println("Length 0: expected an empty code, actual \"" + randomCode(0) + "\"");
        System.out.println("Length 1: expected a letter, actual " + randomCode(1));
        System.out.println("Length 5: expected letter-digit-letter-digit-letter, actual " + randomCode(5));
    }
}
