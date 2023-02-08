package com.example.spring2.service;
import com.example.spring2.models.Student;
import java.util.List;
import java.util.Date;
import com.example.spring2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student getById(Integer id){
        return studentRepository.findById(id).orElse(null);
    }
    public List<Student> getAllByAge(Integer age){
        return studentRepository.findByAge(age);
    }
    public List<Student> getAgeLessThan(Integer age){
        return studentRepository.findByAgeLessThan(age);
    }
    public List<Student> getDobBetween(Date dob1,Date dob2){
        return studentRepository.findByDobBetween(dob1,dob2);
    }
    public List<Student> getFirstname(String a){
        return studentRepository.findByFirstnameStartingWith(a);
    }
    public List<Student> getAgeOrderByLastname(Integer age){
        return studentRepository.findByAgeOrderByLastnameAsc(age);
    }
    public String deleteStudent(Integer id) {
        studentRepository.deleteById(id);
        return "deleted";

    }

    //update student

    public Student updateStudent(Student newstudent, int id) {
        return studentRepository.findById(id)
                .map(student -> {
                    student.setFirstname(newstudent.getFirstname());
                    student.setLastname(newstudent.getLastname());
                    student.setAge(newstudent.getAge());
                    return studentRepository.save(student);
                })
                .orElseGet(() -> {
                    newstudent.setId(id);
                    return studentRepository.save(newstudent);
                });
    }





}
