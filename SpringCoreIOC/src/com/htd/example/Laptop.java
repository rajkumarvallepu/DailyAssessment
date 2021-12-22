package com.htd.example;
import java.util.Objects;

public class Laptop {
	private long lid;
	private String cpu;
	private int ram;
	public long getLid() {
		return lid;
	}
	public void setLid(long lid) {
		this.lid = lid;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(cpu, lid, ram);
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
//		Laptop other = (Laptop) obj;
//		return Objects.equals(cpu, other.cpu) && lid == other.lid && ram == other.ram;
//	}
	@Override
	public String toString() {
		return "laptop [lid=" + lid + ", cpu=" + cpu + ", ram=" + ram + ", getLid()=" + getLid() + ", getCpu()="
				+ getCpu() + ", getRam()=" + getRam() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
