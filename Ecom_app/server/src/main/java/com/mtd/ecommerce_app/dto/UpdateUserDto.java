package com.mtd.ecommerce_app.dto;

import jakarta.validation.constraints.NotBlank;

public class UpdateUserDto {
	@NotBlank(message = "Street cannot be empty")
	private String street;
	@NotBlank(message = "City cannot be empty")
    private String city;
	@NotBlank(message = "Zip cannot be empty")
    private String zip;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
    
}
