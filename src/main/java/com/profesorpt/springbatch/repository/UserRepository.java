package com.profesorpt.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profesorpt.springbatch.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
