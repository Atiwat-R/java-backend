package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
            new Student(1L, "Adam", 20, LocalDate.of(2000, 02, 24), "email.com"),
            new Student("SomeName", 25, LocalDate.of(1997, 10, 15), "email@example.com")
        );
    }
    
}
