import java.util.Arrays;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 2, 2, 5, 7, 7};
        int[] result = removeDuplicates(values);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] values) {
        if (values.length == 0) {
            return new int[0];
        }

        int different = 1;
        for (int i = 1; i < values.length; i++) {
            if (values[i] != values[i - 1]) {
                different++;
            }
        }

        int[] result = new int[different];
        result[0] = values[0];
        int position = 1;

        for (int i = 1; i < values.length; i++) {
            if (values[i] != values[i - 1]) {
                result[position] = values[i];
                position++;
            }
        }

        return result;
    }
}
