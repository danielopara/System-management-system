package com.example.Studentmanagementstudent.Services;

import com.example.Studentmanagementstudent.Entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(Long id);

}
