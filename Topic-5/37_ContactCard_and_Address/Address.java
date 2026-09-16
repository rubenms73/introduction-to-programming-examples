/** Constructor arguments must satisfy the exercise preconditions.
 * Invalid setter values leave the previous valid state unchanged. */
public class Address
{
    private String street;
    private String city;
    private String postalCode;

    public Address(String street, String city, String postalCode)
    {
        setStreet(street);
        setCity(city);
        setPostalCode(postalCode);
    }

    public Address(Address other)
    {
        this(other.street, other.city, other.postalCode);
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        if (street != null && street.length() > 0)
            this.street = street;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        if (city != null && city.length() > 0)
            this.city = city;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode(String postalCode)
    {
        if (postalCode != null && postalCode.length() > 0)
            this.postalCode = postalCode;
    }

    @Override public String toString()
    {
        return street + ", " + postalCode + " " + city;
    }
}
