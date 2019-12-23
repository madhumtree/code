package com.example.smsservice.DTO;

import java.io.Serializable;

public class Status implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String message;
public Status(String message, String status, String mobile) {
	super();
	this.message = message;
	this.status = status;
	this.mobile = mobile;
}
public Status() {
	// TODO Auto-generated constructor stub
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
String status;
String mobile;
}
