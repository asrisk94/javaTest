package com.collection.map.student;

public class Student {
	
	private int sno;
	private String sname;
	
	private int kor;
	private int eng;
	private int math;
	
	private int sum;
	private double avg;		// 필드 선언
	
	
	
	public Student() {super();}
    public Student(int sno, String sname, int kor, int eng, int math) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor + eng + math;
		this.avg = sum/3;				// 생성자 선언 및 합계, 평균 계산
	}


    
	public int getSno() {				// 겟셋 메소드
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}										// 겟셋 메소드


	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", sum=" + sum + ", avg=" + avg + "]";
	}		// 투스트링 오버라이딩
	
	public String toStringForProp() {
		return sno + "," + sname + "," + kor + "," + eng + "," + math + "," + sum + "," + avg;
	}
	
	
	
	@Override
	public int hashCode() {					// 해쉬코드 오버라이딩
		
		return (sno+sname+kor+eng+math+sum+avg).hashCode();
	}
	
	
	
	@Override
	public boolean equals(Object obj) {		// 이퀄즈 오버라이딩
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		if (sno != other.sno)
			return false;
		if (sum != other.sum)
			return false;
		return true;
	}

}
