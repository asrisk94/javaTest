package member.model.vo;

public class Grade {
	
	private static final int MAX_VALUE = 10;	// 최대 배열 크기
	
	protected Grade[] gradeArr = new Grade[MAX_VALUE];	// 객체배열 틀
	
	private String name;						// 필드 정의
	private String grade;
	private int point;
	
	public Grade() {}							// 생성자 정의
	public Grade(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	
	
	public String getName() {					// 겟셋 메소드
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	public double getInterPoint() {			// getInterPoint 틀
		return 0.0;
	}

	
	
	public void printData() {				// printData 틀
		
		for(int i=0; i<MAX_VALUE; i++) {
			if(gradeArr[i] == null) break;
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n", 
					gradeArr[i].getName(), gradeArr[i].getGrade(), gradeArr[i].getPoint(), gradeArr[i].getInterPoint());
		}
	}
	
}
