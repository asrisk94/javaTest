package com.io.test4.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String title;			// 도서명
	private String author;			// 저자
	private int price;				// 가격
	private Calendar dates;			// 출판날짜
	private double discountRate;	// 할인율
	
	
	
	public Book() { super(); }
	public Book(String title, String author, int price, Calendar dates, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discountRate = discountRate;		// 생성자 정의
	}
	
	
	
	public String getTitle() {
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
	public Calendar getDates() {
		return dates;
	}
	public void setDates(Calendar dates) {
		this.dates = dates;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}											// 겟셋 메소드 정의
	
	
	
	@Override
	public String toString() {
		
		
		
		return this.title + ", " + this.author + ", " + this.price + "원, " + 
		this.dates.get(Calendar.YEAR) + "년 " + this.dates.get(Calendar.MONTH) + "월 " + this.dates.get(Calendar.DATE) + "일 출간" + ", " + 
				((Math.round(this.discountRate*100))/100.0);
	}



}
