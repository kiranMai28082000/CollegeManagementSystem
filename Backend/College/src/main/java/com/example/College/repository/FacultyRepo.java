package com.example.College.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.College.model.Faculty;

@EnableJpaRepositories
@Repository
public interface FacultyRepo extends JpaRepository<Faculty,Integer>{

}
