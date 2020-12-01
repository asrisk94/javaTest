package com.collection.set.lotto;

import java.util.TreeSet;



public class Lotto {

	public static void main(String[] args) {
		Lotto.lottoDisplay();
	}
	
	
	
	
//	 - 메소드 추가 : public static void lottoDisplay(){}
//	    >> 구현내용
//	    1. 1 ~ 45 사이의 정수를 중복되지 않게, 6개 발생시켜
//	    2. 자동 오름차순정렬되게 처리하는 Set 계열에 보관하고 
//	    3. Integer[]로 바꾸어 출력함. (toArray(T[]) 사용할 것)
	
	public static void lottoDisplay() {
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		while(ts.size()<6) {
			int num = (int)((Math.random()*45)+1);
			ts.add(num);
		}
		
		Integer[] it = ts.toArray(new Integer[]{0});
		
		for( int a : it) {
			
			System.out.print(a + " ");
		}
		
	}

}
