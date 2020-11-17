package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

public class CoffeeManager {
	
//    1. Coffee 클래스에 대한 객체 배열(세계3대커피정보) 선언함. 배열크기 3.
//    2. 사용자에게 키보드로 세계3대 커피정보를 입력받아, 각 객체에 기록함
//    3. 출력 확인함
//    <세계3대커피>
//    ---------------------------
//    원산지           지역
//    ---------------------------
//    예멘          모카마타리
//    자메이카       블루마운틴
//    하와이           코나
//    ---------------------------
	
	Coffee[] co = new Coffee[100];
	int idx = 0;
	
	
	public void coInput() {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<co.length; i++) {
			System.out.print("원산지 : ");
			String origin = sc.next();
			
			System.out.print("지역 : ");
			String location = sc.next();
			
			co[i] = new Coffee(origin, location);
			idx++;
			
			System.out.print("추가로 입력하시겠습니까? (y/n) : ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'n') break;
		}
		
	}
	
	public void coOutput() {
		System.out.println("-------------------------\n"
				+ "원산지\t지역\n"
				+ "-------------------------");
		
		for(int i=0; i<idx; i++) {
			System.out.println(co[i].print());
		}
		
		System.out.println("--------------------");
	}
	
	
}
