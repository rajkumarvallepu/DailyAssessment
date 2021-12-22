package com.htd.restfulcrudex;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5326101768774864410L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "StudentID") // naming column as specified name
	private int studentID;

	@Column(name = "StudentName")
	private String studentName;

	@Column(name = "StudentAddress")
	private String studentAddress;

	@Column(name = "StudentContact")
	private long studentContact;

	@OneToOne(cascade = CascadeType.ALL) // perform Operation on the child class
	private Teachers teachers;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Courses> fees;

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public long getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(long studentContact) {
		this.studentContact = studentContact;
	}

	public Teachers getTeachers() {
		return teachers;
	}

	public void setTeachers(Teachers teachers) {
		this.teachers = teachers;
	}

	public List<Courses> getTelephones() {
		return fees;
	}

	public void setTelephones(List<Courses> telephones) {
		this.fees = telephones;
	}

}
