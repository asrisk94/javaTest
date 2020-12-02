package com.collection.map.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class MemberTest {
	
	Map<String, Member> map = new HashMap<>();

	public MemberTest() {	// 생성자에 의한 맵 내부 자료 추가
		super();
		map.put("1", new Member("honggd", "1234", "홍길동", 35, "01012341234"));
		map.put("2", new Member("sinsa", "1234", "신사임당", 50, "01012341234"));
		map.put("3", new Member("leess", "1234", "이순신", 43, "01012341234"));
		map.put("4", new Member("yooon", "1234", "윤봉길", 37, "01012341234"));
		map.put("5", new Member("jangbg", "1234", "장보고", 29, "01012341234"));
	}
	
	
	
	public static void main(String[] args) {
		
		MemberTest mt = new MemberTest();
		
		mt.test2();
		
		mt.test3();
		System.out.println();
		
		
		
		Set<String> keySet = mt.map.keySet();
											// 전체 키밸류 한줄단위로 출력
		for(String key : keySet) {
			System.out.println(key + " = " + mt.map.get(key));
		}
		System.out.println();
		
				
		mt.test4();
		
	}
	
	
	
	public boolean isUserExist(String userId) {		// 해당 아이디가 있는지 판별하는 메소드
		
		Set<String> keySet = map.keySet();		// 키셋 선언 (키 모음집)
		boolean flag = false;					// boolean 준비
		
		for(String str :keySet) {				// keyset을 돌리는 for each문
			if(map.get(str).getUserId() == userId) {
				flag = true;				// 맵의 해당 키를 가진 밸류(Member객체)의 userId필드 값이
			}								// 입력받은 userId와 같으면 true
		}
		
		return flag;
	}

	
	
	public void test2() {
		
		boolean bool = isUserExist("jangbg");		// 위에서 만든 메소드 활용
		System.out.println(bool);
		
		bool = isUserExist("sejong");
		System.out.println(bool);
	}
	
	
	public void test3() {
		
		Set<String> keySet = map.keySet();		// 키셋 생성
		Member m = null;						// 멤버 객체 준비
		
		for(String key :keySet) {
			if(map.get(key).getUserId().equals("yooon")) {
				m = map.get(key);		// yooon 아이디를 가진 객체를 판별해 m에 담음
			}
		}
		
		m.setUserPwd("5678");		// 각 세팅
		m.setUserName("윤동주");
		m.setAge(27);
		m.setPhoneNumber("01034563456");
		
		System.out.println(m);					// 위에서 m에 담음은 주소값을 복사한 얕은 복사.
		System.out.println("위와 같이 변경되었습니다.");	// 메인메소드 전체 실행에서 확인해보면
												// 실제 map의 정보도 변경된 것을 알 수 있음.
	}

	
	
	public void test4() {
		
		Set<String> keySet = map.keySet();		// 키셋 준비
		Member m = null;
		
		for(String key : keySet) {
			if(map.get(key).getUserId().equals("sinsa")) {
				m = map.remove(key);		// 신사 아이디가 있으면 해당 키밸류 제거
				break;			// 중요! : 삭제를 통해 키셋 규모에 변화가 있었기 때문에
			}					// 브레이크를 주지 않으면 예외 발생 (ConcurrentModificationException)
		}						// 단, iterator로 제거하면 문제가 없다. (여러개를 지울 경우 iterator가 효율적이란 뜻)
		
		System.out.println(m);
		System.out.println("위 회원정보가 삭제되었습니다.");
	}
	
}
