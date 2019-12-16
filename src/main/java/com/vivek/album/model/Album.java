package com.vivek.album.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Album {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   int albumId;
   int userId;
   String title;
//   @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
//   List<Photo> photoes;
   public int getAlbumId() {
	return albumId;
}
public void setAlbumId(int albumId) {
	this.albumId = albumId;
}
//public List<Photo> getPhotoes() {
//	return photoes;
//}
//public void setPhotoes(List<Photo> photoes) {
//	this.photoes = photoes;
//}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
}
