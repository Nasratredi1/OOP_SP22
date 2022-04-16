package Lec_11;

public class Address {
    String StreetAddress;
    String town;
    String city;
    String country;

    public Address(String streetAddress, String town, String city) {
        StreetAddress = streetAddress;
        this.town = town;
        this.city = city;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        StreetAddress = streetAddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
