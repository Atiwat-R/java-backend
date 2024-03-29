package com.example.demo.student;

import java.time.LocalDate;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Student {

    private Long id;
    private String name;
    private Integer age;
    private LocalDate birthDate;
    private String email;

    // Input id
    public Student(Long id, String name, Integer age, LocalDate birthDate, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.email = email;
    }
    // Without id
    public Student(String name, Integer age, LocalDate birthDate, String email) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.email = email;
    }




}
