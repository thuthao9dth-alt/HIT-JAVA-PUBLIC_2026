public class Account {
    protected String username;
    protected String email;
    protected Address address;

    public Account(Address address, String email, String username) {
        this.address = address;
        this.email = email;
        this.username = username;
    }
    public double getDiscount(){
        return 0;
    }
    @Override
    public String toString() {
        return "Username: " + username + " Email: " + email + " Address: " + address;
    }
}
