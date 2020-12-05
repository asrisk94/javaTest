package ncs4.test4;

public class Goods {
	
	private String name;		// 이름
	private int price;			// 가격
	private int quantity;		// 수량

	
	
	public Goods() {super();}
	public Goods(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;		// 생성자 정의
	}
	
	
	
	public String getName() {				// 겟셋 메소드
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
	
	
	
	@Override
	public String toString() {			// 투스트링 오버라이딩
		return name + ", " + price + " 원, " + quantity + "개\n"
				+ "총 구매 가격 : " + (price*quantity) + " 원";
	}
	
}
