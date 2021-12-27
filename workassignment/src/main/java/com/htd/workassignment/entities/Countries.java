package com.htd.workassignment.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Countries {

	@Id
	@Column(name = "countryId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long countryId;

	@Column(name = "name")
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	private Regions region;

	public long getCountryId() {
		return countryId;
	}

	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Regions getRegion() {
		return region;
	}

	public void setRegion(Regions region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Countries [countryId=" + countryId + ", name=" + name + ", region=" + region + "]";
	}

	

}
