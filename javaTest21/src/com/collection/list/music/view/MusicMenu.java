package com.collection.list.music.view;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.collection.list.music.controller.MusicManager;
import com.collection.list.music.model.vo.Music;
import com.collection.list.music.model.vo.MusicSingerAscending;
import com.collection.list.music.model.vo.MusicSingerDescending;
import com.collection.list.music.model.vo.MusicTitleAscending;
import com.collection.list.music.model.vo.MusicTitleDescending;



public class MusicMenu {
	
	Scanner sc = new Scanner(System.in);
	
	MusicManager mm = new MusicManager();
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.print("    ================ Music Playlist Menu ================\n" + 
					"    1.목록보기\n" + 
					"    2.마지막에 음악추가\n" + 
					"    3.맨처음에 음악추가\n" + 
					"    4.곡삭제\n" + 
					"    5.곡변경\n" + 
					"    6.곡명검색\n" + 
					"    7.가수검색\n" + 
					"    8.목록정렬(곡명오름차순)\n" + 
					"    0.종료\n" + 
					"    ================================================================\n" + 
					"    >> 메뉴선택 : ");
			
			String input = sc.nextLine();
			
			int choice = Integer.parseInt(input);
			
			switch(choice) {
			case 1 : 
				printList(mm.selectList()); break;
			case 2 : 
				mm.addList(inputMusic()); break;
			case 3 : 
				mm.addAtZero(inputMusic()); break;
			case 4 : 
				if(!(mm.removeMusic(inputTitle()))) {
					System.out.println("해당 곡이 없습니다.");
				} else {
					System.out.println("곡이 삭제되었습니다.");
				} break;
			case 5 : 
				if(!(mm.replaceMusic(inputMusic(), inputMusic()))) {
					System.out.println("해당 곡이 없습니다.");
				} else {
					System.out.println("곡이 대체되었습니다.");
				} break;
			case 6 : 
				System.out.println(mm.searchMusicByTitle(inputTitle())); 
				break;
			case 7 : 
				System.out.println(mm.searchMusicBySinger(inputSinger())); 
				break;
			case 8 : 
				MusicSort(); break;
			case 0 : 
				System.out.println("프로그램을 종료합니다."); return;
			default :
				System.out.println("잘못된 입력입니다."); break;
			}
			
		}	// while 괄호
		
	}	// mainMenu 괄호
	
	
	// 정렬 기준
	public void MusicSort() {
		System.out.println("    ================== 정렬 메뉴 ===================\r\n" + 
				"    1. 가수명 오름차순\r\n" + 
				"    2. 가수명 내림차순\r\n" + 
				"    3. 곡명 오름차순\r\n" + 
				"    4. 곡명 내림차순\r\n" + 
				"    5. 메인메뉴 돌아가기\r\n" + 
				"    ================================================");
		System.out.println("원하는 옵션을 선택해주세요 : ");
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		
		switch(num) {
		case 1 : 
			Comparator<Music> c1 = new MusicSingerAscending(); 
			mm.orderBy(c1); break;
		case 2 : 
			Comparator<Music> c2 = new MusicSingerDescending();
			mm.orderBy(c2); break;
		case 3 : 
			Comparator<Music> c3 = new MusicTitleAscending(); 
			mm.orderBy(c3); break;
		case 4 : 
			Comparator<Music> c4 = new MusicTitleDescending(); 
			mm.orderBy(c4); break;
		case 5 :
			System.out.println("메인 메뉴로 돌아갑니다."); return;
		}

	}
	
	
	
//	a. 리스트 출력메소드
//	+ printList(List<Music>) : void
	public void printList(List<Music> mm) {
		
		for(Music m : mm) {
			if(m == null) break;
			System.out.println(m);
		}
	}
	
	
	
//	b. 곡명 입력메소드
//	+ inputTitle() : String
	public String inputTitle() {
		
		System.out.print("곡명을 입력하세요 : ");
		String title = sc.nextLine();
		
		return title;
	}
	
	
	
//	c. 가수 입력메소드
//	+ inputSinger() : String
	public String inputSinger() {
		
		System.out.print("가수를 입력하세요 : ");
		String singer = sc.nextLine();
		
		return singer;
	}
	
	
	
//	d. 음악 입력메소드(곡명, 가수 모두 입력)
//	+ inputMusic() : Music
	public Music inputMusic() {
		
		System.out.print("곡명을 입력하세요 : ");
		String title = sc.nextLine();
		System.out.print("가수를 입력하세요 : ");
		String singer = sc.nextLine();
		
		return new Music(title, singer);
	}

}
