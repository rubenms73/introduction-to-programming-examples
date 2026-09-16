public class Main
{
    public static void main(String[] args)
    {
        PasswordPolicy policy = new PasswordPolicy(8, true, true, true);
        System.out.println(policy);
        System.out.println("Abcdefg1: " + policy.isValid("Abcdefg1"));
        System.out.println("abcdefgh: " + policy.isValid("abcdefgh"));
        System.out.println("Ab1: " + policy.isValid("Ab1"));
    }
}
