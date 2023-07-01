package com.example.MongoDB;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@SpringBootApplication
public class MongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(
//            StudentRepository repository, MongoTemplate mongoTemplate) {
//        return args -> {
//            Address address = new Address(
//                    "Serbia",
//                    "11000",
//                    "Belgrade"
//            );
//            Student student = new Student(
//                    "Sponge",
//                    "Bob check mail",
//                    "bob3@gmail.com",
//                    Gender.FEMALE,
//                    address,
//                    List.of("Computer science", "Maths"),
//                    BigDecimal.TEN,
//                    LocalDateTime.now()
//            );

            // usingMongoTemplateAndQuery(repository, mongoTemplate, student);

//            repository.findStudentByEmail(student.getEmail())
//                    .ifPresentOrElse(s -> System.out.println(student + " already exists"),
//                            () -> {
//                                System.out.println("Inserting student " + student);
//                                repository.insert(student);
//                            });
//        };
//    }

//    private static void usingMongoTemplateAndQuery(StudentRepository repository, MongoTemplate mongoTemplate, Student student) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("email").is(student.getEmail()));
//
//        List<Student> students = mongoTemplate.find(query, Student.class);
//
//        if (students.size() > 1) {
//            throw new IllegalStateException("Found many students with email " + student.getEmail());
//        }
//
//        if (students.isEmpty()) {
//            System.out.println("Inserting student " + student);
//            repository.insert(student);
//        } else {
//            System.out.println(student + " already exists");
//        }
//    }

}
