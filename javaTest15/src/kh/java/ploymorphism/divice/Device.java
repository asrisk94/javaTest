package kh.java.ploymorphism.divice;

public class Device {
	
	private String brand;
	private String deviceName;
	private int price;
	
	
	
	public Device() {}
	public Device(String brand, String deviceName, int price) {
		this.brand = brand;
		this.deviceName = deviceName;
		this.price = price;
	}
	
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
}
