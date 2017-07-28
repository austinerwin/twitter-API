package com.cooksys.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cooksys.twitter.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
