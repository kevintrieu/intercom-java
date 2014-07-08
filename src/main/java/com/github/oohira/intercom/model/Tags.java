package com.github.oohira.intercom.model;

public class Tags {

	private String type;
	private Tag[] tags;
	
	public Tags() {
	}
	
	public Tags(final Tag[] tags) {
		this.tags = tags;
	}
	
	public String getType() {
		return type;
	}
	
	public Tag[] getTags() {
		return tags;
	}
	
	public void setTags(final Tag[] tags) {
		this.tags = tags;
	}
	
}
