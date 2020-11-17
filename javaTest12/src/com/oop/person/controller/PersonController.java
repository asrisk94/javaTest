package com.oop.person.controller;

import java.util.Scanner;

import com.oop.person.model.vo.Person;

public class PersonController {
	
	Person[] p = new Person[5];
	
	
	
	public void insertPerson() {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<p.length; i++) {
			
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("키 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("재산 : ");
			int property = sc.nextInt();
			
			p[i] = new Person(name, age, height, weight, property);
		}
		
	}
	
	
	
	public void printPerson() {
		
		for(int i=0; i<p.length; i++) {
			System.out.println(p[i].information());
		}
	}
	
	
	
	public String getPersonAVG() {
		
		double sum1=0, sum2=0, sum3=0, sum4=0;
		
		for(int i=0; i<p.length; i++) {
			sum1 += p[i].getAge();
			sum2 += p[i].getHeight();
			sum3 += p[i].getWeight();
			sum4 += p[i].getProperty();
		}
		
		double avgAge = sum1/p.length;
		double avgHeight = (Math.round((sum2/p.length)*100))/100.0;
		double avgWeight = (Math.round((sum3/p.length)*100))/100.0;
		double avgProperty = (Math.round((sum4/p.length)*100))/100.0;
		
		return "평균 나이 : " + avgAge + "\t평균 키 : " + avgHeight 
				+ "\n평균 몸무게 : " + avgWeight + "\t평균 재산 : " + avgProperty;
		
	}
	
}
