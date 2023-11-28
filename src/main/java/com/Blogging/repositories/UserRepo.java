package com.Blogging.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Blogging.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String email);

}
