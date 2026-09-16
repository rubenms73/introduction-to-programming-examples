import java.util.Scanner;

public class MinimumChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Amount in cents: ");
        int amount = in.nextInt();

        int notes500 = amount / 50000;
        amount = amount % 50000;
        int notes200 = amount / 20000;
        amount = amount % 20000;
        int notes100 = amount / 10000;
        amount = amount % 10000;
        int notes50 = amount / 5000;
        amount = amount % 5000;
        int notes20 = amount / 2000;
        amount = amount % 2000;
        int notes10 = amount / 1000;
        amount = amount % 1000;
        int notes5 = amount / 500;
        amount = amount % 500;
        int coins2Euro = amount / 200;
        amount = amount % 200;
        int coins1Euro = amount / 100;
        amount = amount % 100;
        int coins50Cent = amount / 50;
        amount = amount % 50;
        int coins20Cent = amount / 20;
        amount = amount % 20;
        int coins10Cent = amount / 10;
        amount = amount % 10;
        int coins5Cent = amount / 5;
        amount = amount % 5;
        int coins2Cent = amount / 2;
        amount = amount % 2;
        int coins1Cent = amount;

        System.out.println("500 euro notes: " + notes500);
        System.out.println("200 euro notes: " + notes200);
        System.out.println("100 euro notes: " + notes100);
        System.out.println("50 euro notes: " + notes50);
        System.out.println("20 euro notes: " + notes20);
        System.out.println("10 euro notes: " + notes10);
        System.out.println("5 euro notes: " + notes5);
        System.out.println("2 euro coins: " + coins2Euro);
        System.out.println("1 euro coins: " + coins1Euro);
        System.out.println("50 cent coins: " + coins50Cent);
        System.out.println("20 cent coins: " + coins20Cent);
        System.out.println("10 cent coins: " + coins10Cent);
        System.out.println("5 cent coins: " + coins5Cent);
        System.out.println("2 cent coins: " + coins2Cent);
        System.out.println("1 cent coins: " + coins1Cent);
    }
}
