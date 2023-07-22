package com.example.College.service;

import java.util.*;

import com.example.College.DTO.StudentDTO;
import com.example.College.DTO.StudentSaveDTO;
import com.example.College.model.Student;

public interface StudentService {

	String addStudent(StudentSaveDTO studentSaveDTO);
	List<StudentDTO>getAllStudents();
	Student updateStudent(Student student,int id);
	boolean deleteStudent(int id);
	
}
