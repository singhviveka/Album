package com.vivek.album.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.album.model.Album;
import com.vivek.album.model.Photo;
import com.vivek.album.repository.AlbumRepository;
import com.vivek.album.repository.PhotoRepository;
@RestController
public class AlbumController {
  @Autowired
  AlbumRepository albumRepo;
  @Autowired
  PhotoRepository photoRepo;
  @GetMapping(value = "/albums")
  List<Album> getAlbums() {
    return albumRepo.findAll();
  }

  @GetMapping(value = "/photos")
  List<Photo> getPhotos(@RequestParam(name ="albumId" ) int albumId) {
    List<Photo> photoes = photoRepo.findAll();
    List<Photo> results = new ArrayList();
    for(Photo p : photoes) {
    	if(p.getAlbum().getAlbumId()==albumId) {
    		results.add(p);
    	}
    }
    return photoes;
  }
  
  @GetMapping(value="search")
  Object getprofuctById(@RequestParam(name ="type" ) String type,@RequestParam(name ="id" ) int id) {
	if(type.equalsIgnoreCase("album")) {
		return albumRepo.findById(id);
	}
	else
		return photoRepo.findById(id);
	  
  }
 
}
