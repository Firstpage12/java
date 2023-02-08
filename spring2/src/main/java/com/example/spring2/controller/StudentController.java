package com.example.spring2.controller;
import com.example.spring2.models.Student;
import com.example.spring2.repository.StudentRepository;
import com.example.spring2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    StudentService studentService;
    @GetMapping("/getById")
    public Student getById(@RequestParam Integer id){
        return studentService.getById(id);

    }
    @GetMapping("/getAllByAge/{age}")
    public List<Student> getAllByAge(@PathVariable Integer age){
        return studentService.getAllByAge(age);
    }
    @GetMapping("/getAgeLessThan/{age}")
    public List<Student> getAgeLessThan(@PathVariable Integer age){
        return studentService.getAgeLessThan(age);
    }
    @GetMapping("/getFirstname")
    public List<Student> getFirstname(@RequestParam String a){
        return studentService.getFirstname(a);
    }
    @GetMapping("/getDobBetween")
    public List<Student> getDobBetween(@RequestParam Date dob1,@RequestParam Date dob2){
        return studentService.getDobBetween(dob1,dob2);
    }
    @GetMapping("/getAgeOrderByLastname")
    public List<Student> getAgeOrderByLastname(@RequestParam Integer age){
        return studentService.getAgeOrderByLastname(age);
    }
    @DeleteMapping("/deletestudent/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return this.studentService.deleteStudent(id);
    }

    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@RequestBody Student newstudent, @PathVariable int id){return this.studentService.updateStudent(newstudent,id);}

}
