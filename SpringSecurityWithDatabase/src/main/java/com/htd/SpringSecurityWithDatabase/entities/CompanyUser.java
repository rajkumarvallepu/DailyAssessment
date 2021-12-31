package com.htd.SpringSecurityWithDatabase.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.htd.SpringSecurityWithDatabase.config.AuditModel;

@Entity
@Table(name="company_user")
public class CompanyUser extends AuditModel implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -6603226864656528349L;

	public static final String ROLE_MANAGER = "MANAGER";
	public static final String ROLE_EMPLOYEE = "EMPLOYEE";

	@Column(name = "Active", length = 1, nullable = true)
	private boolean active;

	@Column(name = "User_Role", length = 20, nullable = true)
	private String userRole;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true, length = 45)
	private String email;

	@Column(nullable = false, length = 64)
	private String password;

	@Column(name = "first_name", nullable = false, length = 20)
	private String firstName;

	@Column(name = "last_name", nullable = false, length = 20)
	private String lastName;
	private String username;

	@OneToOne(cascade = CascadeType.ALL)
	private Deparment depatment;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Deparment getDepatment() {
		return depatment;
	}

	public void setDepatment(Deparment depatment) {
		this.depatment = depatment;
	}

	public static String getRoleManager() {
		return ROLE_MANAGER;
	}

	public static String getRoleEmployee() {
		return ROLE_EMPLOYEE;
	}

	public CompanyUser(String email) {
		super();
		this.email = email;
	}

	public CompanyUser() {
	}

	
}
