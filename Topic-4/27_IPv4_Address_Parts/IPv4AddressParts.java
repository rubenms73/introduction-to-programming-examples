import java.util.Scanner;

/** Checks an IPv4 address and extracts its four parts. */
public class IPv4AddressParts
{
    /**
     * Reads an address and prints its parts or says that it is invalid.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("IPv4 address: ");
        String address = keyboard.nextLine();

        int[] parts = parseIPv4(address);
        if (parts == null)
            System.out.println("Invalid IPv4 address");
        else
            for (int i = 0; i < parts.length; i++)
                System.out.println(parts[i]);
        keyboard.close();
    }

    /**
     * Extracts the four parts of an address such as "192.168.1.10". Each
     * part must have from 1 to 3 digits and a value up to 255.
     *
     * @param address the address
     * @return an array with the four parts, or null if the address is not
     * valid
     */
    public static int[] parseIPv4(String address)
    {
        int[] parts = new int[4];
        int partIndex = 0;
        int value = 0;
        int digits = 0;

        for (int i = 0; i < address.length(); i++)
        {
            char c = address.charAt(i);
            if (c == '.')
            {
                // A dot closes the current part, which cannot be empty or the fourth one.
                if (digits == 0 || partIndex == 3)
                    return null;
                parts[partIndex] = value;
                partIndex++;
                value = 0;
                digits = 0;
            }
            else if (c >= '0' && c <= '9')
            {
                value = value * 10 + (c - '0');
                digits++;
                if (digits > 3 || value > 255)
                    return null;
            }
            else
                return null;
        }

        // The last part has no dot after it.
        if (digits == 0 || partIndex != 3)
            return null;
        parts[3] = value;
        return parts;
    }
}
