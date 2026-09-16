/** Constructor arguments must satisfy the exercise preconditions.
 * Invalid setter values leave the previous valid state unchanged. */
public class ContactCard
{
    private String name;
    private String email;
    private Address address;

    public ContactCard(String name, String email, Address address)
    {
        setName(name);
        setEmail(email);
        setAddress(address);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (name != null && name.length() > 0)
            this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        if (email != null && email.length() > 0)
            this.email = email;
    }

    public Address getAddress()
    {
        return new Address(address);
    }

    public void setAddress(Address address)
    {
        if (address != null)
            this.address = new Address(address);
    }

    @Override public boolean equals(Object object)
    {
        if (this == object)
            return true;
        if (!(object instanceof ContactCard))
            return false;
        ContactCard other = (ContactCard)object;
        return email != null && email.equals(other.email);
    }

    @Override public int hashCode()
    {
        return email.hashCode();
    }

    @Override public String toString()
    {
        return name + " <" + email + ">\n" + address;
    }
}
