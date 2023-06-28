package com.example.MongoDB;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class MongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StudentRepository repository) {
        return args -> {
            Address address = new Address(
                    "Serbia",
                    "11000",
                    "Belgrade"
            );
            Student student = new Student(
                    "Sponge",
                    "Bob",
                    "bob1@gmail.com",
                    Gender.FEMALE,
                    address,
                    List.of("Computer science", "Maths" ),
                    BigDecimal.TEN,
                    LocalDateTime.now()
            );

            repository.insert(student);
        };
    }

}
