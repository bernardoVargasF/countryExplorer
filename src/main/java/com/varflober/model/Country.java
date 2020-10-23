package com.varflober.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) 
public class Country {
	private String name;
	private String capital;
	private String region;
	private String subregion;
	private String alpha2Code;
	private List<String> languages;
	
	public Country() {
	}

	public Country(String name, String capital, String region, String subregion, String alpha2Code,
			List<String> languages) {
		super();
		this.name = name;
		this.capital = capital;
		this.region = region;
		this.subregion = subregion;
		this.alpha2Code = alpha2Code;
		this.languages = languages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public String getAlpha2Code() {
		return alpha2Code;
	}

	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
