package com.example.spring2;
import java.util.Date;
import com.example.spring2.models.Student;
import com.example.spring2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Spring2Application implements CommandLineRunner {

	@Autowired
	StudentRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(Spring2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student1= new Student(1,"anishka","Ratnawat",21,new Date("23/05/2001"));
		Student student2= new Student(2,"tanu","Kapoor",22,new Date("20/01/2000"));
		Student student3= new Student(3,"hardik","Mehta",20,new Date("19/05/2002"));
		Student student4= new Student(4,"manish","Sharma",19,new Date("05/04/2003"));
		Student student5= new Student(5,"neha","Jain",21,new Date("01/09/2001"));
		repository.saveAll(List.of(student1,student2,student3,student4,student5));
	}
}
