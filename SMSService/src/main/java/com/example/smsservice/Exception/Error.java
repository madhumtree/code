package com.example.smsservice.Exception;

public class Error {
String message;
String status;
String statusCode;
public Error(String message, String status, String statusCode) {
	super();
	this.message = message;
	this.status = status;
	this.statusCode = statusCode;
}
	
}
