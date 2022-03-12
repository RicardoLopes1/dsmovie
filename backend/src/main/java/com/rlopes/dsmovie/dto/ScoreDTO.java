package com.rlopes.dsmovie.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ScoreDTO {
  
  private Long movieId;
  private String email;
  private Double score;
}
