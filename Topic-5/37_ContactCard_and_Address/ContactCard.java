/**
 * A contact with a name, an email and an address. The card keeps its own
 * copy of the address, so changes to the original object or to the
 * returned copies do not affect it.
 * The constructor arguments must satisfy the preconditions of the
 * exercise. Invalid setter values leave the previous valid state
 * unchanged.
 */
public class ContactCard
{
    /** The name of the contact. */
    private String name;

    /** The email, which identifies the contact. */
    private String email;

    /** The address; it is a copy that only this card uses. */
    private Address address;

    /**
     * Creates a contact card.
     *
     * @param name the name, not null or empty
     * @param email the email, not null or empty
     * @param address the address, not null; it is copied
     */
    public ContactCard(String name, String email, Address address)
    {
        setName(name);
        setEmail(email);
        setAddress(address);
    }

    /**
     * Returns the name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Changes the name. A null or empty value is ignored.
     *
     * @param name the new name
     */
    public void setName(String name)
    {
        if (name != null && name.length() > 0)
            this.name = name;
    }

    /**
     * Returns the email.
     *
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Changes the email. A null or empty value is ignored.
     *
     * @param email the new email
     */
    public void setEmail(String email)
    {
        if (email != null && email.length() > 0)
            this.email = email;
    }

    /**
     * Returns a copy of the address, so the caller cannot change the
     * address of the card.
     *
     * @return a copy of the address
     */
    public Address getAddress()
    {
        return new Address(address);
    }

    /**
     * Changes the address. The card stores a copy; null is ignored.
     *
     * @param address the new address
     */
    public void setAddress(Address address)
    {
        if (address != null)
            this.address = new Address(address);
    }

    /**
     * Two contact cards are equal when they have the same email.
     *
     * @param object the object to compare with
     * @return true if object is a contact card with the same email
     */
    @Override public boolean equals(Object object)
    {
        if (!(object instanceof ContactCard))
            return false;
        ContactCard other = (ContactCard)object;
        return email.equals(other.email);
    }

    /**
     * Returns the name and email on one line and the address on the next.
     *
     * @return the text that represents the contact card
     */
    @Override public String toString()
    {
        return name + " <" + email + ">\n" + address;
    }
}
