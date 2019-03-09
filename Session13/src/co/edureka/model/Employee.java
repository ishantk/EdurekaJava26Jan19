package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Mapping -> Where Attributes of an Objects are columns to table in database

/*
 	SQL:
 	create table Employee(
 		eid integer primary key auto_increment,
 		name varchar(256),
 		email varchar(256),
 		salalry integer,
 		department varchar(256)
 	)
 */

// POJO | Plain Old Java Object or Model or Bean


@Entity
@Table(name="MYEMPLOYEES")
public class Employee {

	// Attributes
	
	@Id @GeneratedValue
	@Column(name="EID")
	public Integer eid;
	
	@Column(name="NAME")
	public String name;
	
	@Column(name="EMAIL")
	public String email;
	
	@Column(name="SALARY")
	public Integer salalry;
	
	@Column(name="DEPARTMENT")
	public String department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer eid, String name, String email, Integer salalry, String department) {
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.salalry = salalry;
		this.department = department;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSalalry() {
		return salalry;
	}

	public void setSalalry(Integer salalry) {
		this.salalry = salalry;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", salalry=" + salalry + ", department="
				+ department + "]";
	}
}
