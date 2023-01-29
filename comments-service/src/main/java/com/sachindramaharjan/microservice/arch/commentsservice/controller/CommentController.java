package com.sachindramaharjan.microservice.arch.commentsservice.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachindramaharjan.microservice.arch.commentsservice.entity.Comment;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/comments")
public class CommentController {

  @GetMapping("/{userid}")
  public List<Comment> findUserComments(@PathParam("userId") String userId) {
      Comment[] comments = new Comment[] {
        new Comment("John Doe", "john.doe@gmail.com", "my first comment"),
        new Comment("John Doe", "john.doe@gmail.com", "my second comment")
      };

      return Stream.of(comments).collect(Collectors.toList());
  }

}
