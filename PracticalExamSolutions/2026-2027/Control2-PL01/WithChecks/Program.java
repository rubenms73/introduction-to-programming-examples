/**
 * Solution to the second lab control, group PL-01, with data checks:
 * inserting an element into a new array and removing the consonants from
 * a text. Each method returns null when its data are not valid.
 *
 * The statement did not explicitly ask for all these checks: it said that
 * the data could be assumed to be valid, so the solution without checks
 * (../Program.java) is also complete. Checking the data, as explained in
 * the lab session, was a way of getting a better grade.
 */
public class Program
{
    /**
     * Inserts value at position index in a new array one position longer.
     * The elements before index keep their positions and the rest move
     * one position to the right. The original array does not change.
     *
     * @param values the original array
     * @param index the position for the new element, from 0 to values.length
     * @param value the value to insert
     * @return a new array with value inserted at index, or null if the
     *         data are not valid
     */
    public static int[] insertNew(int[] values, int index, int value)
    {
        // Invalid data: at most 100 elements, an index from 0 to the
        // length and values from -1000 to 1000
        if (values == null || values.length > 100 || index < 0 || index > values.length
                || value < -1000 || value > 1000)
            return null;
        for (int i = 0; i < values.length; i++)
            if (values[i] < -1000 || values[i] > 1000)
                return null;

        int[] result = new int[values.length + 1];
        // The elements before index keep their positions
        for (int i = 0; i < index; i++)
            result[i] = values[i];
        result[index] = value;
        // The elements from index on move one position to the right
        for (int i = index; i < values.length; i++)
            result[i + 1] = values[i];
        return result;
    }

    /**
     * Removes the consonants from a text: the letters A-Z and a-z that are
     * not vowels. Vowels, digits, spaces and punctuation are kept.
     *
     * @param text the text to process
     * @return a new string without the consonants, or null if the text
     *         is not valid
     */
    public static String removeConsonants(String text)
    {
        // Invalid text: at most 100 characters
        if (text == null || text.length() > 100)
            return null;

        String result = "";
        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            boolean letter = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
            boolean vowel = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
            // A consonant is a letter that is not a vowel; everything else is kept
            if (!letter || vowel)
                result += c;
        }
        return result;
    }

    /**
     * Prints the components of an array on one line.
     *
     * @param values the array to print
     */
    public static void printArray(int[] values)
    {
        for (int i = 0; i < values.length; i++)
            System.out.print(values[i] + " ");
        System.out.println();
    }

    /**
     * Tests both methods, showing the expected and the actual result.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        // Exercise 1: the example and the boundary cases
        // (inserting at the start, at the end and into an empty array)
        int[] values = {1, 2, 3};
        int[] result = insertNew(values, 1, 9);
        System.out.print("Expected 1 9 2 3, actual ");
        printArray(result);
        System.out.print("Original array: expected 1 2 3, actual ");
        printArray(values);
        System.out.println("New array: expected true, actual " + (result != values));
        System.out.print("Expected 9 1 2 3, actual ");
        printArray(insertNew(values, 0, 9));
        System.out.print("Expected 1 2 3 9, actual ");
        printArray(insertNew(values, 3, 9));
        System.out.print("Expected 5, actual ");
        printArray(insertNew(new int[] {}, 0, 5));
        System.out.print("Expected -1000 1000, actual ");
        printArray(insertNew(new int[] {-1000}, 1, 1000));

        // Exercise 1: invalid data
        System.out.println("Index -1: expected null, actual " + insertNew(values, -1, 9));
        System.out.println("Index 4: expected null, actual " + insertNew(values, 4, 9));
        System.out.println("Value 1001: expected null, actual " + insertNew(values, 1, 1001));
        System.out.println("Element 2000: expected null, actual " + insertNew(new int[] {1, 2000}, 0, 9));
        System.out.println("101 elements: expected null, actual " + insertNew(new int[101], 0, 9));

        // Exercise 2: the examples and the boundary cases
        System.out.println("Expected \"A ue oue\", actual \"" + removeConsonants("A blue house") + "\"");
        System.out.println("Expected \"aa 17!\", actual \"" + removeConsonants("Java 17!") + "\"");
        System.out.println("Expected \"\", actual \"" + removeConsonants("") + "\"");
        System.out.println("Expected \"\", actual \"" + removeConsonants("Rhythm") + "\"");
        System.out.println("Expected \"AEIOU aeiou\", actual \"" + removeConsonants("AEIOU aeiou") + "\"");

        // Exercise 2: invalid data (a text of 101 characters)
        String longText = "";
        for (int i = 0; i < 101; i++)
            longText += "a";
        System.out.println("101 characters: expected null, actual " + removeConsonants(longText));
    }
}
