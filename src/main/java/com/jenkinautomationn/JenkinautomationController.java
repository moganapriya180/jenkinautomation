package com.jenkinautomationn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinautomationController {
	@GetMapping(value="/get")
	public String getoff(String a) {
		return "Hi Mogana Priya";
	}

}
