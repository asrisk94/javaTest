package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {
	
	public void test() {
		
//	    정수하나 입력받아, 그 수가 양수일때만 입력된 
//	    수를 줄 수로 적용하여 다음과 같이 출력되게 하는 
//	    프로그램을 만들어보자.
//	        출력예)
//	      정수 입력 : 5
//	    
//	         *
//	         **
//	         ***
//	         ****
//	         *****
//	          ****
//	           ***
//	            **
//	             *
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하세요. > ");		// 정수 입력
		int userInput = sc.nextInt();
		
		if(userInput<=0) {
			System.out.println("양의 정수가 아닙니다.");		// 데이터 유효성 검사
			return;
		}
		
		for(int i=0; i<userInput; i++) {		// 늘어나는 파트
			for(int j=0; j<i+1; j++) {
				System.out.print("*");			// 늘어나는 별 출력
			}
			System.out.println();
		}  // 포문 괄호
		
		for(int i=0; i<userInput-1; i++) {		// 줄어드는 파트
			
			for(int k=0; k<=i; k++) {			// 공백 생성
				System.out.print(" ");
			}
			
			for(int j=userInput; j>i+1; j--) {	// 줄어드는 별
				System.out.print("*");
			}
			System.out.println();
		} // 포문 괄호
		
	} // 메소드 괄호

}
