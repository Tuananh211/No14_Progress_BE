package com.example.studentmanager.service;

import com.example.studentmanager.model.Student;
import com.example.studentmanager.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getListStudent(){
        return studentRepository.findAll();
    }
    public Student findStudentById(int id){
        return studentRepository.findStudentById(id);
    }
    public void saveStudent(Student student){
        studentRepository.save(student);
    }
    public String updateStudent(Student student){
        Student s1= studentRepository.findStudentById(student.getId());
        if(s1!=null){
            s1.setName(student.getName());
            s1.setGender(student.getGender());
            s1.setBirthday(student.getBirthday());
            s1.setClassA(student.getClassA());
            studentRepository.save(s1);
            return "Successfully";
        }
        else{
            return "Not found";
        }
    }
    public String deleteStudent(int id){
        Student s1= studentRepository.findStudentById(id);
        if(s1!=null){
           studentRepository.deleteById(id);
            return "Successfully";
        }
        else{
            return "Not found";
        }
    }
}
