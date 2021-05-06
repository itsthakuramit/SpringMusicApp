package com.stackroute.musicapp.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
	
	public Album deleteAlbum(String albumid) {
		Album deletedAlbum = new Album();
		Album alb;
		ListIterator<Album> alblist = albumlist.listIterator();
		
		while(alblist.hasNext()) {
			if((alb = alblist.next()).getAlbumid().equals(albumid)) {
				alblist.remove();
				deletedAlbum = alb;

			}
		}
		
		return deletedAlbum;
	}
	
	public Album updateAlbum(Album Album) {
		
		return null;
	}
	
}
