package com.dropbox.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DropboxController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ResponseEntity<Object> sayHello() {
		return new ResponseEntity<Object>("Hello", HttpStatus.OK);
	}
}
