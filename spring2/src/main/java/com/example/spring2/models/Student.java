package com.example.spring2.models;
import java.lang.Object;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private Integer age;


    private Date dob;

}
