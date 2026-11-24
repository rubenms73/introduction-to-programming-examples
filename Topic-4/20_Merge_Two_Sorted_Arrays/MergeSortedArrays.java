/** Merges two sorted arrays into a new sorted array. */
public class MergeSortedArrays
{
    /**
     * Merges two example arrays and prints the result.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        int[] a = {1, 4, 8};
        int[] b = {2, 3, 9};

        int[] merged = merge(a, b);
        for (int i = 0; i < merged.length; i++)
            System.out.println(merged[i]);
    }

    /**
     * Merges two sorted arrays. At each step the smaller of the two current
     * elements is copied; when one array runs out, the rest of the other is
     * copied.
     *
     * @param a a sorted array
     * @param b a sorted array
     * @return a new sorted array with the elements of a and b
     */
    public static int[] merge(int[] a, int[] b)
    {
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length)
        {
            if (a[i] <= b[j])
            {
                result[k] = a[i];
                i++;
            }
            else
            {
                result[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length)
        {
            result[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length)
        {
            result[k] = b[j];
            j++;
            k++;
        }

        return result;
    }
}
