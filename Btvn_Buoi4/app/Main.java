package app;
import model.ElectronicToy;
import model.PlushToy;
import model.Toy;
public class Main {
public static void main(String[] args) {
	Toy[] toys =new Toy[3];
	toys[0] = new Toy("001","Bộ đồ chơi xếp hình",200000,1);
	toys[1] = new ElectronicToy("002","Robot thông minh",50000000,3,12);
	toys[2] = new PlushToy("003","Gấu bông",150000,5,"Nỉ");
	for (Toy toy : toys) {
        toy.printInfo();
        System.out.println("----------------------");
}
}
}
