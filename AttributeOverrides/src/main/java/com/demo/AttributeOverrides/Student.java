package com.demo.AttributeOverrides;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int student_id;
	private String student_name;
	@Embedded
	private Address home_address;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(column = @Column(name="SCHOOL_STREET"), name = "street"),
		@AttributeOverride(column = @Column(name="SCHOOL_CITY"), name = "city")})
	private Address school_address;
	
	public Address getSchool_address() {
		return school_address;
	}
	public void setSchool_address(Address school_address) {
		this.school_address = school_address;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Address getHome_address() {
		return home_address;
	}
	public void setHome_address(Address home_address) {
		this.home_address = home_address;
	}
}
