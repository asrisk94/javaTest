package com.oop.salary.model;

public abstract class Calculate {
	
	private static float incentive = 0.5f; // 인센티브 (변동가능)
	

	
	public static float getIncentive() {
		return incentive;
	}
	public static void setIncentive(float incentive) {
		Calculate.incentive = incentive;
	}



	public abstract void calc();	// 급여 계산용

}
