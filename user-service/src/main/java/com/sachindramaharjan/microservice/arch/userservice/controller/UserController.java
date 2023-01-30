package com.sachindramaharjan.microservice.arch.userservice.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachindramaharjan.microservice.arch.userservice.entity.User;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
  
  @GetMapping("/")
  public List<User> getAllUsers() {
    return findAllUsers();
  }

  private List<User> findAllUsers() {
    User[] users = new User[]{
      new User("1","Ned Stark", "ned.start@gmail.com"),
      new User("2", "Tom Cruise", "tom.cruise@gmail.com")
    };
    log.info("Getting all users");
    return Stream.of(users).collect(Collectors.toList());
  }

}
