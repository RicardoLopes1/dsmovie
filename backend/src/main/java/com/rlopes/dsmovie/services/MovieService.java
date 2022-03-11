package com.rlopes.dsmovie.services;

import com.rlopes.dsmovie.dto.MovieDTO;
import com.rlopes.dsmovie.entities.Movie;
import com.rlopes.dsmovie.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {

  @Autowired
  private MovieRepository repository;

  @Transactional(readOnly = true)
  public Page<MovieDTO> findAll(Pageable pageable) {
    Page<Movie> result = repository.findAll(pageable);
    Page<MovieDTO> page = result.map(m -> new MovieDTO(m));
    return page;
  }

  @Transactional
  public MovieDTO findById(Long id) {
    Movie result = repository.findById(id).get();
    MovieDTO movieDto = new MovieDTO(result);
    return movieDto;
  }
}
