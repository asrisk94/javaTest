package com.collection.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.collection.list.music.model.vo.Music;



public class MusicManager {
	
//	~sc:Scanner
//	-mList:ArrayList<Music> => 초기화블럭을 사용하여 5곡을 미리 만들어두기
//	구현할 메소드는 다음과 같다.
	Scanner sc = new Scanner(System.in);
	
	List<Music> mList = new ArrayList<>();
	
	{
		mList.add(new Music("금요일에 만나요", "아이유"));
		mList.add(new Music("Time is Running Out", "Muse"));
		mList.add(new Music("정선 아리랑", "작자 미상"));
		mList.add(new Music("발레리노", "리쌍"));
		mList.add(new Music("Bob Dylan", "The Fall Out Boys"));
	}
	
	
	
//	1. 음악리스트 리턴
//	+ selectList():List<Music>
	public List<Music> selectList() {
		
		return mList;
	}
	
	
	
//	2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드. 
//	+ addList(Music) : void
	public void addList(Music m) {
		
		System.out.println("마지막 줄에 새로운 곡을 추가합니다.");
		
		mList.add(m);
		
		System.out.println(mList.get(mList.size()-1) + " 추가되었습니다.");
	}
	
	
	
//	3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
//	+ addAtZero(Music) : void
	public void addAtZero(Music m) {
		System.out.println("1번에 새로운 곡을 추가합니다.");
		
		mList.add(0, m);
		
		System.out.println(mList.get(0) + " 추가되었습니다.");
	}
	
	
	
//	4. 특정곡을 삭제하는 메소드(제목을 전달받아 검색후, 최초로 검색된 음악을 삭제)
//	    삭제여부를 리턴
//	+ removeMusic(String) : boolean
	public boolean removeMusic(String str) {
		
		boolean flag = false;
		for(int i=0; i<mList.size(); i++) {
			if(mList.get(i).getTitle().equals(str)) {
				mList.remove(i);
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	
//	5. 특정곡을 바꾸는 메소드(이전 음악객체, 새 음악객체를 전달해서 교체)
//	    교체 성공여부를 리턴
//	+ boolean replaceMusic(Music oldMusic, Music newMusic) : boolean
	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		
		boolean flag = false;
		for(int i=0; i<mList.size(); i++) {
			if(mList.get(i).equals(oldMusic)) {
				mList.set(i, newMusic);
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	
//	6. 특정곡이 있는지 검사하는 메소드 : 복수개의 결과가 나올수 있음. 
//	(곡명일부로 검색해서 해당곡이 있다면, 곡정보(제목/가수)를 출력하고, 없다면, "검색결과가 없습니다"출력)
//	+ searchMusicByTitle(String title) : List<Music>
	public List<Music> searchMusicByTitle(String title) {
		
//	실패자료	
//		
//		List<Music> list = new ArrayList<>();
//		
//		int i=0;
//		int j=0;
//		int num=0;
//		int search=0;
//		
//		while(true) {
//			
//			boolean flag = false;
//			
//			outer :
//			for(i=num; i<mList.size(); i++) {
//				flag = false;
//				String oldTitle = mList.get(i).getTitle();
//				
//				for(j=0; j<=(oldTitle.length()-title.length()); j++) {
//					
//					if(title.charAt(0) == oldTitle.charAt(j)) {
//						num = i+1;
//						break outer;
//					} else if((j==(oldTitle.length()-title.length())) 
//							&& (title.charAt(0) != oldTitle.charAt(j))) {
//						flag = true;
//					}
//				}	// 입력 문자열 첫 문자 및 리스트 내부 제목 문자 비교 포문 괄호 
//				
//			}	// 리스트 내 뮤직 객체 타이틀 포문 괄호
//			
//			if(!flag) {
//				int count=0;
//				for(int x=1; x<title.length(); x++) {
//					if(title.charAt(x) == mList.get(i).getTitle().charAt(j+x)) {
//						System.out.println("hello world");
//						count++;
//						if(count == title.length()-1) {
//							list.add(mList.get(i));
//							break;
//						}
//					}
//				}	// 타이틀 비교 포문 괄호	
//			}
//			
//			if(i > mList.size()-1) break;
//		
//		}	// while문 괄호
		
		
		
		
		
		List<Music> list = new ArrayList<>();
		
		for(int i=0; i<mList.size(); i++) {
		
			String oldTitle = mList.get(i).getTitle();
			
			outer :
			for(int j=0; j<=(oldTitle.length()-title.length()); j++) {
				
				if(title.charAt(0) == oldTitle.charAt(j)) {
					int count=0;
					for(int x=0; x<title.length(); x++) {
						if(title.charAt(x) == oldTitle.charAt(j+x)) {
							count++;
							if(count == title.length()) {
								list.add(mList.get(i));
								break outer;
							}
						}
					}	// 타이틀 비교 포문 괄호
				}
			}	// 입력 문자열 첫 문자 및 리스트 내부 제목 문자 비교 포문 괄호 
		
	}	// 리스트 내 뮤직 객체 타이틀 포문 괄호
		
		if(list.size() == 0) System.out.println("검색 결과가 없습니다.");
		return list;
		
		
		
		
// 컨테인스 사용 일반
//		
//		List<Music> list = new ArrayList<>();
//		
//		for(int i=0; i<mList.size(); i++) {
//			
//			if(mList.get(i).getTitle().contains(title)) {
//				list.add(mList.get(i));
//			}
//		}
//		
//		if(mList.size() == 0) System.out.println("검색 결과가 없습니다.");
//		return list;
		
		
		
	}
	
	
	
//	7. 가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
//	+ searchMusicBySinger(String singer) : List<Music>
	public List<Music> searchMusicBySinger(String singer) {
		
		List<Music> list = new ArrayList<>();

		int num=0;
		for(int i=num; i<mList.size(); i++) {
			
			if(mList.get(i).getSinger().equals(singer)) {
				list.add(mList.get(i));
				num = i+1;
			}
		}
		if(list.size() == 0) System.out.println("검색 결과가 없습니다.");
		return list;
		
	}
	
//	8. 서브메뉴 - 각 정렬 메소드 : Comparable/Comparator 인터페이스를 적절히 활용할 것
//	+ orderBy(Comparator<Music> c) : List<Musice>
	public List<Music> orderBy(Comparator<Music> c) {
		
		Collections.sort(mList, c);
		
		return mList;
		
	}
	
}
