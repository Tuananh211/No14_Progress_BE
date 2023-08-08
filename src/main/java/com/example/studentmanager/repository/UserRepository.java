package com.example.studentmanager.repository;

import com.example.studentmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
//    Optional<User> findByEmail(String email);
    Optional<User> findByNameOrEmail(String username, String email);
//    Optional<User> findByUsername(String username);
    Boolean existsByName(String username);
    Boolean existsByEmail(String email);
}
