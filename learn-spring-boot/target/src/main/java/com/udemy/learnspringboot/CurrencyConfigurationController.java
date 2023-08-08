package com.udemy.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {


	@Autowired
	public CurrencyServiceConfiguration configuration;
	
	// course rest api
	// response: course: id, course, author
	// URL /course
	
	@RequestMapping("/currency-service")
	
	public CurrencyServiceConfiguration retrieveAllCourse(){
		 return configuration; 
	}
}
