package mobile;

public class Ltab extends Mobile {						// 상속

	public Ltab() {super();};
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}													// 상속 받은 클래스 생성자 활용
	
	
	
	@Override
	public int operate(int time) {						// 추상메소드 구현
		
		int battery = this.getBatterySize()-time*10;	// 사용량만큼 제거된 배터리 잔량
		
		this.setBatterySize(battery);					// 실제 배터리사이즈에 반영
		return battery;									// 값 리턴
	}
	@Override
	public int charge(int time) {						// 추상메소드 구현
		
		int battery = this.getBatterySize()+time*10;	// 충전량만큼 충전된 배터리 잔량
		
		this.setBatterySize(battery);					// 실제 배터리 사이즈에 반영
		return battery;									// 값 리턴
	}
	
}
