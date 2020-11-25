package com.exception.charcheck;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Run r = new Run();
		
		r.test1();
		
	}
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		CharacterProcess cp = new CharacterProcess();
		
		try {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();				// 공백까지 입력하기 위해 Line
			System.out.println(cp.countAlpha(str));	// 반환된 count 출력
			
		} catch(CharCheckException ce) {			// 오류 발생시
			ce.printStackTrace();
		}

	}

}
