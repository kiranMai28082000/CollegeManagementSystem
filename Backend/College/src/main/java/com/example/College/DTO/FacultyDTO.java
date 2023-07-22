package com.example.College.DTO;

public class FacultyDTO {

	private int facultyid;
	private String name;
	private String department;
	private String email;
	private String experience;
	private int mobile;
	
	public FacultyDTO() {
		super();
	}

	public FacultyDTO(int facultyid, String name, String department, String email, String experience, int mobile) {
		super();
		this.facultyid = facultyid;
		this.name = name;
		this.department = department;
		this.email = email;
		this.experience = experience;
		this.mobile = mobile;
	}

	public int getFacultyid() {
		return facultyid;
	}

	public void setFacultyid(int facultyid) {
		this.facultyid = facultyid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "FacultyDTO [facultyid=" + facultyid + ", name=" + name + ", department=" + department + ", email="
				+ email + ", experience=" + experience + ", mobile=" + mobile + "]";
	}
	
}
