package com.oop.method.nonstatic;

import java.util.Arrays;

public class NonStaticSample {

	public static void main(String[] args) {
		
		NonStaticSample n = new NonStaticSample();
		
		n.printLottoNumbers();
		n.outputChar(3, 'a');
		
		System.out.println(n.alphabet());
		System.out.println(n.mySubstring("", 2, 5));
		
	} // 메인메소드 괄호
	
	
	
	public void printLottoNumbers() {
		
		int[] lotto = new int[6];
		int idx = 0;
		
		outer :
		while(true) {
			int num = (int)(Math.random()*45+1);
			
			for(int i=0; i<idx; i++) {
				if(lotto[i] == num) continue outer;
			}
			lotto[idx++] = num;
			if(idx == 6) break;
		}
		
		Arrays.sort(lotto);
		
		System.out.println(Arrays.toString(lotto));
		
	} // printLottoNumbers() 괄호
	
	
	
	public void outputChar(int num, char ch) {
		
		for(int i=0; i<num; i++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
	} // outputChar(int num, char ch) 괄호
	
	
	
	public char alphabet() {
		int num;
		
		while(true) {
			num = (int)(Math.random()*122+1);
			if((num >= 'a' && num<='z') || (num >= 'A' && num <= 'Z'))
				break;
		}
		
		char ch = (char)num;
		return ch;
		
	} // alphabet() 괄호
	
	
	
	public String mySubstring(String str, int start, int finish) {
		
		String str_ = null;
		
		if(str == null || str == "") {
			return str_;
		}
		else {
			for(int i = start; i<finish; i++) {
				if(i==start) {
					str_ = Character.toString(str.charAt(i));
					continue;
				}
				str_ += str.charAt(i);
			}
			return str_;
		}
		
	} // mySubstring(String str, int start, int finish) 괄호
	
	

}
