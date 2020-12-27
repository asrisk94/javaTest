package school;

public class Student {				// 객체 클래스
	
	private String name;
	private int age;
	private int height;
	private int weight;				// 속성은 항상 private
	
	
	
	public Student() {};
	public Student(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;					// 파라미터 생성자
	};

	
	
	public String getName() {							// 겟셋 메소드
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHieght(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}													// 겟셋 메소드
	
	// 옵션 : toString(), hashCode(), equals()
	
}
