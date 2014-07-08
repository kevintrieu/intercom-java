package com.github.oohira.intercom.model;

import java.util.Date;

public class Segment {

	private String type;
	private String id;
	private String name;
	private Date createdAt;
	private Date updatedAt;
	
	public Segment() {
	}
	
    public String getType() {
    	return type;
    }
    
    public String getId() {
    	return id;
    }

	public String getName() {
    	return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
    	return createdAt;
    }
    
	public Date getUpdatedAt() {
    	return updatedAt;
    }
	
}
