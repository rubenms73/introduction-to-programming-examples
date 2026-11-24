/** Tests the PasswordPolicy class. */
public class Main
{
    /**
     * Creates a policy and checks three passwords.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        PasswordPolicy policy = new PasswordPolicy(8, true, true, true);
        System.out.println(policy);
        System.out.println("Abcdefg1: " + policy.isValid("Abcdefg1"));
        System.out.println("abcdefgh: " + policy.isValid("abcdefgh"));
        System.out.println("Ab1: " + policy.isValid("Ab1"));
    }
}
