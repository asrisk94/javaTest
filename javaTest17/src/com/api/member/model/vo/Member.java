package com.api.member.model.vo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Member {
	
	private int userNum;	// 회원번호
	private String name;	// 이름
	private int height;		// 키
	private int weight;		// 몸무게
	private Calendar birth;	// 생일 (yyyyMMdd) 슬랙에 전화기능 있는거 같던데 켜볼까유네

	private int count1;
	Member[] mb;	// 객체별 자료 담을 공간 생성
	
	
	
	
	public Member() {}
	public Member(int userNum, String name, int height, int weight, Calendar birth) {
		super();
		this.userNum = userNum;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.birth = birth;
	}

//	다음과 같이 회원정보를 하나의 문자열로 담았다. 각회원별 정보의 순서는 회원번호,이름,키,몸무게,생일(yyyyMMdd)이다.
//  "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319"
//	각각의 회원정보를 분리해서, 회원객체에 담고, 회원객체배열에 추가한다.
//	출력메소드를 통해 회원정보를 출력한다.
	
	public void test(String str) {
		
		StringTokenizer token1 = new StringTokenizer(str, "|");	// 객체마다 구분
		
		count1 = token1.countTokens();	// 객체 배열 크기용 토큰 갯수 고정
		mb = new Member[count1];
		String[] s1 = new String[count1];	// 토큰 갯수 크기의 스트링 배열 생성
		int idx =0;							// 인덱스 생성
		
		while(token1.hasMoreTokens()) {
			s1[idx++] = token1.nextToken();	// s1 배열에 각각의 값 배정
		}
		
		
		
		StringTokenizer token2;
		
		for(int i=0; i<count1; i++) {
			token2 = new StringTokenizer(s1[i], ",");	// ,기준으로 데이터 토큰화
			idx = 0;									// 인덱스 초기화
			
			while(token2.hasMoreTokens()) {
				switch(++idx) {				// 돌면서 각 변수마다 값 배정
				case 1 : 
					userNum = Integer.parseInt(token2.nextToken()); break;
				case 2 : 
					name = token2.nextToken(); break;
				case 3 :
					height = Integer.parseInt(token2.nextToken()); break;
				case 4 :
					weight = Integer.parseInt(token2.nextToken()); break;
				case 5 :
					birth = calSet(token2.nextToken()); break;
				} // switch 괄호
				mb[i] = new Member(userNum, name, height, weight, birth);
										// 배정된 변수들로 member 객체 생성
			} // while문 괄호
			
		} // for문 괄호
		
	} // test() 괄호
	
	
	
	public void printAll() {		// 전체 명단 출력 메소드
		
		System.out.println("------------회원정보------------");
		
		for(int i=0; i<count1; i++) {
			mb[i].printData();			// 출력
		}
	}
	
	
	
	public void printData() {		// 출력 메소드
		System.out.printf("%-3d%-8s%-5d%-4d%s%n", userNum, name, height, weight, calToStr(birth));
	}
	
	
	
	public String calToStr(Calendar c) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
													// 포멧 결정
		return sdf.format(c.getTimeInMillis());
		
	}
	
	
	
	public Calendar calSet(String s) {					// Calendar 객체 생성을 위해
		int year = Integer.parseInt(s.substring(0, 4));	// 슬라이싱하여 인트형으로 변환
		int month = Integer.parseInt(s.substring(4, 6));
		int day = Integer.parseInt(s.substring(6));
		
		return new GregorianCalendar(year, month, day);	// 그레고리안 캘린더 객체 생성
	}
	
	
	
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Calendar getBirth() {
		return birth;
	}
	public void setBirth(Calendar birth) {
		this.birth = birth;
	}
	
}
