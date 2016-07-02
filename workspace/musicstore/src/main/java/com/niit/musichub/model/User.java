package com.niit.musichub.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	private String userID;
	private String user_FirstName;
	private String user_MiddleName;
	private String user_LastName;
	private String userName;
	private String address;
	private String phone_number;
	private String email_id;

	@Id
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUser_FirstName() {
		return user_FirstName;
	}

	public void setUser_FirstName(String user_FirstName) {
		this.user_FirstName = user_FirstName;
	}

	public String getUser_MiddleName() {
		return user_MiddleName;
	}

	public void setUser_MiddleName(String user_MiddleName) {
		this.user_MiddleName = user_MiddleName;
	}

	public String getUser_LastName() {
		return user_LastName;
	}

	public void setUser_LastName(String user_LastName) {
		this.user_LastName = user_LastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

}
