package com.github.oohira.intercom.model;

/**
 * Class representing a tag.
 *
 * @author oohira
 */
public class Tag {
	
	private String type;
    private String id;
    private String name;

    public Tag() {
    }

    private String getType() {
    	return type;
    }
    
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
