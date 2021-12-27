package com.htd.workassignment.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contries_currencies")
public class CountriesCurrencies {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne(cascade = CascadeType.ALL)
	private Currencies currencies;

	@OneToOne(cascade = CascadeType.ALL)
	private Countries countries;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Currencies getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Currencies currencies) {
		this.currencies = currencies;
	}

	public Countries getCountries() {
		return countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "CountriesCurrencies [id=" + id + ", currencies=" + currencies + ", countries=" + countries + "]";
	}

	

	
}
