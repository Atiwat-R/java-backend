package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<StudentModel> getStudents() {
        return List.of(
            new StudentModel(1L, "Adam", 20, LocalDate.of(2000, 02, 24), "email.com"),
            new StudentModel("SomeName", 25, LocalDate.of(1997, 10, 15), "email@example.com")
        );
    }

}
