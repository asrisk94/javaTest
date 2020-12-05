package com.thread.alphabet;

public class AlphabetTest {
	
	public static void main(String[] args) {
		
		AlphabetTest abt = new AlphabetTest();
		
		abt.test();
		
	}

	private void test() {
		
		Thread th1 = new Thread(new UpperAlphbetThread());
		Thread th2 = new Thread(new LowerAlphbetThread());
		
		th1.start();
		th2.start();
		
	}
	

}
