package com.example.springwebapp.repos;

import com.example.springwebapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    // the naming of methods is defined by spring jpa documentation
    User findByUsername(String username);
}
