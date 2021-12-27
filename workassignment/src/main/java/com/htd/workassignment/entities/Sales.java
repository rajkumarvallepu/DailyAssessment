package com.htd.workassignment.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sales")
public class Sales {

	@Id
	@Column(name = "saleId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long saleId;

	@Column(name = "salesChannel")
	private String salesChannel;

	@Column(name = "orderNumber")
	private int orderNumber;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Products> products;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Customers> customers;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Currencies> currencies;

	@Column(name = "netAmount")
	private int netAmount;

	@Column(name = "tax")
	private int tax;

	@Column(name = "shippingCost")
	private int shippingCost;

	@Column(name = "grossAmount")
	private int grossAmount;

	public long getSaleId() {
		return saleId;
	}

	public void setSaleId(long saleId) {
		this.saleId = saleId;
	}

	public String getSalesChannel() {
		return salesChannel;
	}

	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public List<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}

	public List<Currencies> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<Currencies> currencies) {
		this.currencies = currencies;
	}

	public int getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(int netAmount) {
		this.netAmount = netAmount;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(int shippingCost) {
		this.shippingCost = shippingCost;
	}

	public int getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(int grossAmount) {
		this.grossAmount = grossAmount;
	}

	@Override
	public String toString() {
		return "Sales [saleId=" + saleId + ", salesChannel=" + salesChannel + ", orderNumber=" + orderNumber
				+ ", products=" + products + ", customers=" + customers + ", currencies=" + currencies + ", netAmount="
				+ netAmount + ", tax=" + tax + ", shippingCost=" + shippingCost + ", grossAmount=" + grossAmount + "]";
	}
	
	

}
