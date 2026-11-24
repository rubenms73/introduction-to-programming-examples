/** Tests the ContactCard and Address classes. */
public class Main
{
    /**
     * Shows that the contact card keeps its own copy of the address.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Address address = new Address("1 Main Street", "Oviedo", "33001");
        ContactCard contact = new ContactCard("Alex", "alex@example.com", address);
        System.out.println(contact);
        address.setCity("Gijon");
        System.out.println("After changing the original address: " + contact.getAddress());
        Address copy = contact.getAddress();
        copy.setCity("Aviles");
        System.out.println("After changing the returned copy: " + contact.getAddress());
        contact.setAddress(copy);
        System.out.println("After explicitly updating the address: " + contact.getAddress());
    }
}
