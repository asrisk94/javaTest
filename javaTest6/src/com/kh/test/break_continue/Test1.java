package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {
	
	public void test1() {
//		정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		long result = 1;								// 출력 결과용 변수
		
		System.out.print("정수를 입력하세요. > ");
		int userNum = sc.nextInt();
		
		int i = 1;
		while(i<=userNum) {
			if(i%2==1)
				result *= i;
			i++;
		}
		
		System.out.printf("1부터 입력하신 %d까지의 홀수의 곱 : %d%n", userNum, result);
		
	}
	
	public void test2() {
//		사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
//        Tip. 큰수/작은수에 해당하는 변수를 사용할 것.
//     
//        결과:
//        정수를 하나 입력하세요. => 100
//        다른 정수를 하나 입력하세요. => 1
//        ====================
//        1부터 100까지의 홀수의 합은 2500입니다.
		
		Scanner sc = new Scanner(System.in);
		int result = 0;								// 결과 출력용 변수
		int i;
		
		
		System.out.print("작은 수 입력 : ");
		int small = sc.nextInt();				// 작은 수
		
		System.out.println("큰 수 입력 : ");
		int big = sc.nextInt();					// 큰 수
		
		for(i=small; i<=big; i++) {
			if(i%2 !=0) result += i;
		}
		
		System.out.printf("%d에서 %d까지 홀수의 합 : %d%n", small, big, result);
		
	} // 메소드 괄호

}
