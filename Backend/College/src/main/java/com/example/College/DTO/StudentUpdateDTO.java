package com.example.College.DTO;

public class StudentUpdateDTO {

	private int studentid;
	private String name;
	private String course;
	private String email;
	private String password;
	private String address;
	
	public StudentUpdateDTO() {
		super();
	}

	public StudentUpdateDTO(int studentid, String name, String course, String email, String password, String address) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.course = course;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentUpdateDTO [studentid=" + studentid + ", name=" + name + ", course=" + course + ", email=" + email
				+ ", password=" + password + ", address=" + address + "]";
	}
	
	
}
