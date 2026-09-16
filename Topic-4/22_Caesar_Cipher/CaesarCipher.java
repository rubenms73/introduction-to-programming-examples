import java.util.Scanner;

public class CaesarCipher
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Text: ");
        String text = in.nextLine();
        System.out.print("Shift: ");
        int shift = in.nextInt();

        System.out.println(encrypt(text, shift));
    }

    public static String encrypt(String text, int shift)
    {
        String result = "";
        int normalisedShift = ((shift % 26) + 26) % 26;

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z')
                c = (char)('a' + (c - 'a' + normalisedShift) % 26);
            else if (c >= 'A' && c <= 'Z')
                c = (char)('A' + (c - 'A' + normalisedShift) % 26);
            result += c;
        }

        return result;
    }
}
