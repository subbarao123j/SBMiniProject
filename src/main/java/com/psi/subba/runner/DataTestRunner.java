package com.psi.subba.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.psi.subba.repo.StudentRepository;

import spring.psi.subba.model.Student;


@Component
public class DataTestRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;
	
	public void run(String... args) throws Exception {
		
		repo.save(new Student(10,"A",2.2));  //insert
		repo.save(new Student(11,"B",3.2));
		repo.save(new Student(12,"C",4.2));
		repo.save(new Student(12,"D",4.5));  //update
		
		repo.saveAll(
				Arrays.asList(
				new Student (13, "E",5.5),
				new Student (14, "F",6.5),
				new Student (15, "F",8.5)
				
				
				));

	}

}

