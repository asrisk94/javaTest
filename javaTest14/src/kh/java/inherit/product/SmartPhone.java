package kh.java.inherit.product;

public class SmartPhone extends Computer {
	
	private String carrier;
	
	
	
	public SmartPhone() {}
	public SmartPhone(String brand, String productName, int price, String os, String carrier) {
		super(brand, productName, price, os);
		this.carrier = carrier;
	}
	
	
	
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	
	
	@Override
	public String getProductInfo() {
		return super.getProductInfo() + 
				 ", " + carrier;
	}
	
}
