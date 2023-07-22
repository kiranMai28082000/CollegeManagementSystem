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

import com.example.College.DTO.FacultyDTO;
import com.example.College.DTO.FacultySaveDTO;
import com.example.College.DTO.StudentDTO;
import com.example.College.model.Faculty;
import com.example.College.model.Student;
import com.example.College.service.FacultyService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("api/v1/faculty")
public class FacultyController {

	@Autowired
	private FacultyService facultyService;
	
	@PostMapping(path="/save")
	public String saveFaculty(@RequestBody FacultySaveDTO facultySaveDTO) {
		String id=facultyService.addFaculty(facultySaveDTO);
		return id;
	}
	
	@GetMapping(path="/getAllFacultys")
	public List<FacultyDTO>getAllFacultys()
	{
		List<FacultyDTO>allFacultys=facultyService.getAllFacultys();
		return allFacultys;
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<Faculty>updateFaculty(@PathVariable("id") int id,@RequestBody Faculty faculty){
		return new ResponseEntity<Faculty>(facultyService.updateFaculty(faculty, id),HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/deleteFaculty/{id}")
	public String deleteFaculty(@PathVariable(value="id")int id) {
		boolean deleteFaculty =facultyService.deleteFaculty(id);
		return "deleted";
	}
}
