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
            Student marian = new Student("Marian", 42, LocalDate.of(2000, Month.APRIL, 5), "m@google.com");
            Student elena = new Student("Elena", 38, LocalDate.of(2000, Month.APRIL, 5), "e@google.com");
            studentRepository.saveAll(List.of(marian, elena));
        };
    }
}
