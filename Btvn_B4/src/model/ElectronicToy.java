package model;

public class ElectronicToy extends Toy {
	private int warranty;

	public ElectronicToy(String id, String name, double price, int quantity, int warranty) {
		super(id, name, price, quantity);
		this.warranty = warranty;
	}
	/**
	 * @return the warranty
	 */
	public int getWarranty() {
		return warranty;
	}

	/**
	 * @param warranty the warranty to set
	 */
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public double calculateDiscount() {
		if(getPrice()>500.0) {
				return getPrice()*0.05;
		}
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("bảo hành: "+ warranty);
		System.out.println("giảm giá: "+calculateDiscount());
	}
	
}
