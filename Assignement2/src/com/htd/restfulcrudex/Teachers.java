package com.htd.restfulcrudex;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teachers implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8200960945324991376L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherId;
	private String subject;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
