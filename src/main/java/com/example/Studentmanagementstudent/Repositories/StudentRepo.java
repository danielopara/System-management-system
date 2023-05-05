package com.example.Studentmanagementstudent.Repositories;

import com.example.Studentmanagementstudent.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
}
