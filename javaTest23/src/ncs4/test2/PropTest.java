package ncs4.test2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;



public class PropTest {

	
	
	public static void main(String[] args) {	// 메인 메소드
		
		Properties prop = new Properties();		// 프로퍼티 선언
		
		prop.put("1", "apple,1200,3");
		prop.put("2", "banana,2500,2");
		prop.put("3", "grape,4500,5");
		prop.put("4", "orange,800,10");
		prop.put("5", "melon,5000,2");			// 데이터 입력
		
		
		
		PropTest pt = new PropTest();			// 메인메소드 실행용 객체
		
//		pt.fileSave(prop);
		pt.fileOpen();

	}
	
	
	
	public void fileSave(Properties p) {
		
		String fileName = "data.xml";			// 저장 경로
		BufferedOutputStream bos = null;		// 출력용 객체 선언
		
		try {
			
			bos = new BufferedOutputStream(new FileOutputStream(fileName));
			p.storeToXML(bos, "과일");			// 객체 내용 생성 및 xml로 저장
			
		} catch (IOException e) {				// 예외처리
			e.printStackTrace();
		} finally {
			try {
				bos.close();					// 닫음 필수
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일 저장 완료");
		
	}	// fileSave 메소드 괄호
	
	
	
	/*
	 *  특히 어렵다. 프로퍼티로 읽어온 후
	 *  키는 인트로, 밸류는 잘라서 객체화하여 다시 맵에 담은 뒤
	 *  키값 순서대로 출력해야한다.
	 */
	public void fileOpen() {
										
		String fileName = "data.xml";				// 읽어올 경로
		Properties p = new Properties();			// 프로퍼티 객체 생성
		BufferedInputStream bis = null;				// 읽음용 객체 생성
		
		
		
		try {
			
			bis = new BufferedInputStream(new FileInputStream(fileName));
			p.loadFromXML(bis);			// 객체 내용 생성 및 프로퍼티로 xml 파일 읽어옴
			
			
			
			Enumeration<?> names = p.propertyNames();	// 프로퍼티 키 모음
			String[] strArr1 = new String[p.size()];	// 키 배열
			String[] strArr2 = new String[p.size()];	// 밸류 배열
			int[] intArr = new int[p.size()];			// 키 인트화
			
			int i=0;
			while(names.hasMoreElements()) {				// 키값 돌림
				strArr1[i] = (String)names.nextElement();	// 키 배열 완성
				strArr2[i] = p.getProperty(strArr1[i]);		// 밸류 배열 완성
				intArr[i] = Integer.parseInt(strArr1[i]);	// 키 인트화 배열 완성
				i++;				// 포문처럼 i 활용
			}
			
			

			Fruit[] f = new Fruit[p.size()];			// 프루트 배열 생성
			
			for(i=0; i<strArr2.length; i++) {
													// 각 배열의 문자열을  ,기준으로 자름
				StringTokenizer token = new StringTokenizer(strArr2[i], ",");
				
				String name = token.nextToken();					// 첫 번째 토큰은 이름
				int price = Integer.parseInt(token.nextToken());	// 두번째는 인트화해서 가격
				int quantity = Integer.parseInt(token.nextToken());	// 세번째는 수량에 담음
				
				f[i] = new Fruit(name, price, quantity);		// 프루트 객체화해서 배열에 담음
			}
			
			
			
			Map<Integer, Fruit> map = new TreeMap<>();		// 트리맵 객체 생성
			
			for(i=0; i<p.size(); i++) {
				map.put(intArr[i], f[i]);		// 인트화한 키와 프루트 객체들을 맵에 담음
			}
			
			
			
			Set<Integer> keySet = map.keySet();		// 키 모음
			
			for(int key: keySet) {		// 키가 돌면서  '키 = 밸류'의 형태로 출력
				System.out.println(key + " = " + map.get(key));
			}
			
			
			
		} catch (IOException e) {			// 입출력 예외 처리
			e.printStackTrace();
		} finally {
			try {
				bis.close();				// 닫음 필수
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}	// fileOpen 메소드 괄호

	
	
}
