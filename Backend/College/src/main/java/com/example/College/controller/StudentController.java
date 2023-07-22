package com.example.College.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.College.DTO.StudentDTO;
import com.example.College.DTO.StudentSaveDTO;
import com.example.College.model.Student;
import com.example.College.service.FacultyService;
import com.example.College.service.StudentService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("api/v1/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping(path="/save")
	public String saveStudent(@RequestBody StudentSaveDTO studentSaveDTO)
	{
		String id=studentService.addStudent(studentSaveDTO);
		return id;
	}
	@GetMapping(path="/getAllStudents")
	public List<StudentDTO>getAllStudents()
	{
		List<StudentDTO>allStudents=studentService.getAllStudents();
		return allStudents;
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<Student>updateStudent(@PathVariable("id") int id,@RequestBody Student student){
		return new ResponseEntity<Student>(studentService.updateStudent(student, id),HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/deleteStudent/{id}")
	public String deleteStudent(@PathVariable(value="id")int id) {
		boolean deleteStudent =studentService.deleteStudent(id);
		return "deleted";
	}
	
	
	
}
