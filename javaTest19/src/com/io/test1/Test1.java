package com.io.test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
//		t1.fileSave();
		t1.fileRead();
	}
	
	
	
	public void fileSave() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String fileName = null;			// 파일명 담을 공간 선언
		
		try {
			System.out.print("파일명 입력 : ");
			fileName = br.readLine();		// 파일명 읽어옴 (System.in 키보드 입력)
		} catch (IOException e) {
			e.printStackTrace();
		} 								// System.in 객체는 닫지 않음
		
		FileWriter fw = null;			// 파일에 내용 쓸 파일라이터 객체
		
		try {
			fw = new FileWriter(fileName);		// 해당 파일에 작성
			
			while(true) {
				System.out.println("파일에 저장할 내용을 한 줄 단위로 입력하시오 (exit 입력 시 종료)");
				String temp = br.readLine();			// 임시로 담음
				if(temp.toLowerCase().equals("exit")) {			// exit이면 멈춤
					System.out.println("파일이 성공적으로 저장되었습니다.");
					break;
				}
				fw.write(temp);			// 파일에 기록
				fw.write("\n");			// 한 줄씩 입력받았으나, 개행문자가 없기 때문에 추가해줌
			}	// while 괄호 
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				fw.close();				// 닫음 필수
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}	// fileSave 메소드 괄호
	
	
	
	public void fileRead() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String fileName = null;
		
		try {
			System.out.print("읽어올 파일명(파일경로)을 입력하세요 : ");
			fileName = br.readLine();		// 파일경로 담음
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileReader fr = null;
		BufferedReader br2 = null;
		StringBuilder sb = new StringBuilder();		// 내용 담을 스트링빌더 객체
		
		try {
			br2 = new BufferedReader(new FileReader(fileName));	// 읽어올 객체
			String line;
			while((line = br2.readLine()) != null) {	// readLine() 선언시마다 한줄씩 넘어가기 때문에
				sb.append(line);						// 여러번 쓰이면 휙휙 넘어간다.
				sb.append("\n");						// 조건식으로 한번만 선언해서 한줄씩만 넘기고, 개행문자 추가해준다.
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br2.close();			// 역시 닫음 필수
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(sb.toString());		// 출력
		
	}	// fileRead 메소드 괄호
	
}
