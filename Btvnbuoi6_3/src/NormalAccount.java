public class NormalAccount extends Account {
    public NormalAccount(Address address, String email, String username) {
        super(address, email, username);
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    @Override
    public String toString() {
        return "NormalAccount   " + "tên: " + username + " email: " + email + " địa chỉ: " + address;
    }
}
