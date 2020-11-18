package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test1 {
	
	public void test() {
//	    정수하나 입력받아, 그 수가 양수일때만 입력된 수를  행수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
//	    
//	    출력예)
//	    정수 입력 : 5
//	    *
//	    **
//	    ***
//	    ****
//	    *****
//	    ==========================
//	    정수 입력 : 0
//	    양수가 아닙니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하세요. > ");		// 정수 입력
		int userInput = sc.nextInt();
		
		if(userInput <= 0) {
			System.out.println("정수가 아닙니다.");		// 데이터 유효성 검사
			return;
		}
		
		for(int i=0; i<userInput; i++) {			
			for(int j=0; j<i+1; j++) {				// 행마다 출력해야 할 별 갯수
				System.out.print("*");
			}
			System.out.println();					// 줄 변경
		}
		
		
	} // 메소드 괄호

}
