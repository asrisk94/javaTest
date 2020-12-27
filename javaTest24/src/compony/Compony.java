package compony;

public class Compony {
	
	private double salary;						// 급여
	private double annualIncome;				// 연 급여
	private double bonus = 0.2;					// 보너스 비율
	private double afterTaxBonus;				// 세후 보너스
	
	
	
	public Compony() {};
	
	public Compony(double salary) {				// 파라미터 생성자
		super();
		this.salary = salary;
	}
	
	
	
	public double getSalary() {								// 겟셋 메소드
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}															// 겟셋 메소드
	
	
	
	// 연 기본급의 합을 리턴
	public double getIncome() {	
		return salary*12;
	}
	// 연 기본급 합에서 세금 공제하여 리턴
	public double getAfterTaxIncome() {
		return (salary*12 - salary*12*0.1);
	}
	
	// 연 보너스 합산금액 (기본급 제외)
	public double getBonus() {							// 겟셋메소드와 겹쳐서 지우고 떼어왔다.
		return salary*bonus*4;
	}
	// 연 보너스 합산에서 세금 공제하여 리턴
	public double getAfterTaxBonus() {					// 역시 겹쳐서 떼어왔다.
		return (salary*bonus*4 - salary*bonus*4*0.055);
	}
	
}
