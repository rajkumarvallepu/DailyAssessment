package com.app.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Employee implements Serializable {

	 /**
     * 
     */
    private static final long serialVersionUID = 7144115798199856451L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eid; 
    private String name,address,phone;
    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;
    

	public Employee() {
		super();
	}
    
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", address=" + address + ", phone=" + phone + ", laptop="
				+ laptop + "]";
	}
	
    
    
}
