package com.stackroute.musicapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.musicapp.model.Album;
import com.stackroute.musicapp.service.AlbumService;

@Controller
public class AlbumController {
	
	
	
	ApplicationContext atx = new ClassPathXmlApplicationContext("beans.xml");
	Album newalbum = (Album)atx.getBean("album");
	AlbumService albumService = (AlbumService)atx.getBean("albumservice");
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getAllAlbums(Model model) {
		List<Album> albumlist = albumService.getAllAlbums();
		model.addAttribute("albumlist", albumlist);
		System.out.println("Album size"+albumlist.size());
		return "index";
	}
	
	@RequestMapping(value="/addAlbum",method=RequestMethod.POST)
	public String addAlbum(Model model, 
			HttpServletRequest req,HttpServletResponse res
			) {
		
		newalbum.setAlbumid(req.getParameter("albumid"));
		newalbum.setAlbumname(req.getParameter("albumname"));
		newalbum.setArtist(req.getParameter("artist"));
		
		albumService.addAlbum(newalbum);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/deleteAlbum",method=RequestMethod.GET)
	public String deleteAlbum(@RequestParam String albumid) {
		
		albumService.deleteAlbum(albumid);
		return "redirect:/";
	}
	
	@RequestMapping(value="/updateAlbum",method=RequestMethod.PUT)
	public String updateAlbum() {
		return "index";
	}
	

}
