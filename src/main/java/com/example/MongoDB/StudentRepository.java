package com.example.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository
        extends MongoRepository<Student, String> {
}
