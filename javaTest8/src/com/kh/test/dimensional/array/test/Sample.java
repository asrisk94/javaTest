package com.kh.test.dimensional.array.test;

public class Sample {
	
	public void exercise1() {
//	    1. 3행4열 2차원배열 선언 및 생성
//	    2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
//	    3. 아래의 내용처럼 처리함
//	        0열    1열    2열    3열    
//	    0행    값 값 값     0행 값들의 합계
//	    1행    값 값 값 1행 값들의 합계
//	    2행    값 값 값 2행 값들의 합계
		
		int[][] arr = new int[3][4];		// 배열 생성
		int sum = 0;						// 합계 출력용
		
		for(int i=0; i<=2; i++) {			// 임의의 정수값 할당
			for(int j=0; j<=2; j++) {
				arr[i][j] = (int)(Math.random()*100+1);
			}
		}
		
		for(int i=0; i<=2; i++) {			// 출력
			for(int j=0; j<=2; j++) {
				System.out.print(arr[i][j] + " ");	// 같은 행안에 열들 출력
				sum += arr[i][j];					// 합계 구하기
			}
			System.out.println(" 합계 : " + sum);		// 행 끝날 때마다 합계 출력
		}
		
		
		
		
	} // 메소드 괄호

}
