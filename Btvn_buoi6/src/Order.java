public class Order {
    String orderId;
    Customer customer;
    Product[] items;
    int count;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
         items= new Product[20];
         count=0;
    }
    public void addProduct(Product p){
        if(count< items.length){
            items[count] =product;
            count++;
        }
        else{
            System.out.println("full danh sách!");
        }

    }
    public double getTotal(){
        double total=0;
        for(int i=0;i<count;i++){
            total+= items[i].getSubtotal();

        }
        return total;

    }
    public void printInvoice(){
        System.out.println("mã hàng: "+orderId);
        System.out.println("tên khách hàng: "+customer.name);
        System.out.println("sđt khách hàng: "+customer.phone);
        System.out.println("địa chỉ: "+customer.address);
        for(int i=0;i<count;i++){
            Product product= items[i];
            System.out.println(product.id+product.name+product.price.product.quantity+ product.getSubtotal());
        }
    }

}
