package com.collection.list.music.model.vo;

import java.util.Comparator;



public class MusicSingerDescending implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		
		return o2.getSinger().compareTo(o1.getSinger());
	}

}
