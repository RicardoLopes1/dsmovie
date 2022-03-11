package com.rlopes.dsmovie.repositories;

import com.rlopes.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
  
  
}
