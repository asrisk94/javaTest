package com.oop.method.static_;

public class StaticMethod {
	
    private static String value = "abc";
    
    
    
    public static void toUpper() {
    	
    	String str = "";
    	
    	for(int i=0; i<value.length(); i++) {
    		char ch = value.charAt(i);
    		if(ch>= 'a' && ch<='z')
    			ch -= 32;
    		str += ch;
    	}
    	
    	System.out.println(str);
    }
    
    
    
    public static void setChar(int i, char ch) {
    	
    	String str = "";
    	
    	for(int j=0; j<value.length(); j++) {
    		if(j == i) {
    			str += ch;
    		} else {
    			str += value.charAt(j);
    		}
    	}
    	System.out.println(str);
    }
    
    
    
    public static int valueLength() {
    	
    	return value.length();
    	
//    	int i = 0;
//    	int count = 0;
//    	while(true) {
//    		char ch = value.charAt(i);
//    		if(ch == null) break;
//    		i++; count++;
//    	}
//    	return count;
    }
    
    
    
    public static String valueConcat(String str) {
    	
    	str = value + str;
    	return str;
    }
    
    
}
