package workshop5;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		// 스캐너 클래스
		
		System.out.print("입력 : ");
		String str = sc.nextLine();					// 입력 받음
		
		char[] chArr1 = str.toCharArray();			// 차 배열로 변환
		char[] chArr2 = new char[chArr1.length];	// 뒤집어 받을 차 배열 준비
		
		int j=chArr1.length-1;						// 인덱스 (길이-1)부터 역순
		for(int i=0; i<chArr1.length; i++) {		// 인덱스 0~(길이-1)
			chArr2[j] = chArr1[i];					// 차 배열 복사
			j--;									// 역순 인덱스 감소
		}
		
		str = new String(chArr2);					// String형으로 변환
		System.out.println(str);

	}

}
