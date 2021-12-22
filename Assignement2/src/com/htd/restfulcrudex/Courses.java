package com.htd.restfulcrudex;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Courses implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8804092356325376228L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId, fees;
	private String courseName;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public long getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
}
