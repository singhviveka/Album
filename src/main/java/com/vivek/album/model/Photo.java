package com.vivek.album.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Photo {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   int photoId;
   @ManyToOne
   Album album;
   String title;
   String url;
   String thumbnailUrl;
   public int getPhotoId() {
	return photoId;
}
public void setPhotoId(int photoId) {
	this.photoId = photoId;
}
public Album getAlbum() {
	return album;
}
public void setAlbum(Album album) {
	this.album = album;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getThumbnailUrl() {
	return thumbnailUrl;
}
public void setThumbnailUrl(String thumbnailUrl) {
	this.thumbnailUrl = thumbnailUrl;
}
}
