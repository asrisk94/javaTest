package com.exception.charcheck;

public class CharacterProcess {
	
	public CharacterProcess() {}
	
	
	
	public int countAlpha(String s) throws CharCheckException {
									// 해결은 
		int count = 0;									// 문자 세기용
		
		for(int i=0; i<s.length(); i++) {				// 문자 추출 및 영문자 확인
			char ch = s.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				count++;
			else if(ch == ' ')							// 예외 발생 정의 및 출력할 메시지
				throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
		}
		return count;		// 예외 없을 경우 영문자 갯수 반환
	}

}
