package com.sachindramaharjan.microservice.arch.commentsservice.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachindramaharjan.microservice.arch.commentsservice.entity.Comment;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/comments")
@Slf4j
public class CommentController {

  @GetMapping("/{userId}")
  public List<Comment> findUserComments(@PathVariable("userId") String userId) {
      Comment[] comments = new Comment[] {
        new Comment("John Doe", "john.doe@gmail.com", "my first comment"),
        new Comment("John Doe", "john.doe@gmail.com", "my second comment")
      };
      log.info("Getting comments of {}.", userId);

      return Stream.of(comments).collect(Collectors.toList());
  }

}
