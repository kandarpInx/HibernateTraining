package com.demo.HQLJoins;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id @GeneratedValue
	private int custId;
	private String custName;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="cust")
	private Collection<ProductDetails> pd = new ArrayList<ProductDetails>();
	
	
	public Collection<ProductDetails> getPd() {
		return pd;
	}
	public void setPd(Collection<ProductDetails> pd) {
		this.pd = pd;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
}
