import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double valueOrder=2000000;
        Address address1=new Address("HCM","123 Lê Lợi","100000");
        Address address2= new Address("Hà Nội","345 Nguyễn Trãi","2000000");
        Address address3= new Address("Đà Nẵng","789 Trần Phú","300000");
        NormalAccount normalAccount=new NormalAccount(address1,"hanoi@gmail.com","nguyễn văn a");
        VipAccount vipAccount1=new VipAccount(address2,"normal002&gmail.com","nguyễn văn b",50000);
        VipAccount vipAccount2=new VipAccount(address3,"normal003&gmail.com","trần văn c",150000);
        System.out.println("NormalAccount"+normalAccount);
        System.out.println("discount: "+(normalAccount.getDiscount()* 100)+"%");
        double normalPay= valueOrder*(1- normalAccount.getDiscount());
        System.out.println("số tiền phải trả: "+normalPay);
        System.out.println("VipAccount"+vipAccount1);
        System.out.println("discount: " +(vipAccount1.getDiscount()* 100)+"%");
        double vipPay1= valueOrder*(1- vipAccount1.getDiscount());
        System.out.println("số tiền phải trả: "+vipPay1);
        System.out.println("VipAccount2"+vipAccount2);
        System.out.println("discount: "+(vipAccount2.getDiscount()* 100)+"%");
        double vipPay2= valueOrder*(1- vipAccount2.getDiscount());
        System.out.println("số tiền phải trả: "+vipPay2);





    }
}