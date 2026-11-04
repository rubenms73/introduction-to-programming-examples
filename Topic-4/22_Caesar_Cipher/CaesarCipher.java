import java.util.Scanner;

public class CaesarCipher
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Text: ");
        String text = keyboard.nextLine();
        System.out.print("Shift: ");
        int shift = keyboard.nextInt();

        System.out.println(encrypt(text, shift));
        keyboard.close();
    }

    public static String encrypt(String text, int shift)
    {
        String result = "";
        // Turn any shift into an equivalent one between 0 and 25.
        // In Java, % keeps the sign, so -1 % 26 is -1: adding 26 gives 25.
        int normalisedShift = shift % 26;
        if (normalisedShift < 0)
            normalisedShift += 26;

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
