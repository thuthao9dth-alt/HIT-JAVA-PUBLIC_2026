import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      List<Product> products= new ArrayList<>();
      products.add(new Book("book1","lập trình c++",30000,"nguyễn văn a",350));
      products.add(new Book("book2","kiến trúc máy tính",25000,"nguyễn văn b",400));
      products.add(new Electronic("001","laptop",25000000,24));
      products.add(new Electronic("002","điện thoại",40000000,12));
    products.add(new Food("0013","bánh mỳ ",20000,"18/8/2026"));
    for(Product product: products){
        product.showInfo();
        System.out.println(product.toString());
    }
    double totaloriginal =0;
    double totalselling =0;
    for(Product product:products){
        totaloriginal += product.price;
        totalselling += product.getDiscountedPrice();
    }
        System.out.println("tổng gi trị kho: "+totaloriginal);
        System.out.println("tỏng giá trị bán:"+ totalselling);
    }
}
