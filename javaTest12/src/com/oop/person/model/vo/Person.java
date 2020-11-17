package com.oop.person.model.vo;

public class Person {
	
//	Person 멤버변수 이름, 나이, 키, 몸무게, 재산
//    기본생성자, 모든필드초기화생성자
//    getter, setter
//    출력메소드 information()
	
	private String name;
	private int age;
	private double height;
	private double weight;
	private int property;
	
	
	
	public Person() {
		
	}
	
	public Person(String name, int age, double height, double weight, int property) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.property = property;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getProperty() {
		return property;
	}
	public void setProperty(int property) {
		this.property = property;
	}
	
	
	
	public String information() {
		return "이름 : " + name + "\t나이 : " + age + "\t키 : " + height 
				+ "\n몸무게 : " + weight + "\t재산 : " + property;
	}
	
	
	
	
	

}
