/**
 * The rules that a password must follow: a minimum length and,
 * optionally, an uppercase letter, a lowercase letter and a digit.
 * The constructor arguments must satisfy the preconditions of the
 * exercise. Invalid setter values leave the previous valid state
 * unchanged.
 */
public class PasswordPolicy
{
    /** The minimum length, not negative. */
    private int minimumLength;

    /** Whether an uppercase letter is required. */
    private boolean uppercaseRequired;

    /** Whether a lowercase letter is required. */
    private boolean lowercaseRequired;

    /** Whether a digit is required. */
    private boolean digitRequired;

    /**
     * Creates a policy.
     *
     * @param minimumLength the minimum length, not negative
     * @param uppercaseRequired whether an uppercase letter is required
     * @param lowercaseRequired whether a lowercase letter is required
     * @param digitRequired whether a digit is required
     */
    public PasswordPolicy(int minimumLength, boolean uppercaseRequired, boolean lowercaseRequired,
                          boolean digitRequired)
    {
        setMinimumLength(minimumLength);
        this.uppercaseRequired = uppercaseRequired;
        this.lowercaseRequired = lowercaseRequired;
        this.digitRequired = digitRequired;
    }

    /**
     * Returns the minimum length.
     *
     * @return the minimum length
     */
    public int getMinimumLength()
    {
        return minimumLength;
    }

    /**
     * Changes the minimum length. A negative value is ignored.
     *
     * @param minimumLength the new minimum length
     */
    public void setMinimumLength(int minimumLength)
    {
        if (minimumLength >= 0)
            this.minimumLength = minimumLength;
    }

    /**
     * Says whether an uppercase letter is required.
     *
     * @return true if an uppercase letter is required
     */
    public boolean isUppercaseRequired()
    {
        return uppercaseRequired;
    }

    /**
     * Changes whether an uppercase letter is required.
     *
     * @param uppercaseRequired the new value of the rule
     */
    public void setUppercaseRequired(boolean uppercaseRequired)
    {
        this.uppercaseRequired = uppercaseRequired;
    }

    /**
     * Says whether a lowercase letter is required.
     *
     * @return true if a lowercase letter is required
     */
    public boolean isLowercaseRequired()
    {
        return lowercaseRequired;
    }

    /**
     * Changes whether a lowercase letter is required.
     *
     * @param lowercaseRequired the new value of the rule
     */
    public void setLowercaseRequired(boolean lowercaseRequired)
    {
        this.lowercaseRequired = lowercaseRequired;
    }

    /**
     * Says whether a digit is required.
     *
     * @return true if a digit is required
     */
    public boolean isDigitRequired()
    {
        return digitRequired;
    }

    /**
     * Changes whether a digit is required.
     *
     * @param digitRequired the new value of the rule
     */
    public void setDigitRequired(boolean digitRequired)
    {
        this.digitRequired = digitRequired;
    }

    /**
     * Checks a password. The loop notes which kinds of characters appear;
     * then each required kind must be present.
     *
     * @param password the password to check
     * @return true if the password follows every rule, false otherwise or
     * if it is null
     */
    public boolean isValid(String password)
    {
        if (password == null || password.length() < minimumLength)
            return false;

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++)
        {
            char c = password.charAt(i);
            if (c >= 'A' && c <= 'Z')
                hasUppercase = true;
            else if (c >= 'a' && c <= 'z')
                hasLowercase = true;
            else if (c >= '0' && c <= '9')
                hasDigit = true;
        }

        return (!uppercaseRequired || hasUppercase) && (!lowercaseRequired || hasLowercase) &&
                (!digitRequired || hasDigit);
    }

    /**
     * Returns the rules of the policy.
     *
     * @return the text that represents the policy
     */
    @Override public String toString()
    {
        return "PasswordPolicy[length >= " + minimumLength + ", uppercase=" + uppercaseRequired +
                ", lowercase=" + lowercaseRequired + ", digit=" + digitRequired + "]";
    }
}
