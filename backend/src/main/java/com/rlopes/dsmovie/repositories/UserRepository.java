package com.rlopes.dsmovie.repositories;

import com.rlopes.dsmovie.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  
  User findByEmail(String email);
}
