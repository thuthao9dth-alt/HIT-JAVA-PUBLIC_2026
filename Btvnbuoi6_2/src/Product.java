public class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    protected double getDiscountedPrice(){
        return price;
    }
    protected void showInfo(){
        System.out.println("mã sp: "+ id+" "+"tên sp: "+ name+" "+ "giá: "+ price);
    }

    @Override
    public String toString() {
        return "Product   id: '"+id+"',name: ' "+name+"',price: "+price;
    }

}
