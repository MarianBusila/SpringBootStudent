package com.example.student.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student marian = new Student("Marian", LocalDate.of(1980, Month.OCTOBER, 5), "m@google.com");
            Student elena = new Student("Elena", LocalDate.of(1984, Month.MAY, 5), "e@google.com");
            studentRepository.saveAll(List.of(marian, elena));
        };
    }
}
