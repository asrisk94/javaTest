package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class Run {
	public static void main(String[] args) {
		
		Run r = new Run();		
		
		Employee e = new Employee();
		
		r.mainMenu(e);
		
	}	// 메인 메소드 괄호
	
	public void mainMenu(Employee emp) {
		
		Scanner sc = new Scanner(System.in);
		
		int userInput;
		
		do {
			do {
				System.out.print("*****사원 정보 관리 프로그램*****\n" 
						+ "1. 새 사원정보 입력\n2. 사원정보 삭제\n3. 사원정보 출력\n9. 끝내기\n" 
						+ "***********************\n");
			
				System.out.print("사용할 메뉴 번호 입력 > ");
				userInput = sc.nextInt();
				if(userInput==1 || userInput==2 || userInput==3 || userInput==9) {
					break;
				}
				System.out.println("\n잘못 입력하셨습니다.\n");
			} while(true);
			
			System.out.println();
			
			switch(userInput) {
			case 1 : emp.empInput(); System.out.println(); break;
			case 2 : emp.empDel(); break;
			case 3 : emp.empOutput(); System.out.println(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); break;
			}
			
		}while(userInput ==1 || userInput ==2 || userInput ==3);
		
		
		
	}	// 메인메뉴 메소드 괄호
	
	
	
}
