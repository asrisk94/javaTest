package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t = new Test1();
		t.test();

	}
	
	public void test() {
//		정수 두개를 입력 받고, 연산자(+,-,*,/)를 입력받은 다음 계산한 뒤  결과를 출력하는 계산기 프로그램을 만들어보세요.      
//	    출력 예) 입력 5, 6, +
//	           5+6=11
//	    음수가 입력되거나 +,-,*,/ 이외의 문자가 입력되면 “잘못 입력 하셨습니다.  
//		프로그램을 종료합니다.” 라는 문구가 출력되게 하세요.

		Scanner sc = new Scanner(System.in);
		int result;
		
		System.out.println("첫 번째 양의 정수를 입력하세요. >");
		int num1 = sc.nextInt();
		System.out.println("두 번째 양의 정수를 입력하세요. >");
		int num2 = sc.nextInt();
		System.out.println("계산에 사용할 연산자를 입력하세요.(+,-,*,/) > ");
		char ch = sc.next().charAt(0);
		
		if(num1<0 || num2<0 || (ch != '+' && ch != '-' && ch != '*' && ch != '/')) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		} else {
			if(ch == '+') {
				result = num1 + num2;
				System.out.printf("%d + %d = %d", num1, num2, result);
			} else if(ch == '-') {
				result = num1 - num2;
				System.out.printf("%d - %d = %d", num1, num2, result);
			} else if(ch == '*') {
				result = num1 * num2;
				System.out.printf("%d * %d = %d", num1, num2, result);
			} else if(ch == '/') {
				double num2Double = (double)num2;
				double resultDouble;
				resultDouble = num1 / num2Double;
				System.out.printf("%d / %d = %f", num1, num2, resultDouble);
			}
		}
	}

}
