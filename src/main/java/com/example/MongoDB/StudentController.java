package com.example.MongoDB;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("api/students")
    public List<Student> fetchAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("api/students/create")
    public void insertStudent(@RequestBody Student student) {
        studentService.insertStudent(student);
    }


}
