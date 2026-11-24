/**
 * A bank account with a holder and a balance that is never negative.
 * The constructor arguments must satisfy the preconditions of the
 * exercise. Invalid setter values leave the previous valid state
 * unchanged.
 */
public class BankAccount
{
    /** The name of the holder. */
    private String holder;

    /** The balance in euros, never negative. */
    private double balance;

    /**
     * Creates an account.
     *
     * @param holder the name of the holder, not null or empty
     * @param initialBalance the initial balance, not negative
     */
    public BankAccount(String holder, double initialBalance)
    {
        setHolder(holder);
        setBalance(initialBalance);
    }

    /**
     * Returns the name of the holder.
     *
     * @return the name of the holder
     */
    public String getHolder()
    {
        return holder;
    }

    /**
     * Changes the holder. A null or empty name is ignored.
     *
     * @param holder the new holder
     */
    public void setHolder(String holder)
    {
        if (holder != null && holder.length() > 0)
            this.holder = holder;
    }

    /**
     * Returns the balance.
     *
     * @return the balance in euros
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * Changes the balance. A negative balance is ignored.
     *
     * @param balance the new balance
     */
    public void setBalance(double balance)
    {
        if (balance >= 0)
            this.balance = balance;
    }

    /**
     * Adds money to the account.
     *
     * @param amount the amount to deposit; it must be positive
     * @return true if the deposit was made, false otherwise
     */
    public boolean deposit(double amount)
    {
        if (amount <= 0)
            return false;
        balance += amount;
        return true;
    }

    /**
     * Takes money out of the account if there is enough balance.
     *
     * @param amount the amount to withdraw; it must be positive
     * @return true if the withdrawal was made, false otherwise
     */
    public boolean withdraw(double amount)
    {
        if (amount <= 0 || amount > balance)
            return false;
        balance -= amount;
        return true;
    }

    /**
     * Moves money from this account to another one. The deposit is made
     * only if the withdrawal succeeds.
     *
     * @param other the destination account
     * @param amount the amount to transfer
     * @return true if the transfer was made, false otherwise
     */
    public boolean transferTo(BankAccount other, double amount)
    {
        if (other == null || !withdraw(amount))
            return false;
        other.deposit(amount);
        return true;
    }

    /**
     * Returns the holder and the balance, for example "Alex: 85.0 euro".
     *
     * @return the text that represents the account
     */
    @Override public String toString()
    {
        return holder + ": " + balance + " euro";
    }
}
