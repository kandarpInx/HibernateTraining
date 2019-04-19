package com.demo.InhertanceTask;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Delete extends Update {
	
	private String deletedBy;

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}
	
}
