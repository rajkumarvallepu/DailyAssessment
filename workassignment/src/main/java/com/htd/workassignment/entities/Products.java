package com.htd.workassignment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {

	@Id
	@Column(name="productId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="shortDescription")
	private String shortDescription;
	
	@Column(name="longDescription")
	private String longDescription;
	
	@Column(name="size")
	private String size;
	
	@Column(name="colour")
	private String colour;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", name=" + name + ", shortDescription=" + shortDescription
				+ ", longDescription=" + longDescription + ", size=" + size + ", colour=" + colour + "]";
	}
	
	
}
