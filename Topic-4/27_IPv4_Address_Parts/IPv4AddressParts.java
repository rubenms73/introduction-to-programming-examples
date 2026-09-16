import java.util.Scanner;

public class IPv4AddressParts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("IPv4 address: ");
        String address = in.nextLine();

        int[] parts = parseIPv4(address);
        if (parts == null) {
            System.out.println("Invalid IPv4 address");
        } else {
            for (int i = 0; i < parts.length; i++) {
                System.out.println(parts[i]);
            }
        }
    }

    public static int[] parseIPv4(String address) {
        int[] parts = new int[4];
        int partIndex = 0;
        int partStart = 0;

        for (int i = 0; i <= address.length(); i++) {
            if (i == address.length() || address.charAt(i) == '.') {
                if (partIndex == parts.length) {
                    return null;
                }

                int value = parsePart(address, partStart, i);
                if (value < 0) {
                    return null;
                }

                parts[partIndex] = value;
                partIndex++;
                partStart = i + 1;
            }
        }

        if (partIndex != parts.length) {
            return null;
        }

        return parts;
    }

    public static int parsePart(String text, int start, int end) {
        if (start == end || end - start > 3) {
            return -1;
        }

        int value = 0;
        for (int i = start; i < end; i++) {
            char c = text.charAt(i);
            if (c < '0' || c > '9') {
                return -1;
            }
            value = value * 10 + (c - '0');
        }

        if (value > 255) {
            return -1;
        }

        return value;
    }
}
