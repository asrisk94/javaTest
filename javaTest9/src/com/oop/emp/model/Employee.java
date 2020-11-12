package com.oop.emp.model;

import java.util.Scanner;

public class Employee {
	
	private int empNo;			// 사번
	private String empName;		// 이름
	private String dept;		// 소속부서
	private String job;			// 직급
	private int age;			// 나이
	private char gender;		// 성별
	private int salary;			// 급여
	private double bonusPoint;	// 보너스포인트
	private String phone;		// 핸드폰
	private String address;		// 주소
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDept() {
		return dept;
	}
	public String getJob() {
		return job;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public int getSalary() {
		return salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public String getPhone() {
		return phone;
	}	
	public String getAddress() {
		return address;
	}	
	
	public void empInput() {				// 키보드입력 메소드
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사번 : ");
		this.empNo = sc.nextInt();
		System.out.print("이름 : ");
		this.empName = sc.next();
		System.out.print("소속부서 : ");
		this.dept = sc.next();
		System.out.print("직급 : ");
		this.job = sc.next();
		System.out.print("나이 : ");
		this.age = sc.nextInt();
		System.out.print("성별(남/여) : ");
		this.gender = sc.next().charAt(0);
		System.out.print("급여 : ");
		this.salary = sc.nextInt();
		System.out.print("보너스포인트 : ");
		this.bonusPoint = sc.nextDouble();
		System.out.print("핸드폰번호 : ");
		this.phone = sc.next();
		sc.nextLine();
		System.out.print("주소 : ");
		this.address = sc.nextLine();
	}	// empInput 메소드 괄호
	
	public void empOutput () {		// 사원정보 출력 메소드
		System.out.printf("사번 : %d%n이름 : %s%n소속부서 : %s%n직급 : %s%n나이 : %d%n"
				+ "성별 : %c%n급여 : %d%n보너스포인트 : %.0f%n핸드폰번호 : %s%n주소 : %s%n", 
				empNo, empName, dept, job, age, 
				gender, salary, bonusPoint, phone, address);
	}	// empOutput 메소드 괄호
	
	public void empDel() {	// 사원정보 삭제
		this.empNo = 0;	
		this.empName = null;		
		this.dept = null;		
		this.job = null;		
		this.age = 0;	
		this.gender = ' ';	
		this.salary = 0;	
		this.bonusPoint = 0.0;
		this.phone = null;
		this.address = null;
	}	// empDel 메소드 괄호
	
}
