package ncs4.test3;

public class AmountNotEnough extends Exception {
	
	public AmountNotEnough() {}
	
	public AmountNotEnough(String message) {
		super(message);
	}
	
	public AmountNotEnough(Throwable cause) {
		super(cause);
	}
	
	public AmountNotEnough(String message, Throwable cause) {
		super(message, cause);
	}

}
