package com.example.College.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.College.model.Student;
@EnableJpaRepositories
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
 Student findByemail (String email);
}
