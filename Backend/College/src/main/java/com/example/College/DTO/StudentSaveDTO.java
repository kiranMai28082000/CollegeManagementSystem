package com.example.College.DTO;

public class StudentSaveDTO {

	private String name;
	private String course;
	private String email;
	private String password;
	private String address;
	
	public StudentSaveDTO() {
		super();
	}

	public StudentSaveDTO(String name, String course, String email, String password, String address) {
		super();
		this.name = name;
		this.course = course;
		this.email = email;
		this.password = password;
		this.address = address;
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
		return "StudentSaveDTO [name=" + name + ", course=" + course + ", email=" + email + ", password=" + password
				+ ", address=" + address + "]";
	}
	
}
