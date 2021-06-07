package com.awsproject.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsDemo {
	@GetMapping("/")
	public String demo()
	{
		return "welcome selvamani";
	}

}
