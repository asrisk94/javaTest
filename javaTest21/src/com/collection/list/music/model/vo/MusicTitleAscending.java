package com.collection.list.music.model.vo;

import java.util.Comparator;



public class MusicTitleAscending implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
