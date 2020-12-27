package shape;

public class Triangle extends Shape implements Resize {

	private final String TYPE = "Triangle";
	
	public Triangle() {super();};
	public Triangle(int width, int height, String colors) {
		super(width, height, colors);						// 부모 생성자 활용
	}
	
	
	
	@Override
	public void setResize(int size) {						// 리사이즈 오버라이딩
		setHeight(getHeight()+size);
	}
	
	@Override
	public double getArea() {								// 넓이 오버라이딩
		return (getWidth() * getHeight() / 2.0);
	}
	
	public String getType() {								// 타입반환 오버라이딩
		return TYPE;
	}
	
}
