//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer= new Customer("Hyun","0123456789","Hanoi");
        Order order=new Order("DH001",customer);
        Product product1= new Product("001","Laptop",25000000,3);
        Product product2= new Product("002","iphone15pmx",45000000,1);
        Product product3= new Product("003","Sạc pin",800000,2);
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);
        order.printInvoice();

    }
}