package javaTest5.com.kh.test.loop;

import java.util.Scanner;

public class Test5 {
	public void test() {
//	    3명의 회원정보를 입력 받아 저장하고 출력하는 
//	    프로그램을 만드세요
//	     입력 : 이름, 나이, 주소, 키, 몸무게, 연락처
//	    
//	    출력 예) 
//	    ================ 저장회원===============
//	    1 홍길동 19세 서울시 강남구 170cm 68kg 01012345678
//	    2 임걱정 20세 경기도 수원시 180cm 75kg 01012345678
//	                               
//	    //기능추가1
//	    //출력결과 마지막행에 다음 항목에 대한 평균을 구하시오.
//	    ============================================
//	    평균나이 00세 / 평균 키 : 00CM / 평균 몸무게 : 00kg
		
		Scanner sc = new Scanner(System.in);
		int i = 0;									// 반복용
		int count = 0;							// 회원 숫자 세기용
		
		double totAge = 0, averAge;
		double totHeight = 0, averHeight;
		double totWeight = 0, averWeight;					// 합계용, 평균용
		
		String[] name = new String[100];
		double[] age = new double[100];
		String[] addr = new String[100];
		double[] height = new double[100];
		double[] weight = new double[100];
		String[] number = new String[100];				// 적당한 크기의 배열 생성
		
		
		for(i=0; i<=99; i++) { 							// 회원정보 입력 반복문
			
			System.out.print("이름을 입력하세요. > ");
			name[i] = sc.next();
			System.out.print("나이를 입력하세요. (숫자만) > ");
			age[i] = sc.nextInt();
			sc.nextLine();
			System.out.print("주소를 입력하세요.");
			addr[i] = sc.nextLine();
			System.out.print("키를 입력하세요. (숫자만 / 단위 : cm) > ");
			height[i] = sc.nextDouble();
			System.out.print("몸무게를 입력하세요. (숫자만 / 단위 : kg) > ");
			weight[i] = sc.nextDouble();
			sc.nextLine();
			System.out.print("연락처를 입력하세요. > ");
			number[i] = sc.nextLine();
			count++;						// 회원 숫자 카운트
			
			System.out.print("다음 회원의 정보를 입력하시겠습니까? (y/n) : ");
			char choice = sc.next().charAt(0); 			 // 추가 입력 여부 확인
			if(choice != 'y') {
				break;  							// 추가 입력 없을 시 반복문 정지
			}
		}  // 반복문 괄호
		
		for(i=0; i<count; i++) {
			totAge += age[i];
			totHeight += height[i];
			totWeight += weight[i];
		}												// 합계
		
		averAge = totAge/count;
		averHeight = totHeight/count;
		averWeight = totWeight/count;
		
		System.out.println("========================= 저장 회원  =========================");
		
		for(i=0; i<count; i++) {
			System.out.printf("%d  %s   %.0f   %s   %.0fcm   %.0fkg   %s%n",
					(i+1), name[i], age[i], addr[i], height[i], weight[i], number[i]);
		}
		
		System.out.println("=========================================================");
		System.out.printf("평균나이 : %.2f세 / 평균키 : %.2fcm / 평균몸무게 : %.2fkg%n", averAge, averHeight, averWeight);
		
	} // 메소드 괄호

} // 클래스 괄호
