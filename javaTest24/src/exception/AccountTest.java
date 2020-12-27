package exception;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Account a = new Account("441-0290-1203", 500000, 0.073);	// 객체 생성
		
		System.out.printf("계좌정보 : %s  %.1f  %.1f%%%n", 
				a.getAccount(), a.getBalance(), a.getInterestRate()*100);
		
		try {
			a.deposit(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());			// 던져진 예외에 입력된 메시지 출력
		}
		
		try {
			a.withdraw(600000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(a.calculateInterest());

	}

}
