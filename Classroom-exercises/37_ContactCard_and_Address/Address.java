public class Address {
    private String street;
    private String city;
    private String postalCode;

    public Address(String street, String city, String postalCode) {
        setStreet(street);
        setCity(city);
        setPostalCode(postalCode);
    }

    public Address(Address other) {
        this(other.street, other.city, other.postalCode);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street != null && !street.isBlank()) {
            this.street = street;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !city.isBlank()) {
            this.city = city;
        }
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        if (postalCode != null && !postalCode.isBlank()) {
            this.postalCode = postalCode;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %s %s", street, postalCode, city);
    }
}
