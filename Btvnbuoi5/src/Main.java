//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("iPhone12pmx", 15000000, 10);
        Smartphone smartphone2 = new Smartphone("iPhone15", 35000000, 2);
        Smartphone smartphone3 = new Smartphone("samsungGalaxy", 30000000, 15);
        System.out.println(smartphone1.getId());
        System.out.println(smartphone2.getId());
        System.out.println(smartphone3.getId());
        System.out.println("Tổng: " +Smartphone.getTotalPhones());
        Customer customer1 =new Customer("HyunAbby");
        customer1.addPhone(smartphone1);
        customer1.addPhone(smartphone2);
        customer1.getCart().clear();
        System.out.println("Số sản phẩm trong giỏ:"+ customer1.getCart().size());
        Store store1=new Store();
        Smartphone smartphone4 = new Smartphone("iPhone11pmx", 11000000, 10);
        Smartphone smartphone5 = new Smartphone("iPhone13pmx", 35000000, 2);
        Smartphone smartphone6 = new Smartphone("samsungGalaxy", 30000000, 15);
        Smartphone smartphone7 = new Smartphone("iPhone16",40000000,5);
        Smartphone smartphone8 = new Smartphone("iPhone13",20000000,4);
        store1.addPhoneToStore(smartphone4);
        store1.addPhoneToStore(smartphone5);
        store1.addPhoneToStore(smartphone6);
        store1.addPhoneToStore(smartphone7);
        store1.addPhoneToStore(smartphone8);
        System.out.println(store1.search("SP6").getName());
        System.out.println(store1.search(12000000,50000000).size());
        System.out.println(store1.search("iphone",true).size());
        Store store2 =new Store();
        Customer customer2=new Customer("Abby_smol");
        Smartphone smartphone10 =new Smartphone("iPhone 15",20000000,3);
        store2.addPhoneToStore(smartphone10);
        store2.sellPhone(customer2, smartphone10.getId());
        smartphone10.setPrice(25000000);
        System.out.println(customer2.getCart().get(0).getPrice());
        System.out.println("giá khách phải trả:"+customer2.calculateTotalBill());
        System.out.println("giá trị kho: "+store2.calculateInventoryValue());
        System.out.println("sau giảm thuế VAT: ");
        Smartphone.setVatTax(0.08);
        System.out.println("giá khách phải trả: "+customer2.calculateTotalBill());
        System.out.println("giá trị kho: "+store2.calculateInventoryValue());
    }
}