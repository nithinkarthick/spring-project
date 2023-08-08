package com.udemy.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {


	// course rest api
	// response: course: id, course, author
	// URL /course
	
	@RequestMapping("/course")
	
	public List<Course> retrieveAllCourse(){
		 return Arrays.asList(
				 
				 new Course(1,"Learn AWD", "Udemy"),
				 new Course(2,"Spring Boot", "Udemy"),
				 new Course(3,"Data Structures", "Udemy"),
				 new Course(4,"Data Structures 1", "Udemy")
				 );
	}
}
