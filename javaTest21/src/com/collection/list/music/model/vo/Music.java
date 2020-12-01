package com.collection.list.music.model.vo;

public class Music implements Comparable<Music> {
	
	private String title;		// 제목
	private String singer;		// 가수
	
	
	
	public Music() { super(); }
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;		// 생성자
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;					// 겟셋 메소드
	}
	
	
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	// 필드출력용 투스트링 오버라이딩

	
	
	@Override
	public boolean equals(Object o) {
		
		if(!(o instanceof Music)) {
			return false;
		}
		if(!(this.title.equals(((Music)o).title))) {
			return false;
		}
		if(!(this.singer.equals(((Music)o).singer))) {
			return false;
		}
		
		return true;
		
//		if(o instanceof Music) {
//			if(this != null) {
//				if(o != null) {
//					if(((Music)o).title != null) {
//						if(((Music)o).singer != null) {
//							if(this.title != null) {
//								if(this.singer != null) {
//									if(this.title.equals(((Music)o).title)) {
//										if(this.singer.equals(((Music)o).title)) {
//											
//											return true;
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		return false;
	}
	
	
	
	@Override
	public int hashCode() {
		return (title + singer).hashCode();
	}
	
	

	@Override
	public int compareTo(Music o) {
		return title.compareTo(o.title);
	}
	
}
