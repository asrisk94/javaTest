package javaTest7.kh.java.test.array;

import java.util.Scanner;

public class Test5 {
	public void test() {
//	    주민등록번호 성별자리 이후부터 *로 가리기.  
//	    단, 원본 배열값은 변경 없이 배열 복사본으로 
//	    변경하세요
//	     
//	    힌트) 복사방법
//	       - for문이용 1:1대입
//	       - System.arraycopy() 매소드 이용
//	       - clone() 매소드 이용
		
		Scanner sc = new Scanner(System.in);
		char[] userCh = new char[13];				// 주민번호 받을 배열 생성
		char[] asterisk = new char[13];
		
		for(int i=0; i<asterisk.length; i++) {		// 별 배열 생성
			asterisk[i] = '*';
		}
		
		
		System.out.print("주민등록번호 입력 (띄어쓰기 없이) > ");	// 입력
		String userNum = sc.next();
		
		for(int i=0; i<userCh.length; i++) {			// 배열에 할당
			userCh[i] = userNum.charAt(i);
		}
		
		char[] userCh2 = userCh.clone();				// 배열 깊은 복사
		
		System.arraycopy(asterisk, 7, userCh2, 7, 6);	// 별표 처리
		
		for(int i=0; i<userCh2.length; i++) {			// 출력
			System.out.print(userCh2[i]);
		}
		
		
	} // 메소드 괄호

}
