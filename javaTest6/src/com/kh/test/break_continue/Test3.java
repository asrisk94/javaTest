package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {
	
	public void test() {

//	     2보다 큰 정수를 입력 받고, 입력 받은 정수가 소수이면 “소수다“, 소수가 아니면 “소수가 아니다.” 출력하고 프로그램을 종료하는 코드를 작성하세요.
//	     단, 입력 받은 정수가 2보다 작은 경우 “잘못 입력하셨습니다. 다시 입력하세요.” 출력 후 다시 정수를 입력 받도록 하세요.
//	     
//	    ** 소수란? : 어떠한 정수를 1부터 자기 자신까지로 나누었을 때, 나누어 떨어지는 수가 1과 자기 자신 뿐인 수를 소수라고 한다.
		
		Scanner sc = new Scanner(System.in);
		int userInput;
		int num=0;										// 소수 여부
		
		while(true) {
			System.out.print("2보다 큰 정수를 입력하세요. > ");
			userInput = sc.nextInt();					// 정수 입력
			
			if(userInput<2) {
				System.out.println("잘못 입력하셨습니다 다시 입력하세요.");	// 유효성 검사
				continue;
			}
			break;
		}
		
		for(int i=2; i<=userInput/2; i++) {
			if(userInput%i==0) {				// 소수 검사
				num++; break;
			}
		}
		
		if(num==0)
			System.out.println("소수입니다."); 		// 소수일 시
		else
			System.out.println("소수가 아닙니다.");	// 소수가 아닐 시
		
		System.out.println("프로그램을 종료합니다.");
		
	} // 메소드 괄호

}
