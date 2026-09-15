public class PasswordPolicy {
    private int minimumLength;
    private boolean requireUppercase;
    private boolean requireLowercase;
    private boolean requireDigit;

    public PasswordPolicy(int minimumLength, boolean requireUppercase,
            boolean requireLowercase, boolean requireDigit) {
        setMinimumLength(minimumLength);
        this.requireUppercase = requireUppercase;
        this.requireLowercase = requireLowercase;
        this.requireDigit = requireDigit;
    }

    public int getMinimumLength() {
        return minimumLength;
    }

    public void setMinimumLength(int minimumLength) {
        if (minimumLength >= 0) {
            this.minimumLength = minimumLength;
        }
    }

    public boolean isRequireUppercase() {
        return requireUppercase;
    }

    public void setRequireUppercase(boolean requireUppercase) {
        this.requireUppercase = requireUppercase;
    }

    public boolean isRequireLowercase() {
        return requireLowercase;
    }

    public void setRequireLowercase(boolean requireLowercase) {
        this.requireLowercase = requireLowercase;
    }

    public boolean isRequireDigit() {
        return requireDigit;
    }

    public void setRequireDigit(boolean requireDigit) {
        this.requireDigit = requireDigit;
    }

    public boolean isValid(String password) {
        if (password == null || password.length() < minimumLength) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return (!requireUppercase || hasUppercase)
                && (!requireLowercase || hasLowercase)
                && (!requireDigit || hasDigit);
    }

    @Override
    public String toString() {
        return String.format(
                "PasswordPolicy[length >= %d, uppercase=%b, lowercase=%b, digit=%b]",
                minimumLength, requireUppercase, requireLowercase, requireDigit);
    }
}
