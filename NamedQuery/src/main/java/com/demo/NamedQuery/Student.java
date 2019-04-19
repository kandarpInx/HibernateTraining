package com.demo.NamedQuery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

//@NamedQuery(name="select_all_records",query="from Student")
@NamedQuery(name="select_record_by_id",query="from Student where studId = :studId")
@Entity
public class Student {

	@Id @GeneratedValue
	private int studId;
	private String studName;
	private String studAddr;
	private int marks;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudAddr() {
		return studAddr;
	}
	public void setStudAddr(String studAddr) {
		this.studAddr = studAddr;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
}
