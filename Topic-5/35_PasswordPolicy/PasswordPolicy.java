/** Constructor arguments must satisfy the exercise preconditions.
 * Invalid setter values leave the previous valid state unchanged. */
public class PasswordPolicy
{
    private int minimumLength;
    private boolean uppercaseRequired;
    private boolean lowercaseRequired;
    private boolean digitRequired;

    public PasswordPolicy(int minimumLength, boolean uppercaseRequired, boolean lowercaseRequired,
                          boolean digitRequired)
    {
        setMinimumLength(minimumLength);
        this.uppercaseRequired = uppercaseRequired;
        this.lowercaseRequired = lowercaseRequired;
        this.digitRequired = digitRequired;
    }

    public int getMinimumLength()
    {
        return minimumLength;
    }

    public void setMinimumLength(int minimumLength)
    {
        if (minimumLength >= 0)
            this.minimumLength = minimumLength;
    }

    public boolean isUppercaseRequired()
    {
        return uppercaseRequired;
    }

    public void setUppercaseRequired(boolean uppercaseRequired)
    {
        this.uppercaseRequired = uppercaseRequired;
    }

    public boolean isLowercaseRequired()
    {
        return lowercaseRequired;
    }

    public void setLowercaseRequired(boolean lowercaseRequired)
    {
        this.lowercaseRequired = lowercaseRequired;
    }

    public boolean isDigitRequired()
    {
        return digitRequired;
    }

    public void setDigitRequired(boolean digitRequired)
    {
        this.digitRequired = digitRequired;
    }

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

    @Override public String toString()
    {
        return "PasswordPolicy[length >= " + minimumLength + ", uppercase=" + uppercaseRequired +
                ", lowercase=" + lowercaseRequired + ", digit=" + digitRequired + "]";
    }
}
