package shape;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape[] sArr = new Shape[6];				// 부모 객체 배열 생성
		
		sArr[0] = new Triangle(7, 5, "Blue");		// 자식 객체 배치
		sArr[1] = new Rectangle(4, 6, "Blue");
		sArr[2] = new Triangle(6, 7, "Red");
		sArr[3] = new Rectangle(8, 3, "Red");
		sArr[4] = new Triangle(9, 8, "White");
		sArr[5] = new Rectangle(5, 7, "White");
		
		
		
		for(Shape s : sArr) {
			System.out.printf("%-15s%-6.1f%s%n", s.getType(), s.getArea(), s.getColors());
		}												//동적바인딩을 이용한 출력문
		
		
		
		for(Shape s: sArr) {							// enhanced 'for' loop
			if(s instanceof Triangle) {					// 해당 shape객체가  Triangle의 객체라면
				((Triangle)s).setResize(5);				// Triangle로 형변환 후 셋리사이즈 실시
			}
			else if(s instanceof Rectangle) {			// Rectangle이면 Rectangle변환 후 실시
				((Rectangle) s).setResize(5);
			}
		}
		
		
		
		System.out.println();
		for(Shape s : sArr) {
			System.out.printf("%-15s%-6.1f%s%n", s.getType(), s.getArea(), s.getColors());
		}
		
	}

}