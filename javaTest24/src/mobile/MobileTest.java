package mobile;

public class MobileTest {

	public static void main(String[] args) {
		
		// 객체 생성
		Mobile ltab = new Ltab("Ltab", 500, "AP-01");
		Mobile otab = new Otab("Otab", 1000, "AND-20");
		
		
		// 기본 출력
		System.out.printf("  %-15s%-15s%-15s%n"
				+ "----------------------------------------%n", "Mobile", "Battery", "OS");
		System.out.printf("   %-15s%-12d%s%n", ltab.getMobileName(), ltab.getBatterySize(), ltab.getOsType());
		System.out.printf("   %-15s%-12d%s%n", otab.getMobileName(), otab.getBatterySize(), otab.getOsType());

		
		
		// 10분 충전
		ltab.charge(10);
		otab.charge(10);
		
		System.out.println();
		System.out.printf("  %-15s%-15s%-15s%n"
				+ "----------------------------------------%n", "Mobile", "Battery", "OS");
		System.out.printf("   %-15s%-12d%s%n", ltab.getMobileName(), ltab.getBatterySize(), ltab.getOsType());
		System.out.printf("   %-15s%-12d%s%n", otab.getMobileName(), otab.getBatterySize(), otab.getOsType());

		
		
		// 5붙 통화
		ltab.operate(5);
		otab.operate(5);
		
		System.out.println();
		System.out.printf("  %-15s%-15s%-15s%n"
				+ "----------------------------------------%n", "Mobile", "Battery", "OS");
		System.out.printf("   %-15s%-12d%s%n", ltab.getMobileName(), ltab.getBatterySize(), ltab.getOsType());
		System.out.printf("   %-15s%-12d%s%n", otab.getMobileName(), otab.getBatterySize(), otab.getOsType());

	}

}
