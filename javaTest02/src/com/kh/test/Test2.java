package com.kh.test;

public class Test2 {

	public static void main(String[] args) {
//		=======================================================================
//			이름      나이  성별    전화번호          이메일           주소
//		=======================================================================
//			홍길동       22      남     01012341234    hgd@naver.com    경기도 광주시
//			홍길순       20      여     010123412341   hgs@gmail.com    전라남도 광주시
		
		System.out.println("=======================================================================\n"
				+ "\t이름\t나이\t성별\t전화번호\t\t이메일\t\t주소\n"
				+ "=======================================================================");
		
		PersonalInfo HongGilDong = new PersonalInfo("홍길동", 22, "남", "01012341234", "hgd@naver.com", "경기도 광주시"); 
		PersonalInfo HongGilSoon = new PersonalInfo("홍길순", 20, "여", "010123412341", "hgsGmail.com", "전라남도 광주시");

		HongGilDong.Info();
		HongGilSoon.Info();
		
	}
}

class PersonalInfo {
	String name;
	int age;
	String gender;
	String phoneNumber;
	String eMail;
	String address;
	
	public PersonalInfo(String a, int b, String c, String d, String e, String f) {
		name = a;
		age = b;
		gender = c;
		phoneNumber = d;
		eMail = e;
		address = f;
	};
	
	public void Info() {
		System.out.printf("\t%s\t%d\t%s\t%s\t%s\t%s\n", 
				name, age, gender, phoneNumber, eMail, address);
	}
}

