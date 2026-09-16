/** Constructor arguments must satisfy the exercise preconditions.
 * Invalid setter values leave the previous valid state unchanged. */
public class BankAccount {
    private String holder;
    private double balance;

    public BankAccount(String holder, double initialBalance) {
        setHolder(holder);
        setBalance(initialBalance);
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        if (holder != null && holder.length() > 0) {
            this.holder = holder;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean transferTo(BankAccount other, double amount) {
        if (other == null || !withdraw(amount)) {
            return false;
        }
        other.deposit(amount);
        return true;
    }

    @Override
    public String toString() {
        return holder + ": " + balance + " euro";
    }
}
