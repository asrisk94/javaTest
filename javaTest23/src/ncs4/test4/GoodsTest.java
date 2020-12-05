package ncs4.test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class GoodsTest {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			// 트라이 리소스 구문. 키보드입력(System.in)을 받는 인풋트스트림리더를 버퍼형으로 움직인다.
			
			Goods g = new Goods();			// 굿 객체 생성
			String line;					// 문자열 받는 용도
			int num;						// 인트형으로 전환용

			System.out.println("다음 항목의 값을 입력하시오");
			System.out.print("상품명 : ");
			line = br.readLine();			// 라인에 한 줄 입력받음
			g.setName(line);				// g객체 이름에 넣음
			System.out.print("가격 : ");
			line = br.readLine();			// 역시 문자열 형으로 입력받음
			num = Integer.parseInt(line);	// 가격이기 때문에 인트형으로 전환
			g.setPrice(num);				// 가격에 집어넣음
			System.out.print("수량 : ");
			line = br.readLine();			// 상동
			num = Integer.parseInt(line);
			g.setQuantity(num);
			
			System.out.println("\n입력된 결과는 다음과 같습니다.");
			System.out.println(g);		// 오버라이딩된 투스트링 형으로 출력됨
			
		}catch(IOException e) {
			e.printStackTrace();		// 예외처리
		}
			// 리소스 구문이기 때문에 트라이 블럭 안에서 모두 종료됨. (close() 별도로 필요 없음)
	}

}
