package com.htd.workassignment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regions")
public class Regions {

	@Id
	@Column(name="regionId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long regionId;
	
	@Column(name="name")
	private String name;

	public long getRegionId() {
		return regionId;
	}

	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Regions [regionId=" + regionId + ", name=" + name + "]";
	}
	
	
}
