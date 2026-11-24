import java.util.Scanner;

/** Splits a sentence into the words separated by spaces. */
public class SplitIntoWords
{
    /**
     * Reads a sentence and prints its words, one per line.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Sentence: ");
        String sentence = keyboard.nextLine();

        String[] words = splitIntoWords(sentence);
        for (int i = 0; i < words.length; i++)
            System.out.println(words[i]);
        keyboard.close();
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
