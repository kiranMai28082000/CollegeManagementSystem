package com.example.College.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.College.DTO.StudentDTO;
import com.example.College.DTO.StudentSaveDTO;
import com.example.College.exception.ResourceNotFound;
import com.example.College.model.Student;
import com.example.College.repository.StudentRepo;

@Service
public class StudentServiceIMPL implements StudentService{

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public String addStudent(StudentSaveDTO studentSaveDTO) {
		Student student=new Student(0, studentSaveDTO.getName(),studentSaveDTO.getCourse(),studentSaveDTO.getEmail()
				,studentSaveDTO.getPassword(),studentSaveDTO.getAddress());
		studentRepo.save(student);
		return student.getName();
	}

	@Override
	public List<StudentDTO> getAllStudents() {
		List<Student>getStudent=studentRepo.findAll();
		List<StudentDTO>StudentDTOList=new ArrayList<>();
		for(Student a:getStudent) {
			StudentDTO studentDTO=new StudentDTO(a.getStudentid(),a.getName(),a.getCourse(),a.getEmail(),
					a.getPassword(),a.getAddress());
			StudentDTOList.add(studentDTO);
		}
		return StudentDTOList;
	}

	@Override
	public Student updateStudent(Student student, int id) {
		Student existingStudent=studentRepo.findById(id).orElseThrow(()->new ResourceNotFound("Student","Id","id"));
		existingStudent.setName(student.getName());
		existingStudent.setCourse(student.getCourse());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setPassword(student.getPassword());
		existingStudent.setAddress(student.getAddress());
		studentRepo.save(existingStudent);
		return existingStudent;
	}

	@Override
	public boolean deleteStudent(int id) {
		if(studentRepo.existsById(id)) {
			studentRepo.deleteById(id);
		}
		else {
			System.out.println("Student is not found");
		}
		return true;
	}

	
}
