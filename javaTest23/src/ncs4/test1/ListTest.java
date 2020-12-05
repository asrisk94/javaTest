package ncs4.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class ListTest {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();		// 중복제거용 셋
		
		while(set.size()<10) {					// 10개가 되지 않으면 계속 반복
			
			int num = (int)(Math.random()*100+1);	// 난수
			set.add(num);							// 셋에 배정
		}
		
		List<Integer> list = new ArrayList<>(set);		// 리스트
		Comparator<Integer> c = new Decending();		// 내림차순 컴퍼레이터
		
		Collections.sort(list, c);					// 내림차순 정렬
		
		ListTest lt = new ListTest();
		lt.display(list);				// 디스플레이 실행
		
	}
	
	public void display(List list) {
		
		System.out.println(list);			// 인출
	}

}
