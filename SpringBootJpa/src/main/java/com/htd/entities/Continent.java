package com.htd.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Continents")
public class Continent implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "continent_name")
	private String name;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "continent_id") // foreign key
	private Set<Country> countries;

	@OneToOne(cascade = CascadeType.ALL)
	private Country countrieses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	public Country getCountrieses() {
		return countrieses;
	}

	public void setCountrieses(Country countrieses) {
		this.countrieses = countrieses;
	}
	
	
}
