package com.htd.workassignment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="currencies")
public class Currencies {
	
	@Id
	@Column(name="currencyId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long currencyId;
	
	public long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(long currencyId) {
		this.currencyId = currencyId;
	}

	@Column(name="name")
	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Currencies [currencyId=" + currencyId + ", name=" + name + "]";
	}
	
	
}
