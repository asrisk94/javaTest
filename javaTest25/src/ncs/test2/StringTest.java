package ncs.test2;

public class StringTest {

	public static void main(String[] args) {
		
		String str = "A, b, c, D, a, B, C, d, f, F";
		
		String[] st = str.split(", ");			// ", " (콤마 + 한칸띔)을 기준으로 커팅
		
		char[] data = new char[10];
		
		int i=0;
		for(String s : st) {
			data[i] = s.charAt(0);				// char형으로 변환
			i++;								// for each문을 쓰라고 하여 인덱스를 위해 불편하게 이렇게 함.
		}
		
		i=0;
		while(i<data.length) {
			
			if(data[i] >= 'a' && data[i] <= 'z') {	// 아스키코드상 소문자면 
				i++;
				continue;							// 이하 구문을 무시하고 반복문 진행
			}						
			
			System.out.println("data["+i+"] : " + data[i]);	// if문에 걸리지 않았다면(대문자라면) 출력
			i++;
		}

	}

}
