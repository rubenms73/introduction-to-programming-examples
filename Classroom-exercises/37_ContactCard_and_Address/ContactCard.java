public class ContactCard {
    private String name;
    private String email;
    private Address address;

    public ContactCard(String name, String email, Address address) {
        setName(name);
        setEmail(email);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && !email.isBlank()) {
            this.email = email;
        }
    }

    public Address getAddress() {
        return new Address(address);
    }

    public void setAddress(Address address) {
        if (address != null) {
            this.address = new Address(address);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ContactCard)) {
            return false;
        }
        ContactCard other = (ContactCard) object;
        return email != null && email.equalsIgnoreCase(other.email);
    }

    @Override
    public String toString() {
        return String.format("%s <%s>%n%s", name, email, address);
    }
}
