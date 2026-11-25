/**
 * A postal address.
 * The constructor arguments must satisfy the preconditions of the
 * exercise. Invalid setter values leave the previous valid state
 * unchanged.
 */
public class Address
{
    /** The street and number. */
    private String street;

    /** The city. */
    private String city;

    /** The postal code. */
    private String postalCode;

    /**
     * Creates an address.
     *
     * @param street the street, not null or empty
     * @param city the city, not null or empty
     * @param postalCode the postal code, not null or empty
     */
    public Address(String street, String city, String postalCode)
    {
        setStreet(street);
        setCity(city);
        setPostalCode(postalCode);
    }

    /**
     * Copy constructor: creates an address equal to other.
     *
     * @param other the address to copy; it must not be null
     */
    public Address(Address other)
    {
        this(other.street, other.city, other.postalCode);
    }

    /**
     * Returns the street.
     *
     * @return the street
     */
    public String getStreet()
    {
        return street;
    }

    /**
     * Changes the street. A null or empty value is ignored.
     *
     * @param street the new street
     */
    public void setStreet(String street)
    {
        if (street != null && street.length() > 0)
            this.street = street;
    }

    /**
     * Returns the city.
     *
     * @return the city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Changes the city. A null or empty value is ignored.
     *
     * @param city the new city
     */
    public void setCity(String city)
    {
        if (city != null && city.length() > 0)
            this.city = city;
    }

    /**
     * Returns the postal code.
     *
     * @return the postal code
     */
    public String getPostalCode()
    {
        return postalCode;
    }

    /**
     * Changes the postal code. A null or empty value is ignored.
     *
     * @param postalCode the new postal code
     */
    public void setPostalCode(String postalCode)
    {
        if (postalCode != null && postalCode.length() > 0)
            this.postalCode = postalCode;
    }

    /**
     * Returns the address on one line, for example
     * "1 Main Street, 33001 Oviedo".
     *
     * @return the text that represents the address
     */
    @Override
    public String toString()
    {
        return String.format("%s, %s %s", street, postalCode, city);
    }
}
