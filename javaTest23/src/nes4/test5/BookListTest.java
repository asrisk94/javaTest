package nes4.test5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookListTest {

	public static void main(String[] args) {
		
		BookListTest test5 = new BookListTest();
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		test5.storeList(list);						// Book 객체를 3개 생성하여 리스트에 넣는다.

		test5.saveFile(list);						//books.dat 파일에 리스트에 저장된 Book 객체들을 저장한다. 

		List<Book> booksList = test5.loadFile();	//books.dat 파일로부터 객체들을 읽어서 리스트에 담는다.

		test5.printList(booksList);					//리스트에 저장된 객체정보를 출력한다.
		
		// 할인된가격은booksList 에기록된객체정보를사용하여getter 로계산출력한다.
		//–for each 문을이용할것
	}
	
	
	
	public void storeList(List<Book> list) {
		list.add(new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1));
	}
		// 북 객체 3개 할당
	
	
	public void saveFile(List<Book> list) {		// 파일 출력(저장) 메소드
		
		String fileName = "books.dat";			// 저장 경로
		ObjectOutputStream oos = null;			// 객체출력 스트림 생성
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(fileName));
			oos.writeObject(list);		// 지정된경로로 출력할 객체 생성 및 객체 출력
										// 물론 북 클래스에 직렬화가 되어있다.
		} catch (IOException e) {
			e.printStackTrace();		// 예외처리
		} finally {
			try {
				oos.close();			// 닫음 필수
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	
	
	public List<Book> loadFile() {		// 파일 입력(읽어옴) 메소드
		
		String fileName = "books.dat";				// 읽어올 경로
		List<Book> list = new ArrayList<>();		// 리스트 객체 생성
		ObjectInputStream ois = null;				// 객체 입력 스트림 객체
		
		try {
			ois = new ObjectInputStream(new FileInputStream(fileName));
			list = (List<Book>)ois.readObject();	// 리스트형으로 형변환 후 담음
			
		} catch (IOException e) {				// 예외처리
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();				// 닫음 필수
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	
	
	public void printList(List<Book> list) {		// 콘솔 출력 메소드
		
		for(Book b: list) {				// 향상된 포문 (enhanced for method / for each)
			System.out.println(b);		// 출력 (북 클래스에 오버라이딩 된 투스트링 사용)
		}
		
	}
	
}
