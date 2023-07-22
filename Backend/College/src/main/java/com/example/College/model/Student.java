package com.example.College.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="studentid" ,length=50)
	private int studentid;
	@Column(name="studentname" ,length=50)
	private String name;
	@Column(name="studentcourse" ,length=50)
	private String course;
	@Column(name="studentemail" ,length=50)
	private String email;
	@Column(name="studentpassword" ,length=50)
	private String password;
	@Column(name="studentaddress" ,length=50)
	private String address;
	
	public Student() {
		super();
	}

	public Student(int studentid, String name, String course, String email, String password, String address) {
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
		return "Student [studentid=" + studentid + ", name=" + name + ", course=" + course + ", email=" + email
				+ ", password=" + password + ", address=" + address + "]";
	}
	
	
	
}
