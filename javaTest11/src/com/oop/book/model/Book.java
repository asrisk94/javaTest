package com.oop.book.model;

public class Book {
	
//	   - title:String  //책제목
//	    - price:int //가격
//	    - discountRate:double   //할인율
//	    - author:String //저자명
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
//	 - 기본(default) 생성자와 4개의 필드를 초기화하는 매개변수가 있는 생성자 작성함
//	 - 출력용 메소드 작성함 : 객체가 가진 필드값 화면 출력 처리
//	    public void bookInfomation()
	
	public Book() {}
	
	public Book(String title, int price, 
			double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public String getAuthor() {
		return author;
	}

	public void bookInfomation() {
		System.out.printf("책제목 : %s\t가격 : %d%n"
				+ "할인율 : %.1f\t저자명 : %s%n", 
				title, price, discountRate, author);
	}
	
	
	
	
	
	
}
