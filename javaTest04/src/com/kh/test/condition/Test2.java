package com.kh.test.condition;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		t.test();

	}
	
	public void test() {
//		   1~10 사이의 정수 한개를 입력받아  홀수인지 
//		    짝수인지 확인하고, 홀수면 “홀수다.”, 짝수면 
//		   “짝수다.”출력 하세요. 
//		   단, 1~10사이의 정수가 아닌 경우 “ 반드시 1~10사이의 정수를 입력해야 합니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		String result;
		
		System.out.print("1~10 사이의 정수를 입력해주세요. > ");
		int num = sc.nextInt();
		
		if(num < 1 || num > 10) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		} else {
			result = num%2 == 0 ? "짝수입니다." : "홀수입니다.";
			System.out.println(result);
		}
		
	}

}
