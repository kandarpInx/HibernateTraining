package com.demo.ManyToMany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table()
public class Vehicle {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vehicle_id;
	private String vehicle_name;
	@ManyToMany
	private Collection<Employee> employee = new ArrayList<Employee>();
	
	public Collection<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Collection<Employee> employee) {
		this.employee = employee;
	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
}
