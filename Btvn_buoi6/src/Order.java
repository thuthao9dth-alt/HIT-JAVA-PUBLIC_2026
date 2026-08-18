import java.util.ArrayList;

public class Order {
    String orderId;
    Customer customer;
    ArrayList<Product> items;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        items = new ArrayList<>();
    }
    public void addProduct(Product product){
       items.add(product);

    }
    public double getTotal(){
        double total=0;
        for(Product product: items){
            total+= product.getSubtotal();

        }
        return total;

    }
    public void printInvoice(){
        System.out.println("mã : "+orderId);
        System.out.println("tên khách hàng: "+customer.name);
        System.out.println("sđt khách hàng: "+customer.phone);
        System.out.println("địa chỉ: "+customer.address);
        for(Product product:items){
            System.out.println("Mã sp: "+product.id+" "+"Tên sp: "+product.name+" "+" giá: "+product.price+" "+"Số lượng:  "+ product.quantity +" " +"Tổng: "+ product.getSubtotal());
        }
        System.out.println("Tổng tiền: "+ getTotal());
    }


}
