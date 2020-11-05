package javaTest5.com.kh.test.loop;

import java.util.Scanner;

public class Test1 {
//    1부터 사용자로부터 입력 받은 정수까지 존재하는 짝수의 합을 출력하세요. 
//    (for문 활용)
	
	public void test() {
		int i;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 > ");
		int num = sc.nextInt();
		
		for(i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 입력하신 정수까지의 합은 %d 입니다.", sum);
	}

}
