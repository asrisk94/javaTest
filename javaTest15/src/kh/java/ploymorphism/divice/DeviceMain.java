package kh.java.ploymorphism.divice;

public class DeviceMain {
	
	public static void main(String[] args) {
		
		Device[] arr = new Device[10];
		arr[0] = new TV("삼성", "평면TV", 3_000_000, 10);
		arr[1] = new TV("LG", "울트라평면TV", 2_500_000, 20);
		arr[2] = new Laptop("LG", "그램17", 2_000_000, 512);
		arr[3] = new Laptop("apple", "맥북16", 3_000_000, 1024);

		
		
		//1. arr을 순회하면서, tv객체라면 channelUp메소드 호출
		// laptop객체 용량 정보를 출력
		
		for(Device d : arr) {
			if(d instanceof TV) ((TV)d).channelUp();
			else if(d instanceof Laptop) System.out.println(((Laptop)d).toString());
			else if(d == null) break;
		}
		
		
		
		//2. arr을 순회하면서 모든 필드정보를 조회(toString)
		//toString오버라이딩을 통해 동적바인딩 이용하기
		
		for(Device d : arr) {
			if(d != null)
			System.out.println(d.toString());
		}
		
	}

}
