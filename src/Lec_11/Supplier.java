package Lec_11;

public class Supplier {
    int id;
    // other attributes of supplier

    Address PostalAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getPostalAddress() {
        return PostalAddress;
    }

    public void setPostalAddress(Address postalAddress) {
        PostalAddress = postalAddress;
    }
}
