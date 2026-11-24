/** Removes the consecutive repeated values of an array. */
public class RemoveConsecutiveDuplicates
{
    /**
     * Removes the duplicates of an example array and prints the result.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        int[] values = {1, 1, 2, 2, 2, 5, 7, 7};
        int[] result = removeDuplicates(values);
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }

    /**
     * Builds a new array without consecutive repeated values. A first pass
     * counts the values that differ from the previous one, to know the
     * size of the result.
     *
     * @param values the original array
     * @return a new array without consecutive duplicates
     */
    public static int[] removeDuplicates(int[] values)
    {
        if (values.length == 0)
            return new int[0];

        int different = 1;
        for (int i = 1; i < values.length; i++)
            if (values[i] != values[i - 1])
                different++;

        int[] result = new int[different];
        result[0] = values[0];
        int position = 1;

        for (int i = 1; i < values.length; i++)
            if (values[i] != values[i - 1])
            {
                result[position] = values[i];
                position++;
            }

        return result;
    }
}
