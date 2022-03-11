package com.rlopes.dsmovie.dto;

import com.rlopes.dsmovie.entities.Movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class MovieDTO {
  
  private Long id;
  
  private String title;
  private Double score;
  private Integer count;
  private String image;

  public MovieDTO(Movie movie) {
    this.id = movie.getId();
    this.title = movie.getTitle();
    this.score = movie.getScore();
    this.count = movie.getCount();
    this.image = movie.getImage();
  }
}
