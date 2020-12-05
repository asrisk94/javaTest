package ncs4.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Inventory {
	
	private String productName;		// 상품명
	private Calendar putDate;			// 입고일		Date 클래스는 쓰지 않는 추세라
	private Calendar getDate;			// 출고일		Calendar 클래스를 활용
	private int putAmount;			// 입고수량
	private int getAmount;			// 출고수량
	private int inventoryAmount;	// 재고수량
	
	
	
	public Inventory() {			// 생성자
		super();
	}
	public Inventory(String productName, Calendar putDate, int putAmount) {
		super();
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
	}
	
	
	
	public String getProductName() {				// 겟셋 메소드
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Calendar getPutDate() {
		return putDate;
	}
	public void setPutDate(Calendar putDate) {
		this.putDate = putDate;
	}
	public Calendar getGetDate() {
		return getDate;
	}
	public void setGetDate(Calendar getDate) {
		this.getDate = getDate;
	}
	public int getPutAmount() {
		return putAmount;
	}
	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}
	public int getGetAmount() {
		return getAmount;
	}
	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}
	public int getInventoryAmount() {
		return inventoryAmount;
	}
	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}													// 겟셋 메소드
	
	
	
	@Override
	public String toString() {					// 투스트링 오버라이딩
		
		SimpleDateFormat putSdf = new SimpleDateFormat("yyyy년 M월 dd일 입고");
		SimpleDateFormat getSdf = new SimpleDateFormat("yyyy년 M월 dd일 출고");
		
		String putD = putSdf.format(putDate.getTimeInMillis());
		String getD = null;
		
		if(getDate != null) 
			getD = getSdf.format(getDate.getTimeInMillis());			
		
		return String.format("%-15s%s, %d개, %s, %d개, 재고 %d개", productName+",", putD, putAmount, getD, getAmount, inventoryAmount);
	}

}
