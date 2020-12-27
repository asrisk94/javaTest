package mobile;

public abstract class Mobile {					// 추상 클래스
	
	private String mobileName;
	private int batterySize;
	private String osType;
	
	
	
	public Mobile() {};
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}											// 파라미터 생성자

	
	
	// 사용
	public abstract int operate(int time);		// 추상 메소드
	
	// 충전
	public abstract int charge(int time);
	
	
	
	public String getMobileName() {							// 겟셋 메소드
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}														// 겟셋 메소드
	
}