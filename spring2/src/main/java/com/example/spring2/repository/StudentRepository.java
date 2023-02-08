package com.example.spring2.repository;
import java.util.List;
import java.util.Date;
import com.example.spring2.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByAge(Integer age);
    List<Student> findByAgeLessThan(Integer age);

    List<Student> findByDobBetween(Date dob1,Date dob2);

    List<Student> findByFirstnameStartingWith(String a);

    List<Student> findByAgeOrderByLastnameAsc(Integer age);
}
