public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) { //Four sources that come together to form the person's address, which is brought together with the name for their full personal information
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}



