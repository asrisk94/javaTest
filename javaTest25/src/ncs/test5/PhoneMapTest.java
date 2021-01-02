package ncs.test5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;



public class PhoneMapTest {

	public static void main(String[] args) {
		
		Map<String, Phone> map = new HashMap<String, Phone>();
		
		Phone p1 = new Phone("galaxy S7", 563500, "삼성", 7);
		Phone p2 = new Phone("iphone 6s", 840000, "애플", 3);
		Phone p3 = new Phone("G5", 563500, "LG", 5);			// 폰 객체들 생성

		map.put(p1.getModel(), p1);						// key = 객체들 모델명
		map.put(p2.getModel(), p2);						// value = 객체 자체
		map.put(p3.getModel(), p3);						// map에 담음.
		
		Properties prop = new Properties();				// 프로퍼티 객체 미리 선언
		
		Iterator<Entry<String, Phone>> entrySet = map.entrySet().iterator();
														// 엔트리셋 활용 -> "key=value"형태의 셋을 만들어 이터레이터
		while(entrySet.hasNext()) {
			Entry<String, Phone> entry = entrySet.next();	// entry 안에는 key=value 형태의 요소들이 들어간다.
			
			String key = entry.getKey();					// 한 객체 안에서 키밸류를 꺼내고 있다.
			Phone value = entry.getValue();
			
			System.out.println(key + "=" + value.toString());	// 꺼낸거 출력
			
			prop.put(key, value.toString());					// 루프 돌면서 프로퍼티에 담기도 동시 진행
		}
		
		try {
			prop.storeToXML(new FileOutputStream("phone.xml"), null);	// xml 파일로 저장
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
