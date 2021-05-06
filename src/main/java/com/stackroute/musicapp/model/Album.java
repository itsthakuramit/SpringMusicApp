package com.stackroute.musicapp.model;

import org.springframework.stereotype.Component;


public class Album {

	private String albumid;
	private String albumname;
	private String artist;

	public Album() {

	}

	public Album(String albumid, String albumname, String artist) {
		this.albumid = albumid;
		this.albumname = albumname;
		this.artist = artist;
	}

	public String getAlbumid() {
		return albumid;
	}

	public void setAlbumid(String albumid) {
		this.albumid = albumid;
	}

	public String getAlbumname() {
		return albumname;
	}

	public void setAlbumname(String albumname) {
		this.albumname = albumname;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Album [albumid=" + albumid + ", albumname=" + albumname + ", artist=" + artist + "]";
	}


	
	

}
