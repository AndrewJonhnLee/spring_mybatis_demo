package com.cool.amoy.demo.shiro.repositories;

import com.cool.amoy.demo.shiro.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User findByUsername(String username);
}