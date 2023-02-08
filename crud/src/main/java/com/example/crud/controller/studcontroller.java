package com.example.crud.controller;
import com.example.crud.model.Student;
import com.example.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studcontroller {
    @Autowired
    private StudentService studentService;

    @GetMapping("/allstudents")
    public List<Student> getAllStudents(){
        return this.studentService.getStudents();
    }

    @PostMapping("/createstudent")
    public String createStudent(@RequestBody Student student){
         this.studentService.createStudent(student);
        return "created";
    }
    //delete
    @DeleteMapping("/deletestudent/{id}")
    public String deleteStudent(@PathVariable int id){
         this.studentService.deleteStudent(id);
        return "deleted";
    }

    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@RequestBody Student newstudent, @PathVariable int id){return this.studentService.updateStudent(newstudent,id);}

    //getbyid

    @GetMapping("/getstudent/{id}")
    public Student getStudentById(@PathVariable int id){return this.studentService.getStudenyById(id);}


}
