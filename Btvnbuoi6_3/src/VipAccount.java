public class VipAccount extends Account{
    private int points;
    public VipAccount(Address address, String email, String username, int points) {
        super(address, email, username);
        this.points = points;
    }
    @Override
    public double getDiscount() {
        if(points >=1000){
            return 0.15;
        }
        else{
            return 0.1;
        }
    }

    @Override
    public String toString() {
        return "VipAccount   " + "tên: " + username + " email: " + email + " địa chỉ: " + address+ "điểm" + points;
    }

    public void addPoint(int points){
        points += points;
        if (points>=1000){
            System.out.println("tài khoản được nâng hạng");
        }
    }
}

