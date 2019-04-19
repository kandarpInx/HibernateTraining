package com.demo.InhertanceTask;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Update extends Create {
	
	private String updatedBy;

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
}
