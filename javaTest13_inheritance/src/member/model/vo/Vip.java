package member.model.vo;

public class Vip extends Grade {
	
	public Vip() {}
	public Vip(String name, String grade, int point) {
		setName(name);
		setGrade(grade);
		setPoint(point);
	}
	
	public double getInterPoint() {
		return getPoint()*0.10;
	}

}	// private 필드값, 객체배열, printData는 상속된 그대로 사용. 
	// getInterPoint는 등급에 맞게 오버라이딩.
