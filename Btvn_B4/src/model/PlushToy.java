package model;

public class PlushToy extends Toy {
	private String material;

	public PlushToy(String id, String name, double price, int quantity, String material) {
		super(id, name, price, quantity);
		this.material = material;
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return getPrice() * 0.1;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("chất liệu: "+material );
		System.out.println("giảm giá: "+calculateDiscount());
	}

}
