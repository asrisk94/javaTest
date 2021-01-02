package ncs.test8;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;



public class IPSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("호스트명 또는 도메인명 입력 : ");
		String host = sc.nextLine();
		
		try {
			InetAddress[] ip = InetAddress.getAllByName(host);		// 아이피주소를 전부 가져오는 메소드.
			
			System.out.printf("%s는 %d개의 IP주소를 가지고 있습니다.%n", host, ip.length);
			
			for(int i=0; i<ip.length; i++) {
				System.out.println((i+1) + "번 IP = " + ip[i].getHostAddress());	// 전부 출력
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}		
		
	}

}
