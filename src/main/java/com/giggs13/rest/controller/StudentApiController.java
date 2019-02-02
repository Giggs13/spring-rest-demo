package com.giggs13.rest.controller;

import com.giggs13.rest.entity.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentApiController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Poornima", "Patel"));
        students.add(new Student("Mario", "Rossi"));
        students.add(new Student("Mary", "Smith"));

        return students;
    }
}
