package compony;

public class Test02 {

	public static void main(String[] args) {
		
		Compony c = new Compony(100);
		
		System.out.printf("연 기본급 합 : %.1f 세후 : %.1f%n"
				+ "연 보너스 합 : %.1f 세후 : %.1f%n"
				+ "연 지급액 합 : %.1f", 
				c.getIncome(), c.getAfterTaxIncome(), c.getBonus(), 
				c.getAfterTaxBonus(), c.getAfterTaxIncome()+c.getAfterTaxBonus());
		
	}

}
