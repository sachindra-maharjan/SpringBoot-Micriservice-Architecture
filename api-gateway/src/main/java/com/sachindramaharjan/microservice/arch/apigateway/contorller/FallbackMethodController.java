package com.sachindramaharjan.microservice.arch.apigateway.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

  @GetMapping("/userServiceFallback")
  public String userServiceFallbackMethod() {
    return "User Service is taking longer than expected. Plese try again later";
  }

  @GetMapping("/commentServiceFallback")
  public String commentServiceFallbackMethod() {
    return "Comment Service is taking longer than expected. Plese try again later";
  }
  
}
