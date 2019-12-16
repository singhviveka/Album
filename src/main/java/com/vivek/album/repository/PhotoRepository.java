package com.vivek.album.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.album.model.Photo;

public interface PhotoRepository extends JpaRepository<Photo,Integer> {
 
}
