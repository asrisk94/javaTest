package ncs4.test2;

public class Fruit {
	
	private String name;		// 과일명
	private int price;			// 가격
	private int quantity;		// 수량
	
	
	
	public Fruit() {}
	public Fruit(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;		// 생성자 정의
	}
	
	
	
	public String getName() {			// 겟셋 메소드
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}											// 겟셋 메소드
	
	
	
	@Override								// 투스트링 오버라이딩
	public String toString() {
		return name + ", " + price + "원, " + quantity + "개";
	}
	
}
