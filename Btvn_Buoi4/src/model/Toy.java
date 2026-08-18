package model;

public class Toy {
	private String id;
	private String name;
	private double price;
	private int quantity;
	
public Toy(String name, String id, double price, int quantity) {
	super();
	this.name = name;
	this.id = id;
	setPrice(price);
	setQuantity(quantity);
}

public String getId() {
	return id;
}

public String getName() {
	return name;
}

public double getPrice() {
	return price;
}

public int getQuantity() {
	return quantity;
}

public void setId(String id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}

public void setPrice(double price) {
	if(price<=0) {
		System.out.println("Giá bán không hợp lệ!");
	}
	this.price = price;
}

public void setQuantity(int quantity) {
	if(quantity<0) {
		System.out.println("Số lượng không hợp lệ!");
	}
	this.quantity = quantity;
}
public double calculateDiscount() {
	return 0;
} 
public void printInfo() {
	System.out.println("Mã: " +id);
	System.out.println("Tên: "+name);
	System.out.println("Giá: "+price);
	System.out.println("Số lượng: "+ quantity);
 }
}

