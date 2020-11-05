package javaTest5.com.kh.test.loop;

import java.util.Scanner;

public class Test2 {
//    정수를 입력 받아 1부터 입력 받은 정수까지 수를 
//    홀수와 짝수를 나눠서 홀수면 “수”, 짝수면 “박”을 
//    출력 하세요.
//  
//    예) 4입력 : 수박수박 / 5입력 : 수박수박수 출력

	public void test() {
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.print("정수를 입력하세요 > ");
		int num = sc.nextInt();

		for(i=1; i<=num; i++) {
			if(i%2==1) {
				System.out.print("수");
			} else {
				System.out.print("박");
			}
		}
		System.out.println();
	}
}
