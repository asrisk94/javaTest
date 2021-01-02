package ncs.test4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;



public class NoticeTest {

	public static void main(String[] args) {
		
		NoticeTest nt = new NoticeTest();
		
		Object[] obArray = new Object[3];		// 오브젝트 배열
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Calendar c = new GregorianCalendar();
		
//		for(int i=0; i<obArray.length; i++) {			// 직접 입력시 쓰는 코드
//			System.out.print("제목 : ");
//			String title = sc.nextLine();
//			System.out.print("작성일 (yyyy/mm/dd) : ");
//			String dateStr = sc.nextLine();
//			System.out.print("글쓴이 : ");
//			String writer = sc.nextLine();
//			System.out.println("내용");
//			String content = sc.nextLine();
//			
//			String[] strArr = dateStr.split("/");			// 날짜를 직접 입력받아 잘라서 사용했음
//			int year = Integer.parseInt(strArr[0]);
//			int month = Integer.parseInt(strArr[1]);
//			int day = Integer.parseInt(strArr[2]);
//			c.set(year, month-1, day);
//			
//			Date date = new Date(c.getTimeInMillis());
//					
//			obArray[i] = new Notice(i+1, title, date, writer, content);
//		}
		
		// 테스트 때 직접입력이 귀찮아 만든 테스트용 객체
		c.set(2016, 3-1, 16);
		obArray[0] = new Notice(1, "첫번째 공지글", new Date(c.getTimeInMillis()), "홍길동", "첫번쨰 공지글임");
		obArray[1] = new Notice(2, "두번째 공지글", new Date(c.getTimeInMillis()), "김똥길", "두번쨰 공지글임");
		obArray[2] = new Notice(3, "세번째 공지글", new Date(c.getTimeInMillis()), "아이고", "세번쨰 공지글임");
		
		
		
		nt.fileSave(obArray);
		
		Notice[] nArr = nt.fileRead();
		for(Notice n: nArr) {					// 읽어온 자료를 포문을 통해 하나씩 출력
			System.out.println(n.toString());
		}
		
	}
	
	
	
	public void fileSave(Object[] array) {
		
		String fileName = "notice.dat";
		ObjectOutputStream oos = null;
		
		Notice[] nArr = new Notice[3];
		
		for(int i=0; i<array.length; i++) {		// 받아온 매개인자가 태생부터 오브젝트배열이였기 때문에 다운캐스팅 불가능.
			nArr[i] = (Notice)array[i];			// 따라서 원래부터 노티스객체인 내부 객체들을 하나씩 꺼내서 일일이 변환 후 노티스 배열에 담음.
		}
		
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(fileName));
										// 해당 파일경로를 담은  파일아웃풋스트림을 끼운  오브젝트 아웃풋 스트림
			oos.writeObject(nArr);		// 배열 자체를 통째로 하나의 오브젝트로 인식하여 출력은 한번만.
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public Notice[] fileRead() {
		
		String fileName = "notice.dat";
		Notice[] list = null;
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(fileName));
			
			list = (Notice[])ois.readObject();		// 저장때부터 노티스 배열이었기 때문에 노티스배열로 형변환 가능.
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
