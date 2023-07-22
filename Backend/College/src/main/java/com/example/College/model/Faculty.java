package com.example.College.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty")
public class Faculty {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="facultyid",length=50)
	private int facultyid;
	@Column(name="facultyname",length=50)
	private String name;
	@Column(name="facultydepartment",length=50)
	private String department;
	@Column(name="facultyemail",length=50)
	private String email;
	@Column(name="facultyexperience",length=50)
	private String experience;
	@Column(name="facultymobile",length=50)
	private int mobile;
	
	public Faculty() {
		super();
	}

	public Faculty(int facultyid, String name, String department, String email, String experience, int mobile) {
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
		return "Faculty [facultyid=" + facultyid + ", name=" + name + ", department=" + department + ", email=" + email
				+ ", experience=" + experience + ", mobile=" + mobile + "]";
	}

	
	}
