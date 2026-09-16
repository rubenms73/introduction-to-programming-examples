public class Main
{
    public static void main(String[] args)
    {
        BankAccount first = new BankAccount("Alex", 100);
        BankAccount second = new BankAccount("Sam", 50);
        System.out.println("Deposit accepted: " + first.deposit(25));
        System.out.println("Transfer accepted: " + first.transferTo(second, 40));
        System.out.println(first);
        System.out.println(second);
        System.out.println("Excessive withdrawal accepted: " + first.withdraw(1000));
    }
}
