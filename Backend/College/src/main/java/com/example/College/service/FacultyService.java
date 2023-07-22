package com.example.College.service;

import java.util.List;

import com.example.College.DTO.FacultyDTO;
import com.example.College.DTO.FacultySaveDTO;
import com.example.College.model.Faculty;



public interface FacultyService {

	String addFaculty(FacultySaveDTO facultySaveDTO);
	List<FacultyDTO>getAllFacultys();
	Faculty updateFaculty(Faculty faculty,int id);
	boolean deleteFaculty(int id);
}
