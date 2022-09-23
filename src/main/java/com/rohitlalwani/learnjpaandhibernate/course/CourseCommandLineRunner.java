package com.rohitlalwani.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rohitlalwani.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//JDBC Repository
//	@Autowired
//	private CourseJdbcRepository repository;

//JPA Repository	
//	@Autowired
//	private CourseJpaRepository repository;

//Spring Data JPA Repository
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1, "Learn AWS", "dummy"));
		repository.save(new Course(2, "Learn Spring JPA", "dummy"));
		repository.save(new Course(3, "Learn Docker", "dummy"));
		repository.save(new Course(4, "Learn Docker", "Rohit"));
		repository.deleteById(1L);
		System.out.println(repository.findById(2L));
		System.out.println(repository.findById(3L));
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("Rohit"));
		System.out.println(repository.findByName("Learn Docker"));
	}

}
