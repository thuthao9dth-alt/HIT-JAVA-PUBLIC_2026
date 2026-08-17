public class Smartphone {
    private static int totalPhones =0;
    private String id;
    private String name;
    private double price;
    private int stock;

    public Smartphone(String name, double price, int stock)
    {
        totalPhones++;
        id = "SP" + totalPhones;
        this.name = name;
        setPrice(price);
        setStock(stock);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        if(price<0){
            System.out.println("Lỗi");
                    this. price =0;
        }
            else {
            this.price = price;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        if (stock < 0) {
            System.out.println("Lỗi");
            this.stock = 0;
        } else {
            this.stock = stock;
        }
    }
    public static int getTotalPhones() {
        return totalPhones;
    }
    private static double vatTax = 0.10;
    public static void setVatTax(double tax){
        vatTax=tax;
    }
    public double getFinalPrice(){
        return price + (price * vatTax);
    }

}
