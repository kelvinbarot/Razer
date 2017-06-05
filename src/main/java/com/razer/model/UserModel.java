package com.razer.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "user")
public class UserModel {

	@Id
	@GeneratedValue
	@Column(name = "id")
	int user_id;
	@Column(name = "firstname")
	String user_firstname;
	@Column(name = "lastname")
	String user_lastname;

	@Column(name = "username", unique = true)
	String userName;

	@Column(name = "email_id")
	String user_emailid;

	@Transient
	@Column(name = "password")
	String user_password;

	@Transient
	String user_confirmpassword;
	@Column(name = "contact_no")
	String user_contact;

	@Column(name = "address")
	String user_address;

	@Column(name = "city")
	String user_city;

	@Column(name = "pincode")
	String user_pincode;

	@Column(name = "state")
	String user_state;

	@Column(name = "gender")
	String user_gender;

	@Column(name = "date_of_birth")
	Date user_dob;

	@Transient
	String user_acceptprivacy;
	
	
	

	public UserModel() {
		
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_firstname() {
		return user_firstname;
	}

	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}

	public String getUser_lastname() {
		return user_lastname;
	}

	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUser_emailid() {
		return user_emailid;
	}

	public void setUser_emailid(String user_emailid) {
		this.user_emailid = user_emailid;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_confirmpassword() {
		return user_confirmpassword;
	}

	public void setUser_confirmpassword(String user_confirmpassword) {
		this.user_confirmpassword = user_confirmpassword;
	}

	public String getUser_contact() {
		return user_contact;
	}

	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_city() {
		return user_city;
	}

	public void setUser_city(String user_city) {
		this.user_city = user_city;
	}

	public String getUser_pincode() {
		return user_pincode;
	}

	public void setUser_pincode(String user_pincode) {
		this.user_pincode = user_pincode;
	}

	public String getUser_state() {
		return user_state;
	}

	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public Date getUser_dob() {
		return user_dob;
	}

	public void setUser_dob(Date user_dob) {
		this.user_dob = user_dob;
	}

	public String getUser_acceptprivacy() {
		return user_acceptprivacy;
	}

	public void setUser_acceptprivacy(String user_acceptprivacy) {
		this.user_acceptprivacy = user_acceptprivacy;
	}

	
	
}
