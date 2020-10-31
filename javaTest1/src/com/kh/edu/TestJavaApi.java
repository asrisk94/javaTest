package com.kh.edu;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TestJavaApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		데이트 클래스에는 정지된 메서드가 많아서 가장 쉬운 심플데이트포멧 메서드를 구글링해서 사용했습니다.
		Date today = new Date();
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.println(form1.format(today));
	
	}

}
