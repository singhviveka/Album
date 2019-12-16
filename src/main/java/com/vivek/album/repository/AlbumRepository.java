package com.vivek.album.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.album.model.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer>{
      List<Album> findAll();
}
