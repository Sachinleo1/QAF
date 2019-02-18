package com.qmetry.qaf.databeans;

import com.qmetry.qaf.automation.data.BaseDataBean;
import com.qmetry.qaf.automation.ui.annotations.UiElement;

public class RegistrationFormBean extends BaseDataBean {
	
	@UiElement(fieldLoc = "form.registration.register.first_name")
	public String first_name;
	@UiElement(fieldLoc = "form.registration.register.last_name")
	public String last_name;
	@UiElement(fieldLoc = "form.registration.register.phone")
	public String phone_no;
	@UiElement(fieldLoc = "form.registration.register.email")
	public String email;
	@UiElement(fieldLoc = "form.registration.register.address")
	public String address;
	@UiElement(fieldLoc = "form.registration.register.city")
	public String city;
	@UiElement(fieldLoc = "form.registration.register.state")
	public String state;
	@UiElement(fieldLoc = "form.registration.register.postalcode")
	public String postal_code;
	@UiElement(fieldLoc = "form.registration.register.country")
	public String country;
	@UiElement(fieldLoc = "form.registration.register.user_name")
	public String user_name;
	@UiElement(fieldLoc = "form.registration.register.password")
	public String pwd;
	@UiElement(fieldLoc = "form.registration.register.conform_pwd")
	public String conform_pwd;
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public String getCountry() {
		return country;
	}
	public String getUser_name() {
		return user_name;
	}
	public String getPwd() {
		return pwd;
	}
	public String getConform_pwd() {
		return conform_pwd;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setConform_pwd(String conform_pwd) {
		this.conform_pwd = conform_pwd;
	}
	
	
	
	
	

}
