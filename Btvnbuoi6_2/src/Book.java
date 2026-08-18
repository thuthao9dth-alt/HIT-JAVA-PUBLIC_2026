public class Book extends Product{
    private String author;
    private int pages;

    public Book(String id, String name, double price, String author, int pages) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public double getDiscountedPrice() {
        return price*=0.9;
    }
    public void showInfo(){
        System.out.println("thông tin: ");
        System.out.println("mã: " +id);
        System.out.println("tên: " +name);
        System.out.println("giá: " +price);
        System.out.println("tác giả: " +author);
        System.out.println("số trang: " +pages);

    }
    @Override
    public String toString() {
        return "Book    id: " + id + ",name:" + name + ",price: " + price + ", author: " + author + ", pages: " + pages ;
    }
}
