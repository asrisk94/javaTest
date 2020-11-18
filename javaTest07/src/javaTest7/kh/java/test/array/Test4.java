package javaTest7.kh.java.test.array;

import java.util.Scanner;

public class Test4 {
	public void test1() {
//	    사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
//	    단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
//	     
//	        힌트) 복사방법
//	       - for문이용 1:1대입
//	       - System.arraycopy() 매소드 이용
//	       - clone() 매소드 이용
		
		Scanner sc = new Scanner(System.in);
		char[] userNumArr = new char[11];		// 11자리 문자형 배열 생성
		char[] asterisk = new char[11];
		
		for(int i=0; i<asterisk.length; i++) {	// 별표 배열 생성
			asterisk[i] = '*';
		}
		
		
		
		System.out.print("전화번호를 입력하세요(띄어쓰기 없이) > ");
		String userNum = sc.next();						// 번호 입력
		
		for(int i=0; i<userNumArr.length; i++) {
			userNumArr[i] = userNum.charAt(i);			// 배열에 한자씩 할당
		}
		
		char[] userNumArr2 = userNumArr.clone();		// 배열 깊은 복사
		
		System.arraycopy(asterisk, 3, userNumArr2, 3, 4);	// 별표 복사
		
		
		
		for(int i=0; i<userNumArr2.length; i++) {		// 출력
			System.out.print(userNumArr2[i]);
		}
		
		
	} // 메소드 괄호
	
	
	public void test2() {
//	    위문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
//	    * java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
//	    * 문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전화번호를 입력하세요(띄어쓰기 없이) > ");		// 전화번호 입력
		String userNum = sc.next();
		
		String userNumAst = userNum.substring(0, 3) + "****" +  userNum.substring(7);
		// 가운데 별표 삽입. substring 이용
		
		System.out.println(userNumAst);		// 출력
		
		
		
	}  // 메소드 괄호

}
