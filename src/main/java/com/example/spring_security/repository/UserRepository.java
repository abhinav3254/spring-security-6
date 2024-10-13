package com.example.spring_security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_security.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User findByEmail(String username);

}
