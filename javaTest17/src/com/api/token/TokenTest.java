package com.api.token;

import java.util.StringTokenizer;

public class TokenTest {
	
	public static void main(String[] args) {
		
		TokenTest t = new TokenTest();
		
		t.test();
		
	}
	
	public void test() {
		
		String str = "J a v a P r o g r a m ";		// 문자열
		
		System.out.println("[" + str + "]");				// 출력
		System.out.println("처리 전 글자 갯수 : " + str.length());	// 처리 전 갯수
		
		
		
		StringTokenizer token = new StringTokenizer(str, " ");	// 토크나이저
		int count = token.countTokens();					// 토큰 갯수 고정
		
		System.out.println("처리 후 글자 갯수 : " + count);		// 처리 후 갯수
		
		
		
		char[] ch = new char[count];					// char 배열 생성
		int idx = 0;									// 인덱스 생성
		
		while(token.hasMoreTokens()) {				// 토큰 수만큼 반복
			ch[idx++] = token.nextToken().charAt(0);	// 배열 칸마다 토큰값 배정
		}
		
		
		
		String st = "";						// 비어있는 스트링 변수 생성
		
		for(int i=0; i<count; i++) {
			System.out.print(ch[i]);			// 차배열 값 출력
			st += ch[i];						// 동시에 스트링화 진행
		}
		System.out.println();
		
		
		
		st = st.toUpperCase();					// 대문자화 진행
		System.out.println(st);					// 출력
		
	}
	
//	"J a v a P r o g r a m " 문자열 값을
//	공백 단위로 Tocken 처리하여 char [] 에 저장하여 출력하시오.
//	- 토큰 처리전 글자 출력
//	- 전 글자갯수 출력
//	- 토큰 처리 후 글자갯수 출력 확인
//	- char [] 값 출력
//	- char [] 을 다시 String 으로 바꾼 후 
//	- 모두 대문자로 변환하여 출력

}
