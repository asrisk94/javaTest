package com.collection.list.music.model.vo;

import java.util.Comparator;



public class MusicSingerAscending implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		
		return o1.getSinger().compareTo(o2.getSinger());
	}

}
