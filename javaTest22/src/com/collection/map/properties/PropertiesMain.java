package com.collection.map.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;



public class PropertiesMain {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("resources/config.Properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		Enumeration<?> names = prop.propertyNames();	// key 모음  - 이뉴머레이션 활용
														// iterator 같은 기능
		while(names.hasMoreElements()) {
			String name = (String)names.nextElement();	// name은 key만 모아놨음
			
			String value = prop.getProperty(name);
			System.out.println(name + " = " + name);
		}
	}

}
