package com.example.studentmanager.controller;

import com.example.studentmanager.model.Student;
import com.example.studentmanager.service.StudentService;
import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public List<Student> getStudent(){
        return studentService.getListStudent();
    }

    @GetMapping("/{id}")
    public Student findStudentById(@PathVariable int id){
        return  studentService.findStudentById(id);
    }

    @PostMapping("")
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @PostMapping("/update")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }
}
