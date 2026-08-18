public class Product {
     String id;
     String name;
     double price;
     int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double getSubtotal(){
    return price*quantity;
    }
}
