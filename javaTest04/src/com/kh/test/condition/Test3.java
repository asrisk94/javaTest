package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t = new Test3();
		t.test();

	}
	
	public void test() {
//	    키(cm)와 몸무게(kg)을 입력 받고, 
//	    BMI(체질량지수)를 계산하여 계산된 값에 따라 
//	    저체중(18.5미만), 정상체중(18.5이상 23미만), 과체중(23이상 25미만), 비만(25이상 30미만), 고도비만(30이상)을 출력하세요. 
//	    BMI 계산식 = 체중(kg) / (신장(m) * 신장(m) ) 
//	    예) BMI = 67 / (1.7 * 1.7)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요(cm) > ");
		double height = sc.nextDouble()/100;
		System.out.println("몸무게를 입력하세요(kg) > ");
		double weight = sc.nextDouble();
		
		double bmi = (weight / (height * height));
		
		if(bmi < 18.5) {
			System.out.printf("BMI 지수 %.2f로 저체중입니다. (기준 18.5 미만)", bmi);
		} else if(bmi >= 18.5 && bmi < 23) {
			System.out.printf("BMI 지수 %.2f로 정상체중입니다. (기준 18.5이상 23미만)", bmi);
		} else if(bmi >= 23 && bmi < 25) {
			System.out.printf("BMI 지수 %.2f로 과체중입니다. (기준 23이상 25미만)", bmi);
		} else if(bmi >= 25 && bmi < 30) {
			System.out.printf("BMI 지수 %.2f로 비만입니다. (기준 25이상 30미만)", bmi);
		} else if(bmi >= 30) {
			System.out.printf("BMI 지수 %.2f로 고도비만입니다. (기준 30이상)", bmi);
		}
		
	}

}
