package com.rlopes.dsmovie.repositories;

import com.rlopes.dsmovie.entities.Score;
import com.rlopes.dsmovie.entities.ScorePK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
  
  
}
