import java.util.Scanner;

/** Compresses a text with run-length encoding. */
public class RunLengthEncoding
{
    /**
     * Reads a text and displays it encoded.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Text: ");
        String text = keyboard.nextLine();

        System.out.println(encode(text));
        keyboard.close();
    }

    /**
     * Replaces each run of equal characters with the character and the
     * length of the run ("aaabcc" gives "a3b1c2").
     *
     * @param text the text
     * @return the encoded text
     */
    public static String encode(String text)
    {
        if (text.length() == 0)
            return "";

        String result = "";
        char current = text.charAt(0);
        int count = 1;

        for (int i = 1; i < text.length(); i++)
            if (text.charAt(i) == current)
                count++;
            else
            {
                result = result + current + count;
                current = text.charAt(i);
                count = 1;
            }

        result = result + current + count;
        return result;
    }
}
