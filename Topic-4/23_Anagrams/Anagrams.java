import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("First word: ");
        String first = in.nextLine();
        System.out.print("Second word: ");
        String second = in.nextLine();

        if (areAnagrams(first, second)) {
            System.out.println("They are anagrams");
        } else {
            System.out.println("They are not anagrams");
        }
    }

    public static boolean areAnagrams(String first, String second) {

        int[] counts = new int[26];

        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + ('a' - 'A'));
            }
            if (c < 'a' || c > 'z') {
                return false;
            }
            counts[c - 'a']++;
        }

        for (int i = 0; i < second.length(); i++) {
            char c = second.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + ('a' - 'A'));
            }
            if (c < 'a' || c > 'z') {
                return false;
            }
            counts[c - 'a']--;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
