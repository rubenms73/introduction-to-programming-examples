import java.util.Scanner;

public class CaesarCipher
{
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
