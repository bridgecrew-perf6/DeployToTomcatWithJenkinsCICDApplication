package com.intouch.deployToTomcatWithJenkinsCICD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "Incomming message is =======";
	}
}
