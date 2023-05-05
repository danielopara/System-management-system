package com.example.Studentmanagementstudent;

import com.example.Studentmanagementstudent.Entities.Student;
import com.example.Studentmanagementstudent.Repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementStudentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementStudentApplication.class, args);
	}

	@Autowired
	private StudentRepo studentRepo;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Daniel", "John", "oparadaniv@gmail");
//		studentRepo.save(student1);
//
//		Student student2 = new Student("John", "Peter", "peterjohn@gmail.com");
//		studentRepo.save(student2);
//
//		Student student3 = new Student("Mable", "James", "mablejames@gmail.com");
//		studentRepo.save(student3);
	}
}
