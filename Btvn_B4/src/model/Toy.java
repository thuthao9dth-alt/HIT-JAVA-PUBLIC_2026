package model;

public class Toy {
	private String id;
	private String name;
	private double price;
	private int quantity;
	public Toy(String id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		setPrice(price);
		setQuantity(quantity);
		
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		if(price<=0) {
			System.out.println("giá bán không hợp lệ!");
		}
		this.price = price;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		if (quantity<0) {
			System.out.println("số lượng không hợp lệ");
		}
		this.quantity = quantity;
	}
	public double calculateDiscount() {
		return 0;
	}
	public void printInfo() {
		System.out.println("mã: "+id);
		System.out.println("tên: " +name );
		System.out.println("giá: "+ price);
		System.out.println("số lượng: "+quantity);
	
		
	}

}
