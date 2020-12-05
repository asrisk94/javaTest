package nes4.test5;

import java.io.Serializable;

public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;		// 직렬화 식별번호
	
	private String title;			// 제목
	private String author;			// 저자
	private int price;				// 가격
	private String publisher;		// 출판사
	private double discountRate;	// 할인율
	
	
	
	public Book() {super();}
	public Book(String title, String author, int price, String publisher, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;		// 생성자 정의
	}
	
	
	
	public String getTitle() {					// 겟셋 메소드
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}													// 겟셋 메소드
	
	
	
	@Override
	public String toString() {					// 투스트링 오버라이딩
		
		return String.format("%s, %s, %s, %d원, %d%%할인\n할인된 가격 : %d원",
							title, author, publisher, price, (int)(discountRate*100), (int)(price - price*discountRate));
	}

}
