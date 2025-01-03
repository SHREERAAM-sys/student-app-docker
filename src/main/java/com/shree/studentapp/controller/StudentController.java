package com.shree.studentapp.controller;


import com.shree.studentapp.entity.Student;
import com.shree.studentapp.dao.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentRepo studentRepo;


    @GetMapping("/students")
    public List<Student> getList() {

        return studentRepo.findAll();

    }

    @GetMapping("/add")
    public void addStudent() {

        Student student = new Student();
        student.setName("Shree");
        student.setAge(22);
        studentRepo.save(student);
    }
}
