package com.stackroute.musicapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.musicapp.model.Album;

public class AlbumRepository {

	private List<Album> albumlist = new ArrayList<>();
	
	public Album addAlbum(Album album) {
		albumlist.add(album);
		return album;
	}
	
	public List<Album> getAllAlbums() {
		return albumlist;
	}
	
	public Album deleteAlbum(String Albumid) {
		return null;
	}
	
	public Album updateAlbum(Album Album) {
		
		return null;
	}
	
}
