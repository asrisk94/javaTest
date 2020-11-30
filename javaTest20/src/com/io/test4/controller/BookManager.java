package com.io.test4.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Scanner;

import com.io.test4.model.vo.Book;



public class BookManager {
	
	private Scanner sc = new Scanner(System.in);
	
	public BookManager() {}
	
//    * Method
//    + fileSave():void
//    >> 구현내용
//        1. Book 객체 배열 선언, 5개 초기화함 //샘플데이터 임의 작성
//        2. "books.dat" 파일에 객체 기록 저장함
//        3. try with resource 문 사용할 것
//        4. "books.dat 에 저장 완료!" 출력
	public void fileSave() {
		
		Book[] b = new Book[5];					//객체배열 생성
		Calendar cal1 = Calendar.getInstance();	// calendar 객체 생성
		Calendar cal2 = Calendar.getInstance();	// calendar 객체 생성
		Calendar cal3 = Calendar.getInstance();	// calendar 객체 생성
		Calendar cal4 = Calendar.getInstance();	// calendar 객체 생성
		Calendar cal5 = Calendar.getInstance();	// calendar 객체 생성
		
		
		
		cal1.set(1999, 10, 24);			// set은 void이므로 생성자 안에 바로 쓸 수 없음
		b[0] = new Book("가", "김남식", 10000, cal1, 0.05);
		cal2.set(2000, 8, 5);
		b[1] = new Book("나", "박일석", 11000, cal2, 0.05);
		cal3.set(1998, 7, 13);
		b[2] = new Book("다", "백남준", 8000, cal3, 0.1);
		cal4.set(2008, 12, 24);
		b[3] = new Book("라", "주제 사라마구", 12000, cal4, 0.02);
		cal5.set(2020, 11, 30);
		b[4] = new Book("바", "최영수", 9000, cal5, 0.1);
		
		
		
		String fileName = "file/books.dat";		// 파일경로
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));) {
			
			oos.writeObject(b);		// 오브젝트 쓰기 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}		// fileSave 괄호


	
	
//    + fileRead():void
//    >>구현내용
//        1. Book 객체 배열 선언 : 10개
//        2. "books.dat" 파일에서 데이터 읽어서 배열에 저장함
//        3. 객체 정보를 화면에 출력함
//        4. try with resource 문 사용할 것
//        5. "books.dat 읽기 완료!" 출력
	public void fileRead() {
		
		Book[] b = new Book[10];
		
		String fileName = "file/books.dat";
		
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));) {
												// try 괄호 안에는 생성과 선언 전부 있어야함.
			b = (Book[])ois.readObject();
			
			for(int i=0; i<b.length; i++) {
				
				if(b[i] == null) break;					// 자료 없으면 중지
				System.out.println(b[i].toString());	// 오버라이딩 투스트링 활용
			}
			
		} catch(FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
