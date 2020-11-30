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
		
		Book[] b = new Book[5];
		Calendar cal = Calendar.getInstance();
		
		
		
		cal.set(1999, 10, 24);
		b[0] = new Book("가", "김남식", 10000, cal, 0.05);
		cal.set(2000, 8, 5);
		b[1] = new Book("나", "박일석", 11000, cal, 0.05);
		cal.set(1998, 7, 13);
		b[2] = new Book("다", "백남준", 8000, cal, 0.1);
		cal.set(2008, 12, 24);
		b[3] = new Book("라", "주제 사라마구", 12000, cal, 0.02);
		cal.set(2020, 11, 30);
		b[4] = new Book("바", "최영수", 9000, cal, 0.1);
		
		String fileName = "file/books.dat";
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));) {
			
			oos.writeObject(b.toString());
			
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

			b = (Book[])ois.readObject();
			
			for(int i=0; i<b.length; i++) {
				
				if(b[i] == null) break;
				System.out.println(b[i]);
			}
			
		} catch(FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
