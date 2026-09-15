import java.util.Scanner;

public class MinimumChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] values = {50000, 20000, 10000, 5000, 2000, 1000, 500,
                200, 100, 50, 20, 10, 5, 2, 1};
        String[] names = {"500 euro notes", "200 euro notes", "100 euro notes",
                "50 euro notes", "20 euro notes", "10 euro notes",
                "5 euro notes", "2 euro coins", "1 euro coins",
                "50 cent coins", "20 cent coins", "10 cent coins",
                "5 cent coins", "2 cent coins", "1 cent coins"};

        System.out.print("Amount in cents: ");
        int amount = in.nextInt();

        for (int i = 0; i < values.length; i++) {
            int units = amount / values[i];
            amount = amount % values[i];
            if (units > 0) {
                System.out.printf("%d %s%n", units, names[i]);
            }
        }
    }
}
