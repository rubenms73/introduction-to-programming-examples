import java.util.Scanner;

/** Reverses the order of the words of a sentence. */
public class ReverseWords
{
    /**
     * Reads a sentence and displays it with its words in reverse order.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Sentence: ");
        String sentence = keyboard.nextLine();

        System.out.println(reverseWords(sentence));
        keyboard.close();
    }

    /**
     * Joins the words of a text from the last to the first, separated by
     * one space.
     *
     * @param text the text
     * @return the words of text in reverse order
     */
    public static String reverseWords(String text)
    {
        String[] words = splitIntoWords(text);
        String result = "";

        for (int i = words.length - 1; i >= 0; i--)
        {
            result += words[i];
            if (i > 0)
                result += " ";
        }

        return result;
    }

    /**
     * Splits a text into words. Each iteration skips the spaces and then
     * copies the characters up to the next space.
     *
     * @param text the text
     * @return an array with the words of text
     */
    public static String[] splitIntoWords(String text)
    {
        String[] words = new String[countWords(text)];
        int position = 0;
        int i = 0;

        while (i < text.length())
        {
            while (i < text.length() && text.charAt(i) == ' ')
                i++;

            if (i < text.length())
            {
                int start = i;
                while (i < text.length() && text.charAt(i) != ' ')
                    i++;
                String word = "";
                for (int j = start; j < i; j++)
                    word = word + text.charAt(j);
                words[position] = word;
                position++;
            }
        }

        return words;
    }

    /**
     * Counts the words of a text: a word starts at each character that is
     * not a space and comes after a space or at the start.
     *
     * @param text the text
     * @return the number of words
     */
    public static int countWords(String text)
    {
        int count = 0;
        boolean insideWord = false;

        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ')
                insideWord = false;
            else if (!insideWord)
            {
                count++;
                insideWord = true;
            }

        return count;
    }
}
