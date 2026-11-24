import java.util.Scanner;

/** Encrypts and decrypts a text with a Caesar cipher with shift 1. */
public class CaesarCipher
{
    /**
     * Reads a text and displays it encrypted and decrypted again.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Text: ");
        String text = keyboard.nextLine();

        String encrypted = encrypt(text);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypt(encrypted));
        keyboard.close();
    }

    /**
     * Replaces each letter with the next one in the alphabet. Other
     * characters do not change.
     *
     * @param text the text to encrypt
     * @return the encrypted text
     */
    public static String encrypt(String text)
    {
        String result = "";

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            // z and Z go back to the start of the alphabet.
            if (c == 'z')
                c = 'a';
            else if (c == 'Z')
                c = 'A';
            else if ((c >= 'a' && c < 'z') || (c >= 'A' && c < 'Z'))
                c++;
            result += c;
        }

        return result;
    }

    /**
     * Replaces each letter with the previous one in the alphabet. Other
     * characters do not change.
     *
     * @param text the text to decrypt
     * @return the decrypted text
     */
    public static String decrypt(String text)
    {
        String result = "";

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            // a and A go to the end of the alphabet.
            if (c == 'a')
                c = 'z';
            else if (c == 'A')
                c = 'Z';
            else if ((c > 'a' && c <= 'z') || (c > 'A' && c <= 'Z'))
                c--;
            result += c;
        }

        return result;
    }
}
