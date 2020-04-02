package com.example.springwebapp.repos;

import com.example.springwebapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username); // the naming of methods is
}
