package com.example.crud.repository;

import com.example.crud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studRepo extends JpaRepository<Student,Integer> {
}
