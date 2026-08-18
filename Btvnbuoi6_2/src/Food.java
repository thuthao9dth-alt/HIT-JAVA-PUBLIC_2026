public class Food extends Product {
    private String expiryDate;

    public Food(String id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    protected double getDiscountedPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Food   id: " + id + ", name: " + name + ", price: " + price + ", expiryDate: " + expiryDate ;
    }

    @Override
    protected void showInfo() {
        System.out.println("thông tin: ");
        System.out.println("mã: " +id);
        System.out.println("tên: " +name);
        System.out.println("giá gốc: " +price);
        System.out.println("giá sau giảm giá " +getDiscountedPrice());
        System.out.println("hạn sử dụng: " +expiryDate);

    }
}
