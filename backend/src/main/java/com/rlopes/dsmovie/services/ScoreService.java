package com.rlopes.dsmovie.services;

import java.util.concurrent.atomic.DoubleAdder;

import com.rlopes.dsmovie.dto.MovieDTO;
import com.rlopes.dsmovie.dto.ScoreDTO;
import com.rlopes.dsmovie.entities.Movie;
import com.rlopes.dsmovie.entities.Score;
import com.rlopes.dsmovie.entities.User;
import com.rlopes.dsmovie.repositories.MovieRepository;
import com.rlopes.dsmovie.repositories.ScoreRepository;
import com.rlopes.dsmovie.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {

  @Autowired
  private MovieRepository movieRepository;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private ScoreRepository scoreRepository;

  @Transactional
  public MovieDTO saveScore(ScoreDTO scoreDto) {

    User user = userRepository.findByEmail(scoreDto.getEmail());

    if(user == null) {
      user = new User();
      user.setEmail(scoreDto.getEmail());
      user = userRepository.saveAndFlush(user);
    }

    Movie movie = movieRepository.findById(scoreDto.getMovieId()).get();

    Score score = new Score();
    score.setMovie(movie);
    score.setUser(user);
    score.setValue(scoreDto.getScore());

    score = scoreRepository.saveAndFlush(score);

    DoubleAdder sum = new DoubleAdder();
    movie.getScores().forEach(s -> {
      sum.add(s.getValue());
    });

    double avg = sum.doubleValue() / movie.getScores().size();

    movie.setScore(avg);
    movie.setCount(movie.getScores().size());

    movie = movieRepository.saveAndFlush(movie);
    
    return new MovieDTO(movie);
  }
  
}
