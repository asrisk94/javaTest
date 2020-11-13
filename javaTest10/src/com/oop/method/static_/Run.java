package com.oop.method.static_;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethod s = new StaticMethod();
		
		StaticMethod.toUpper();
		
		StaticMethod.setChar(1, 'g');
		
		System.out.println(StaticMethod.valueLength());
		
		System.out.println(StaticMethod.valueConcat("홍길동"));
		
		
	}

}
