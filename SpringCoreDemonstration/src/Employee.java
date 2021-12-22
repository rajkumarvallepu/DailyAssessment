import java.util.Objects;

public class Employee {
	private long empID;
	private String name, address, phone;
	private boolean salaryPaid;
	
	public long getEmpID() {
		return empID;
	}
	
	public void setEmpID(long empID) {
		this.empID = empID;
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
	
	public void setSalaryPaid(boolean salaryPaid) {
		this.salaryPaid = salaryPaid;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public boolean isSalaryPaid() {
		return salaryPaid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, empID, name, phone, salaryPaid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && empID == other.empID && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone) && salaryPaid == other.salaryPaid;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", salaryPaid=" + salaryPaid + ", getEmpID()=" + getEmpID() + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + ", isSalaryPaid()=" + isSalaryPaid()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
