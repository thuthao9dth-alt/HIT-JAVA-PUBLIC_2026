public class Electronic extends Product {
    private int warrantyMonths;

    public Electronic(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    protected double getDiscountedPrice() {
        return price*1.05;
    }
    public void showInfo(){
        System.out.println("thông tin: ");
        System.out.println("mã: " +id);
        System.out.println("tên: " +name);
        System.out.println("giá: " +price);
        System.out.println("bảo hành: "+ warrantyMonths+"tháng");
        System.out.println("giá sau giảm giá: "+ getDiscountedPrice());
    }

    @Override
    public String toString() {
        return "Electronic   id: " + id + ", name: " + name + ", price: " + price + ", warrantyMonths: " + warrantyMonths ;
    }
}
