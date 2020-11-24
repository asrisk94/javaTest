package com.api.member.run;

import com.api.member.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		
		Member m = new Member();
		
		m.test(str);	// 문자열을 받아 객체배열을 만드는 메소드
		
		m.printAll();	// 출력 메소드

	}

}
