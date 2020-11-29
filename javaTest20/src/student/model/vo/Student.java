package student.model.vo;

public class Student {
	
	private int no;				// 학번
	private String name;		// 이름
	private int age;			// 나이
	private String address;		// 주소
	private double grade;		// 학점		
	// 필드 정의
	
	
	
	public Student() {}
	public Student(int no, String name, int age, String address, double grade) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.address = address;
		this.grade = grade;
	}										// 생성자 정의
	
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}										// 겟셋 메소드 정의
	
	
//	public int compareTo(Object obj) {
//		int no = (int)obj;
//		
//		if(no)
//	}
		// 없어도 되더라.
	
	
	@Override
	public int hashCode() {						// 해시코드 정의
		
		return (no + name + age + address + grade).hashCode();
	}
	
	
	
	@Override
	public boolean equals(Object obj) {			// 객체 이퀄스 정의
		
		Student s = (Student)obj;
		
		if(!(no == s.no)) return false;
		if(!name.equals(s.name)) return false;
		if(!(age == s.age)) return false;
		if(!(address.equals(s.address))) return false;
		if(!(grade == s.grade)) return false;

		return true;

	}

}
