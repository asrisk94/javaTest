package javaTest7.kh.java.test.array;

import java.util.Scanner;

public class Test3 {
	public void test() {
//	    문자열을 하나 입력 받아 배열에 넣고 문자를 하나 입력 받아 입력 받은 문자가 문자열에 몇 개인지 개수를 출력하는 프로그램을 작성하세요.
//	    
//	    예) 입력값 : helloworld
//	    검색값 :ㅣ
//	    출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[1];		// 배열 생성
		int count = 0;						// 갯수 세기 변수
		
		
		System.out.print("문자열을 입력하세요. > ");
		String userStr = sc.nextLine();
		
		System.out.print("검색할 문자를 입력하세요. > ");
		char userCh = sc.next().charAt(0);				// 문자열과 문자 입력
		
		
		for(int i = 0; i < userStr.length(); i++) {
			if(userStr.charAt(i)==userCh) {				// 같은 문자 검색
				count++;
			}
		}
		
		System.out.printf("입력하신 문자열 \"%s\"에서 찾으시는 문자 %c(은)는 %d개 입니다.%n", userStr, userCh, count);
		
	} // 메소드 괄호

}
