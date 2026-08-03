package app;

import model.ElectronicToy;
import model.PlushToy;
import model.Toy;

public class Main {
	public static void main(String[] args) {
		Toy[] toys= new Toy[3];
		toys[0]= new Toy("001","bộ xếp hình",200000,3);
		toys[1]= new ElectronicToy("002", "robot thông minh", 15000000, 2, 12);
		toys[2]= new PlushToy("003", "gấu teddy", 150000, 5, "Nỉ bông");
		for(Toy toy :toys) {
			toy.printInfo();
			System.out.println("-------------------");
			
		}
	}
}
