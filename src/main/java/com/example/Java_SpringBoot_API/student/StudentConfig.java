package com.example.Java_SpringBoot_API.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//This entire class/file is only needed when inserting certain data into the database
//manually, it is not needed in a running API as clients would make POST request into
//the database. This is just used to test the functionality/JPA connections to the Database
//With the following hardcoded DATA given below.
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student alienz = new Student(
                    "Alienz Kenneth",
                    "alienz@gmail.com",
                    LocalDate.of(1990, Month.MARCH, 25)
            );
            Student zizi = new Student(
                    "Zizi Oden",
                    "zizi@gmail.com",
                    LocalDate.of(1997, Month.JULY, 28)
            );
            Student essemm = new Student(
                    "Essemm Loki",
                    "essemm@gmail.com",
                    LocalDate.of(1985, Month.APRIL, 16)
            );

            //Saving To Database
            repository.saveAll(
                    List.of(alienz, zizi, essemm)
            );
        };
    }
}

