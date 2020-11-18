package com.kh.test.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomTest r = new RandomTest();
//		r.test1();
		r.test2();

	}
	
	public void test1() {
		/*
		 * 0~9
		 * 1~10
		 * 20~35
		 * 0 or 1
		 */
		
		double a = Math.random()*10;
		int num1 = (int)a;
		
		Random random = new Random();
		int num2 = random.nextInt(10)+1;
		int num3 = random.nextInt(16)+20;
		
		double b = Math.random()*2;
		int num4 = (int)b;
		
		System.out.println("0~9 랜덤 정수 : "+num1);
		System.out.println("1~10 랜덤 정수 : "+num2);
		System.out.println("20~35 랜덤 정수 : "+num3);
		System.out.println("0 또는 1 : "+num4);
	}
	
	public void test2() {
		/*
		 * 가위바위보 중에 하나를 선택해 승패를 결정하는 게임
		 * 승패결정 if문은 중첩 if문 금지 (||와 && 연산자 활용)
		 * 
		 * =====가위바위보 게임=====
		 * 숫자를 선택하세요(1.가위/2.바위/3.보):1
		 * =========결과==========
		 * 당신은 가위를 냈습니다.
		 * 컴퓨터는 보를 냈습니다.
		 * ====================
		 * 당신이 이겼습니다. ㅠㅠ
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String result;
		
		System.out.println("=====가위바위보 게임=====");
		System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보): ");
		int userRsp = sc.nextInt();
		int comRsp = random.nextInt(3)+1;
		
		if(userRsp==1) {
			 result = comRsp == 2 ? "컴퓨터가 이겼습니다. ㅗ" : (comRsp == 3 ? "당신이 이겼습니다. ㅠ" : "비겼습니다.");
		} else if(userRsp==2) {
			 result = comRsp == 3 ? "컴퓨터가 이겼습니다. ㅗ" : (comRsp == 1 ? "당신이 이겼습니다. ㅠ" : "비겼습니다.");
		} else {
			 result = comRsp == 1 ? "컴퓨터가 이겼습니다. ㅗ" : (comRsp == 2 ? "당신이 이겼습니다. ㅠ" : "비겼습니다.");
		}
		
		String a = userRsp==1 ? "가위" : (userRsp==2 ? "바위" : "보");
		String b = comRsp==1 ? "가위" : (userRsp==2 ? "바위" : "보");
		
		System.out.println("=========결과==========");
		System.out.printf("당신은 %s를 냈습니다.%n컴퓨터는 %s를 냈습니다.%n", a, b);
		System.out.println("====================");
		System.out.println(result);
		
	}

}
