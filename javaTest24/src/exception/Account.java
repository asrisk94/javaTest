package exception;

public class Account {
	
	private String account;				// 계좌번호
	private double balance;				// 잔액
	private double interestRate;		// 이자율
	
	
	
	public Account() {};
	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;			// 파라미터 생성자
	}
	
	
	
	public String getAccount() {						// 겟셋 메소드
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}														// 겟셋 메소드
	
	
	
	// 이자금액 계산
	public double calculateInterest() {
		return balance*interestRate;
	}
	
	
	
	// 입금
	public void deposit(double money) throws Exception {
		
		if(money < 0) {
			throw new Exception("입금 금액이 0보다 적습니다.");		// 예외와 예외 메시지 던짐.
		}
		
		this.balance += money;
	}
	
	// 출금
	public void withdraw(double money) throws Exception {
		
		if(money < 0 || money > this.balance) {
			throw new Exception("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}
		
		this.balance -= money;
	}
	
}
