package com.example.spring2;

import com.example.spring2.models.Student;
import com.example.spring2.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.junit.jupiter.api.Assertions;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentRepositoryTest
{
    @Autowired
    private StudentRepository studentRepository;
    private Student student;

    @BeforeEach
    public void setUp()
    {
        this.student = new Student(1,"anishka","ratnawat",21,new Date("23/05/2001"));
    }


    @Test
    public void testFindById()
    {
        Student student1 = new Student(1,"anishka","ratnawat",21,new Date("23/05/2001"));
        studentRepository.save(student1);

        Student student2 = studentRepository.findById(student.getId()).get();

        Assertions.assertNotNull(student2);
    }

    @Test
    public void testFindByAge()
    {
        Student student1 = new Student(1,"anishka","ratnawat",21,new Date("23/05/2001"));
        studentRepository.save(student1);

        List<Student> studentByAge = studentRepository.findByAge(21);

        Assertions.assertNotNull(studentByAge);
        Assertions.assertTrue(studentByAge.size() > 0);
    }

    @Test
    public void testFindByFirstName()
    {
        Student student1 = new Student(1,"anishka","ratnawat",21,new Date("23/05/2001"));
        studentRepository.save(student1);

        List<Student> studentByFirstName = studentRepository.findByFirstnameStartingWith("a");

        Assertions.assertNotNull(studentByFirstName);
        Assertions.assertTrue(studentByFirstName.size() > 0);
    }
    @Test
    public void testUpdateById()
    {
        Student student1 = new Student(1,"anishka","ratnawat",21,new Date("23/05/2001"));
        studentRepository.save(student1);

        Student student2= studentRepository.findById(student.getId()).get();
        student2.setAge(22);
        student2.setFirstname("anu");
        student2.setLastname("Gupta");
        student2.setDob(new Date("24/05/2001"));
        Student student3= studentRepository.save(student2);

        Assertions.assertTrue(student3.getAge()==22);
        Assertions.assertTrue(student3.getFirstname()=="anu");
        Assertions.assertTrue(student3.getLastname()=="Gupta");



    }


    @Test
    public void testDeleteById()
    {
        Student student1 = new Student(1,"anishka","ratnawat",21,new Date("23/05/2001"));
        studentRepository.save(student1);

        studentRepository.deleteById(student1.getId());

        Optional<Student> deleteStudent= studentRepository.findById(student.getId());
        Assertions.assertFalse(deleteStudent.isPresent());
    }
}
