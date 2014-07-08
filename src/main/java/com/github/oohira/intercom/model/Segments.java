package com.github.oohira.intercom.model;

public class Segments {

	private String type;
	private Segment[] segments;
	
	public Segments() {
	}
	
	public Segments(final Segment[] segments) {
		this.segments = segments;
	}
	
	public String getType() {
		return type;
	}
	
	public Segment[] getSegments() {
		return segments;
	}
	
	public void setSegments(final Segment[] segments) {
		this.segments = segments;
	}

}
