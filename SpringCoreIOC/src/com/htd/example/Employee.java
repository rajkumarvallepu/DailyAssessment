package com.htd.example;

import java.util.Objects;

public class Employee {
	private long eid;
	private String name;
	private Laptop laptop;
	
//	public Employee(String name) {
//		super();
//		this.name = name;
//	}
//	
//	public Employee(long eid) {
//		super();
//		this.eid = eid;
//	}
	
	public Employee(long eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(eid, name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (getClass() != obj.getClass()) {
//			return false;
//		}
//		Employee other = (Employee) obj;
//		return eid == other.eid && Objects.equals(name, other.name);
//	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", laptop=" + laptop + "]";
	}
	
	
	
}
