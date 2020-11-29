package com.myapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apis {
       
	  @GetMapping("/first")
	  public ResponseEntity<String> getFirstApi(){
		  ResponseEntity<String> x=new ResponseEntity<String>("dl",HttpStatus.OK);
		  return x;
	  }
}
