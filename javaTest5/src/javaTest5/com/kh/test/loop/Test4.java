package javaTest5.com.kh.test.loop;

import java.util.Scanner;

public class Test4 {
//	(문자열의 길이를 리턴하는 String의 메소드를 api에서 찾아 사용할 것)
//    문자열과 문자열에서 검색될 문자를 입력 받아 문 
//    자열에 그 문자가 몇 개이었는지 개수를 확인하는 
//    프로그램을 작성하세요. 
//    또, 검색할 문자가 영문자가 아니면 "영문자가 아닙니다." 출력후
//    프로그램을 종료하세요. 
//    
//    출력 예)
//    문자열 입력 : application
//    검색할 문자 입력 : p
//    'p'가 포함된 갯수 : 2 개
//    
//    
//    문자열 입력 : apple_test123
//    문자 입력 : ㄱ
//    영문자가 아닙니다.
	
//	아스키 	대문자 65~90,	소문자 97~122
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		int i;
		int sum=0;
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		int length = str.length();
		
		for(i=0; i<length; i++) {
			char search = str.charAt(i);
			if((search<65) || (search>90 && search <97) || (search>122)) {
				System.out.println("영문자가 아닌 글자가 속해 있습니다.");
				return;
			}
		}

		System.out.print("검색할 문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		if((ch<65) || (ch>90 && ch <97) || (ch>122)) {
			System.out.println("영문자가 아닙니다.");
			return;
		}
		
		for(i=0; i<length; i++) {
			char search = str.charAt(i);
			
			if(search==ch) {
				sum +=1;
			}
		}
		
		System.out.printf("\'%c\'(이)가 포함된 갯수 : %d%n", ch, sum);

	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		int length = str.length();
		
		int i = 0;
		
		while(i<length) {
			char search = str.charAt(i);
			if((search<65) || (search>90 && search <97) || (search>122)) {
				System.out.println("영문자가 아닌 글자가 속해 있습니다.");
				return;
			}
			i++;
		}

		System.out.print("검색할 문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		if((ch<65) || (ch>90 && ch <97) || (ch>122)) {
			System.out.println("영문자가 아닙니다.");
			return;
		}
		
		i = 0;
		
		while(i<length) {
			char search = str.charAt(i);
			
			if(search==ch) {
				sum +=1;
			}
			i++;
		}
		
		System.out.printf("\'%c\'(이)가 포함된 갯수 : %d%n", ch, sum);
	}

}
