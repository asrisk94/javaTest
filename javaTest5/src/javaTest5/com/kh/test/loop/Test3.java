package javaTest5.com.kh.test.loop;

import java.util.Scanner;

public class Test3 {
//    정수를 입력 받아 입력된 값의 구구단 프로그램을 만들어보세요.  
//    
//    예) 5입력 
//        5X1=5
//        5X2=10
//        5X3=15
//         .
//         .
//        5X9=45
//    단, 1~9까지만 가능하고 이외에 값을 넣으면 “잘못입력하셨습니다. 프로그램종료합니다”출력
	
	public void test() {
		
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. > ");
		int num = sc.nextInt();
		
		if(num > 9 || num < 1) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		for(i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", num, i, (num*i));
		}
		
	}
	
	

}
