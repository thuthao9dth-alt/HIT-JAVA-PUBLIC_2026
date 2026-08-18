public class Address {
    private String street;
    private String city;
    private String zipCode;

    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;

    }

    @Override
    public String toString() {
        return street  + city  + zipCode;
    }
}
