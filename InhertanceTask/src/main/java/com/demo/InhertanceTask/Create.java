package com.demo.InhertanceTask;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Create {
	
	private String createBy;

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
}
