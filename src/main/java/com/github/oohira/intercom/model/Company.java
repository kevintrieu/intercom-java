package com.github.oohira.intercom.model;

import java.util.Date;
import java.util.Map;

/**
 * Class representing a company of {@link User}.
 *
 * @author oohira
 */
public class Company {

	private String type;
	private String id;
	private Date createdAt;
	private Date remoteCreatedAt;
	private Date updatedAt;
    private String companyId;
    private String name;
    private Map<String, Object> customAttributes;
    private Long sessionCount;
    private Double monthlySpend;
    private Double userCount;
    private String planId;

    public Company() {
    }
    
    public String getType() {
    	return type;
    }
    
    public String getId() {
    	return id;
    }
    
    public Date getCreatedAt() {
    	return createdAt;
    }
    
    public Date getRemoteCreatedAt() {
    	return this.remoteCreatedAt;
    }
    
    public void setRemoteCreatedAt(final Date remoteCreatedAt) {
		this.remoteCreatedAt = remoteCreatedAt;
	}

	public Date getUpdatedAt() {
    	return updatedAt;
    }
    
    public String getCompanyId() {
    	return this.companyId;
    }
    
    public void setCompanyId(final String companyId) {
		this.companyId = companyId;
	}

	public String getName() {
    	return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Map<String, Object> getCustomAttributes() {
	    return this.customAttributes;
	}

	public void setCustomAttributes(final Map<String, Object> customAttributes) {
	    this.customAttributes = customAttributes;
	}

	public Long getSessionCount() {
		return sessionCount;
	}

	public void setSessionCount(Long sessionCount) {
		this.sessionCount = sessionCount;
	}

	public Double getMonthlySpend() {
    	return this.monthlySpend;
    }

    public void setMonthlySpend(final Double monthlySpend) {
	    this.monthlySpend = monthlySpend;
	}
    
    public Double getUserCount() {
    	return userCount;
    }
    
	public String getPlanId() {
	    return this.planId;
	}

	public void setPlanId(final String planId) {
        this.planId = planId;
    }
}
