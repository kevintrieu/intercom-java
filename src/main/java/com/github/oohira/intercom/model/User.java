package com.github.oohira.intercom.model;

import java.util.Date;
import java.util.Map;

/**
 * Class representing a user.
 *
 * @author oohira
 */
public class User {
	
	private String type;
	private String id;
	private Date createdAt;
	private Date remoteCreatedAt;
	private Date updatedAt;
	private String userId;
	private String email;
	private String name;
	private Map<String, Object> customAttributes;
	private Date lastRequestAt;
	private Long sessionCount;
	private Avatar avatar;
	private Boolean unsubscribedFromEmails;
	private LocationData locationData;
	private String userAgentData;
	private String lastSeenIp;
	private Companies companies;
	private SocialProfiles socialProfiles;
	private Segments segments;
	private Tags tags;
	
    public User() {
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

	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(final String userId) {
		this.userId = userId;
	}
	
    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getCustomAttributes() {
        return this.customAttributes;
    }

    public void setCustomAttributes(final Map<String, Object> customAttributes) {
        this.customAttributes = customAttributes;
    }
    
    public Date getLastRequestAt() {
    	return lastRequestAt;
    }
    
    public void setLastRequestAt(Date lastRequestAt) {
    	this.lastRequestAt = lastRequestAt;
    }

    public Long getSessionCount() {
	    return this.sessionCount;
	}

    public Avatar getAvatar() {
        return this.avatar;
    }
    
    public void setAvatar(Avatar avatar) {
    	this.avatar = avatar;
    }
    
	public Boolean isUnsubscribedFromEmails() {
	    return this.unsubscribedFromEmails;
	}

	public LocationData getLocationData() {
	    return this.locationData;
	}
	
	public String getUserAgentData() {
		return userAgentData;
	}

	public String getLastSeenIp() {
        return this.lastSeenIp;
    }

    public void setLastSeenIp(final String lastSeenIp) {
        this.lastSeenIp = lastSeenIp;
    }

    public Company[] getCompanies() {
    	return (this.companies != null) ? this.companies.getCompanies() : null;
    }
    
    public void setCompanies(final Company[] companies) {
        this.companies = new Companies(companies);
    }

	public SocialProfile[] getSocialProfiles() {
	    return (this.socialProfiles != null) ? this.socialProfiles.getSocialProfiles() : null;
	}
	
	public Tag[] getTags() {
		return (this.tags != null) ? this.tags.getTags() : null;
	}
	
	public Segment[] getSegments() {
		return (this.segments != null) ? this.segments.getSegments() : null;
	}
}
