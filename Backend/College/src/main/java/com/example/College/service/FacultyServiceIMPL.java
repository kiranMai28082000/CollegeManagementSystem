package com.example.College.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.College.DTO.FacultyDTO;
import com.example.College.DTO.FacultySaveDTO;
import com.example.College.exception.ResourceNotFound;
import com.example.College.model.Faculty;
import com.example.College.repository.FacultyRepo;

@Service
public class FacultyServiceIMPL implements FacultyService{

	@Autowired
	private FacultyRepo facultyRepo;
	
	@Override
	public String addFaculty(FacultySaveDTO facultySaveDTO) {
	Faculty faculty=new Faculty(0, facultySaveDTO.getName(),facultySaveDTO.getDepartment(),facultySaveDTO.getEmail()
			,facultySaveDTO.getExperience(),facultySaveDTO.getMobile());
	facultyRepo.save(faculty);
		return faculty.getName();
	}

	@Override
	public List<FacultyDTO> getAllFacultys() {
		List<Faculty>getFaculty=facultyRepo.findAll();
		List<FacultyDTO>FacultyDTOList=new ArrayList<>();
		for(Faculty a:getFaculty) {
			FacultyDTO facultyDTO=new FacultyDTO(a.getFacultyid(),a.getName(),a.getDepartment(),a.getEmail(),
					a.getExperience(),a.getMobile());
			FacultyDTOList.add(facultyDTO);
		}
		return FacultyDTOList;
	}

	@Override
	public Faculty updateFaculty(Faculty faculty, int id) {
		Faculty existingFaculty=facultyRepo.findById(id).orElseThrow(()->new ResourceNotFound("Faculty","Id","id"));
		existingFaculty.setName(faculty.getName());
		existingFaculty.setDepartment(faculty.getDepartment());
		existingFaculty.setEmail(faculty.getEmail());
		existingFaculty.setExperience(faculty.getExperience());
		existingFaculty.setMobile(faculty.getMobile());
		facultyRepo.save(existingFaculty);
		return existingFaculty;
	}

	@Override
	public boolean deleteFaculty(int id) {
		if(facultyRepo.existsById(id)) {
			facultyRepo.deleteById(id);
		}
		else {
			System.out.println("Faculty id is not found");
		}
		return true;
	}

}
