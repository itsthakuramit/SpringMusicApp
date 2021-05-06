package com.stackroute.musicapp.service;

import java.util.List;

import com.stackroute.musicapp.model.Album;
import com.stackroute.musicapp.repository.AlbumRepository;


public class AlbumService {

	AlbumRepository albumRepository = new AlbumRepository();
	
	public Album addAlbum(Album album) {
		Album addedAlbum = albumRepository.addAlbum(album);
		return addedAlbum;
	}
	
	public List<Album> getAllAlbums() {
		return albumRepository.getAllAlbums();
	}
	
	public Album deleteAlbum(String albumid) {
		return albumRepository.deleteAlbum(albumid);
	}
	
	public Album updateAlbum(Album album) {
		return albumRepository.updateAlbum(album);
	}
	
}
