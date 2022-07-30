package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Department {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	@Column
	private String dname;
	@OneToMany(mappedBy = "department")
	private List<Employee2> employee2s;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Employee2> getEmployee2s() {
		return employee2s;
	}

	public void setEmployee2s(List<Employee2> employee2s) {
		this.employee2s = employee2s;
	}

}
