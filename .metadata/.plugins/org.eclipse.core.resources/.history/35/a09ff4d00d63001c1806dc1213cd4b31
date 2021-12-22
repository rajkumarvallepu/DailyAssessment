import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = -7409929725102932771L;

	// optional

	@Id // Creating primary key column
	@GeneratedValue(strategy = GenerationType.AUTO) // automatic generating primary key
	@Column(name = "EmployeeID") // naming column as specified name
	private int empID;

	@Column(name = "EmployeeName")
	private String empName;

	@Column(name = "EmployeeAddress")
	private String empAddress;

	@Column(name = "EmployeeContact")
	private long empContact;

	@OneToOne(cascade = CascadeType.ALL) // perform Operation on the child class
	private Laptop laptop;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Phone> telephones;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public long getEmpContact() {
		return empContact;
	}

	public void setEmpContact(long empContact) {
		this.empContact = empContact;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public List<Phone> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<Phone> telephones) {
		this.telephones = telephones;
	}

}
