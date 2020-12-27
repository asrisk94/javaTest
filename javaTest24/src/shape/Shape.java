package shape;

public abstract class Shape {
	
	private int width;
	private int height;
	private String colors;
	
	
	
	public Shape() {super();};
	public Shape(int width, int height, String colors) {
		super();
		this.width = width;
		this.height = height;
		this.colors = colors;
	}													// 파라미터 생성자
	
	
			
	public abstract double getArea();					// 겟셋 메소드
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}													// 겟셋 메소드
	
	public abstract String getType();					// 각 도형클래스 타입을 얻는 메소드.
														// 동적바인딩을 위해 제작
}
