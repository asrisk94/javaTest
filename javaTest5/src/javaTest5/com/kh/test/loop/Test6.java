package javaTest5.com.kh.test.loop;

import java.util.Scanner;

public class Test6 {
	public void test() {
//	    분식집 주문 받는 프로그램을 만들어 보세요.
//	    
//	    1. 메뉴선택
//	    2. 수량선택
//	    3. 추가주문선택 
//	    4. y면 1번부터 다시 시작. 단 데이터는 누적 
//	    5. n면 주문결과서 출력 
//	    메뉴
//	    김밥류 ===================
//	    1.원조김밥===========1500원
//	    2.치즈김밥===========2000원
//	    3.참치김밥===========2300원
//	    라면류 ===================
//	    4.그냥라면===========3000원
//	    5.치즈라면===========3500원
//	    6.짬뽕라면===========4000원
//	    분식류 ===================
//	    7.떡볶이=============2500원
//	    8.순대==============2500원
//	    9.오뎅==============1000원
//	    기타 ====================
//	    10.음료수===========1000원
//	    결과
//	    주문하신 정보는 다음과 같습니다.
//	    ----------------------------
//	    치즈라면: 3개 - 10500원
//	    그냥라면: 3개 - 9000원
//	    음료수: 3개 - 3000원
//	    ----------------------------
//	    합계 : 22500원
		
		Scanner sc = new Scanner(System.in);
		int choice;							// 선택번호
		
		
		int price1 = 1500;
		int price2 = 2000;
		int price3 = 2300;
		int price4 = 3000;
		int price5 = 3500;
		int price6 = 4000;
		int price7 = 2500;
		int price8 = 2500;
		int price9 = 1000;
		int price10 = 1000;					// 가격
		
		
		int first = 0, firstPrice;
		int second = 0, secondPrice;
		int third = 0, thirdPrice;
		int forth = 0, forthPrice;
		int fifth = 0, fifthPrice;
		int sixth = 0, sixthPrice;
		int seventh = 0, seventhPrice;
		int eighth = 0, eighthPrice;
		int nineth = 0, ninethPrice;
		int tenth = 0, tenthPrice;			// 메뉴 넘버, 메뉴당 총가격
		
		int total;							// 총 합계 가격
		
		
		String menu = "\t메뉴\n" 
					+ "김밥류 ===================\n"
					+ "1.원조김밥===========1500원\n"
					+ "2.치즈김밥===========2000원\n"
					+ "3.참치김밥===========2300원\n"
					+ "라면류 ===================\n"
					+ "4.그냥라면===========3000원\n"
					+ "5.치즈라면===========3500원\n"
					+ "6.짬뽕라면===========4000원\n"
					+ "분식류 ===================\n"
					+ "7.떡볶이=============2500원\n"
					+ "8.순대==============2500원\n"
					+ "9.오뎅==============1000원\n"
					+ "기타 ====================\n"
					+ "10.음료수===========1000원\n";
		
		
		do {
			System.out.println(menu);
			System.out.print("메뉴 선택(1~10 숫자 입력  / 추가주문 원치 않을 시 다른 숫자 입력) : ");
			choice = sc.nextInt();
			
			if(choice == 1)					// 메뉴 입력 및 갯수 카운트
				first++;
			if(choice == 2)
				second++;
			if(choice == 3)
				third++;
			if(choice == 4)
				forth++;
			if(choice == 5)
				fifth++;
			if(choice == 6)
				sixth++;
			if(choice == 7)
				seventh++;
			if(choice == 8)
				eighth++;
			if(choice == 9)
				nineth++;
			if(choice == 10)
				tenth++;
			if(!(choice == 1 || choice == 2 ||
					choice == 3 || choice == 4 ||
					choice == 5 || choice == 6 ||
					choice == 7 || choice == 8 ||
					choice == 9 || choice == 10))
				break;
		} while(true);
		
		
		firstPrice = first*price1;
		secondPrice = second*price2;
		thirdPrice = third*price3;
		forthPrice = forth*price4;
		fifthPrice = fifth*price5;
		sixthPrice = sixth*price6;
		seventhPrice = seventh*price7;
		eighthPrice = eighth*price8;
		ninethPrice = nineth*price9;
		tenthPrice = tenth*price10;			// 메뉴당 총가격 할당
		
		total = firstPrice 					// 총 합계 가격
				+ secondPrice 
				+ thirdPrice 
				+ forthPrice 
				+ fifthPrice
				+ sixthPrice 
				+ seventhPrice 
				+ eighthPrice 
				+ ninethPrice 
				+ tenthPrice;
		
		System.out.print(" 주문하신 정보는 다음과 같습니다.\n ----------------------------\n");
		
		if(first != 0)
			System.out.printf(" 원조김밥 :  %d개  %d원%n", first, firstPrice);
		if(second != 0)
			System.out.printf(" 치즈김밥 :  %d개  %d원%n", second, secondPrice);
		if(third != 0)
			System.out.printf(" 참치김밥 :  %d개  %d원%n", third, thirdPrice);
		if(forth != 0)
			System.out.printf(" 그냥라면 :  %d개  %d원%n", forth, forthPrice);
		if(fifth != 0)
			System.out.printf(" 치즈라면 :  %d개  %d원%n", fifth, fifthPrice);
		if(sixth != 0)
			System.out.printf(" 짬뽕라면 :  %d개  %d원%n", sixth, sixthPrice);
		if(seventh != 0)
			System.out.printf(" 떡볶이 :  %d개  %d원%n", seventh, seventhPrice);
		if(eighth != 0)
			System.out.printf(" 순대 :  %d개  %d원%n", eighth, eighthPrice);
		if(nineth != 0)
			System.out.printf(" 오뎅 :  %d개  %d원%n", nineth, ninethPrice);
		if(tenth != 0)
			System.out.printf(" 음료수 :  %d개  %d원%n", tenth, tenthPrice);

		System.out.println(" ----------------------------");
		
		System.out.printf(" 합계 : %d원", total);
		
	}  // 메소드 괄호

}
