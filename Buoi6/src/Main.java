//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer= new Customer("0986797033","Hoa","Hànôi");
        Product product1= new Product("001","headphone",650000,3);
        Product product2= new Product("002","laptop",25000000,1);
        Product product3= new Product("003","sofa",60000000,2);
    Order order= new Order("001",customer);
     order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);
     order.printInvoice();





    }
}