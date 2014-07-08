package com.github.oohira.intercom.model;

public class Companies {
	private Company[] companies;
	
	public Companies() {
	}
	
	public Companies(final Company[] companies) {
		this.companies = companies;
	}
	
	public Company[] getCompanies() {
		return this.companies;
	}
	
    public void setCompanies(final Company[] companies) {
        this.companies = companies;
    }
}
