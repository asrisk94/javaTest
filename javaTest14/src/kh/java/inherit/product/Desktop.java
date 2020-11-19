package kh.java.inherit.product;

public class Desktop extends Computer {
	
	private String monitor;
	private String keyboard;

	
	
	public Desktop() {}
	public Desktop(String brand, String productName, 
					int price, String os, 
					String monitor, String keyboard) {
		
		setBrand(brand);
		setProductName(productName);
		setPrice(price);
		setOs(os);
		this.monitor = monitor;
		this.keyboard = keyboard;
	}


	
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	
	

	@Override
	public String getProductInfo() {
		return super.getProductInfo() + ", " + 
					monitor + ", " + keyboard;
	}
			
}
