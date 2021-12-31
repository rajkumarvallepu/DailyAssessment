package com.htd.SpringSecurityWithDatabase.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.htd.SpringSecurityWithDatabase.config.AuditModel;

@Entity
@Table(name = "orders")
public class Order extends AuditModel implements Serializable {
    /**
    * 
    */
    private static final long serialVersionUID = -4007142105224945278L;
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int orderNum;
    private double amount;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
    
    

}
