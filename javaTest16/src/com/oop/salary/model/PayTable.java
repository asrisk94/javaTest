package com.oop.salary.model;

public class PayTable implements Output {
	
	private static final int MAX_VOLUME = 10;
	
	Salary[] salArr = new Salary[MAX_VOLUME];
	
	
	
	public void insertSalaryData(Salary s) {
		for(int i=0; i<MAX_VOLUME; i++) {
			if(salArr[i] == null) {
				salArr[i] = s; break;
			}
		}
	}
	
	
	
	public void output() {
		
		System.out.print("**** 급여명세서 ****\n"
				+ "--------------------------------------------------------------------------------\n"
				+ "이름\t기본급\t가족수\t가족수당\t시간외근무\t시간외수당\t세금\t인센티브(%)\t성과급\t실수령액\n"
				+ "--------------------------------------------------------------------------------\n");
		
		for(int i=0; i<MAX_VOLUME; i++) {
			if(salArr[i] == null) break;
			salArr[i].calc();
		}
		
		for(Salary s: salArr) {
			if(s == null) break;
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.1f\t%d\t%d%n", 
					s.getName(), s.getBasePay(), s.getFamily(), s.getFamilyPay(), 
					s.getOvertime(), s.getOvertimePay(), s.getTax(), Calculate.getIncentive(), 
					s.getIncentivePay(), s.getTotalPay());
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("인원 : " + Salary.getCount() + "명");
		
	}

}
