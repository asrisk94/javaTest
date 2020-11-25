package com.exception.number;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Run r = new Run();
		
		r.test();

	}
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");					// 정수 입력
		int a = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int b = sc.nextInt();
		
		NumberProcess np = new NumberProcess();				// 객체 생성
		
		try {
			if(np.checkDouble(a, b)) {						// 메소드 실행 및 true일 경우
				System.out.println(a + "(은)는 " + b + "의  배수이다.");
			} else {										// true가 아닐 경우
				System.out.println(a + "(은)는 " + b + "의  배수가 아니다.");
			}
		} catch(NumberRangeException nre) {					// 예외 발생시 처리
			nre.printStackTrace();
		}
		
	}

}
