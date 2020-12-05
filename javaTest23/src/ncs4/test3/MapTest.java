package ncs4.test3;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class MapTest {

	public static void main(String[] args) {
		
		Map<String, Inventory> map = new HashMap<>();			// 맵 객체 생성
		
		map.put("삼성 갤러기S7", new Inventory("삼성 갤럭시S7", new GregorianCalendar(2016, 3, 15), 30));
		map.put("LG G5", new Inventory("LG G5", new GregorianCalendar(2016, 2, 25), 20));
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro", new GregorianCalendar(2016, 1, 23), 15));
		// 자료 삽입
		
		
		Iterator<Entry<String, Inventory>> set = map.entrySet().iterator();		// 이터레이터 활용
		Inventory[] invArr = new Inventory[map.size()];							// 인벤토리 배열
		
		int i=0;
		while(set.hasNext()) {
			Entry<String, Inventory> entry = set.next();		// 엔트리형에 토큰 배정
			entry.getValue().setInventoryAmount(entry.getValue().getPutAmount()-entry.getValue().getGetAmount());
			System.out.println(entry.getValue());					// 입고수량에서 출고수량을 뺀 것을 재고수량으로 지정
			
			invArr[i] = entry.getValue();		// 별도로 인벤토리 배열에 밸류값을 담고 있음
			i++;								// 포문의 인덱스처럼 활용
		}
		
		for(i=0; i<map.size(); i++) {
			invArr[i].getGetDate().getInstance();			// 출고일에 오늘 날짜 가져옴
			invArr[i].setGetAmount(10);						// 출고갯수 10개
		}
		
		System.out.println();				// 콘솔창 편의 구분용 한 줄 띄기
		
		try {
			for(i=0; i<map.size(); i++) {
				if(invArr[i].getInventoryAmount()<invArr[i].getGetAmount()) {	// 재고보다 출고갯수가 많다면
					throw new AmountNotEnough();								// ANE 던짐
				} else {
					invArr[i].setInventoryAmount(invArr[i].getInventoryAmount() - invArr[i].getGetAmount());
					System.out.println(invArr[i]);		// 수량 괜찮다면, 재고갯수 맞추고 출력
				}
			} // for문 괄호
		} catch(AmountNotEnough e) {
			System.out.println("현재 재고가 부족합니다. 재고수량을 확인하시기 바랍니다.");		// ANE 예외처리
		}
		
	}

}
