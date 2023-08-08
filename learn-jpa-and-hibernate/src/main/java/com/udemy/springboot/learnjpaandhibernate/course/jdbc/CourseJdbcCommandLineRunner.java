package com.udemy.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.udemy.springboot.learnjpaandhibernate.course.Course;
import com.udemy.springboot.learnjpaandhibernate.course.CourseJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;
	
	@Autowired
	private CourseJpaRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1,"Learn AWS JPA", "Udemy"));
		repository.insert(new Course(2,"Spring", "Udemy"));
		repository.insert(new Course(3,"DevOps", "Udemy"));
		repository.insert(new Course(4,"Full Stack JPA", "Udemy"));
		
		repository.deleteById(3);
		
		System.out.println(repository.findById(4));
		System.out.println(repository.findById(1));
	}

	
}
