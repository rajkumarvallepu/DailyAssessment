package com.app.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;
    private String comment;
    @Enumerated(EnumType.STRING)
    private Phone_Type phone_Type;
    
	public Phone() {
		super();
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Phone_Type getPhone_Type() {
		return phone_Type;
	}

	public void setPhone_Type(Phone_Type phone_Type) {
		this.phone_Type = phone_Type;
	}

	@Override
	public String toString() {
		return "Phone [pid=" + pid + ", comment=" + comment + ", phone_Type=" + phone_Type + "]";
	}
	
	
    
    
}
