package com.giggs13.rest.controller;

import com.giggs13.rest.entity.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentApiController {

    private List<Student> students;

    @PostConstruct
    private void init() {
        initStudents();
    }

    private void initStudents() {
        students = new ArrayList<>();
        students.add(new Student(1, "Poornima", "Patel"));
        students.add(new Student(2, "Mario", "Rossi"));
        students.add(new Student(3, "Mary", "Smith"));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Student> getAll() {
        return students;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Student getById(@PathVariable int id) {
        return students.get(id);
    }
}
