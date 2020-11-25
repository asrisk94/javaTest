package com.exception.number;

public class NumberProcess {
	
	public NumberProcess() {}
	
	public boolean checkDouble(int a, int b) throws NumberRangeException {
													// 예외 발생시 던지기
		boolean flag = false;						// 불린 기본값
		
		if(a>100 || a<1 || b>100 || b<1)			// 범위 안이 아닐 경우 예외 던지기 및 메시지
			throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
		if(a%b == 0) flag = true;					// 배수가 맞을 경우 트루 반환
			
		return flag;
	}
	
}
