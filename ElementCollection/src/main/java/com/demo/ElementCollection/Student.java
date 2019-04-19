package com.demo.ElementCollection;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity

public class Student {
	
	@Id
	private int student_id;
	private String student_name;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@JoinTable(name="Student_address",joinColumns=@JoinColumn(name="student_id"))
	@GenericGenerator(name = "inc", strategy = "increment")
	@CollectionId(columns = { @Column(name="address_id") }, generator = "inc", type = @Type(type = "int"))
	private Collection<Address> addrCollection = new ArrayList();
	
	public Collection<Address> getAddrCollection() {
		return addrCollection;
	}
	public void setAddrCollection(Collection<Address> addrCollection) {
		this.addrCollection = addrCollection;
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
	
}
