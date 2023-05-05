package com.example.Studentmanagementstudent.Controllers;

import com.example.Studentmanagementstudent.Entities.Student;
import com.example.Studentmanagementstudent.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller

public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("students")
    public String listAllStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
    @GetMapping("students/new")
    public String createStudent(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "addStudent";
    }

    @PostMapping("students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }
    @GetMapping("students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }
    @PostMapping("students/{id}")
    public String updateStudent(@PathVariable Long id,
                    @ModelAttribute("student") Student student, Model model){
        Student studentById = studentService.getStudentById(id);
        studentById.setId(id);
        studentById.setFirstName(student.getFirstName());
        studentById.setLastName(student.getLastName());
        studentById.setEmail(student.getEmail());

        studentService.updateStudent(studentById);
        return "redirect:/students";
    }

}
