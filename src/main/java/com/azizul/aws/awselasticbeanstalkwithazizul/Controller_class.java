package com.azizul.aws.awselasticbeanstalkwithazizul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class Controller_class {
	public String hello() {
		return "Hello World";
	}

}
