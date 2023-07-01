package com.example.MongoDB;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void insertStudent(Student student) {
        studentRepository.findStudentByEmail(student.getEmail())
                .ifPresentOrElse(s -> System.out.println(student + " already exists"),
                        () -> {
                            System.out.println("Inserting student " + student);
                            student.setCreatedAt(LocalDateTime.now());
                            studentRepository.insert(student);
                        });
    }

}
