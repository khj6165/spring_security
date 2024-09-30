package com.example.security1.repository;

import com.example.security1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

//crud 함수를 들고있음. JpaRepository가 @Repository들고있음.
public interface UserRepository extends JpaRepository<User, Integer> {
    // jpa query methods
    // select * from user where username=?
    public User findByUsername(String username);
}
