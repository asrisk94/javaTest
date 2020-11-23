package com.oop.salary.model;

public class Salary extends Calculate implements Output{
	
	private String name;		// 이름
	private long basePay;		// 기본급
	private long familyPay;		// 가족수당
	private long overtimePay;	// 시간외수당
	private long incentivePay;	// 성과급
	private long tax;			// 세금
	private long totalPay;		// 실수령액
	private int family;			// 가족 수
	private int overtime;		// 초과근무시간
	
	private static int count;	// 총인원 - 초기값(0)
	
	
	
	public Salary() {
		count++;
		}
	public Salary(String name, long basePay, int family, int overtime) {
		this.name = name;
		this.basePay = basePay;
		this.family = family;
		this.overtime = overtime;
		count++;
		this.calc();
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBasePay() {
		return basePay;
	}
	public void setBasePay(long basePay) {
		this.basePay = basePay;
	}
	public long getFamilyPay() {
		return familyPay;
	}
	public void setFamilyPay(long familyPay) {
		this.familyPay = familyPay;
	}
	public long getOvertimePay() {
		return overtimePay;
	}
	public void setOvertimePay(long overtimePay) {
		this.overtimePay = overtimePay;
	}
	public long getIncentivePay() {
		return incentivePay;
	}
	public void setIncentivePay(long incentivePay) {
		this.incentivePay = incentivePay;
	}
	public long getTax() {
		return tax;
	}
	public void setTax(long tax) {
		this.tax = tax;
	}
	public long getTotalPay() {
		return totalPay;
	}
	public void setTotalPay(long totalPay) {
		this.totalPay = totalPay;
	}
	public int getFamily() {
		return family;
	}
	public void setFamily(int family) {
		this.family = family;
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Salary.count = count;
	}
	
	
	
	public void calc() {
		if(family < 3)
			this.familyPay = family*20000;
		else
			this.familyPay = family*60000;
		
		this.overtimePay = overtime*5000;
		
		this.tax = (long)(basePay*0.1);
		
		this.incentivePay = (long)(Calculate.getIncentive()*basePay);
		
		this.totalPay = basePay + familyPay + incentivePay + overtimePay - tax;
		
	}
	
	
	
	@Override
	public void output() {
		
		System.out.printf("이름 : %s\t기본급 : %d\t가족수당 : %d\t시간외수당 : %d\t성과급 : %d\t세금 : %d\t실수령액 : %d\t가족수 : %d\t초과근무시간 : %d%n", 
				name, basePay, familyPay, overtimePay, incentivePay, tax, totalPay, family, overtime);
	}
	
}
