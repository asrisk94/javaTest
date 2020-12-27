package shape;

public class Rectangle extends Shape implements Resize{
	
	private final String TYPE = "Rectangle";

	public Rectangle() {super();};
	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);							// 부모생성자 활용
	}
	
	
	
	@Override
	public void setResize(int size) {				// 리사이즈 오버라이딩
		setWidth(getWidth() + size);
	}

	@Override
	public double getArea() {						// 넓이 메소드 오버라이딩
		return (getWidth() * getHeight());
	}
	
	public String getType() {						// 타입반환 오버라이딩
		return TYPE;
	}

}
