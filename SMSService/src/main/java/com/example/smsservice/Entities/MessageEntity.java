package com.example.smsservice.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="message")
public class MessageEntity {

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MessageEntity() {
		// TODO Auto-generated constructor stub
	}
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
	@Column(unique = true)
	public String mobile;
	public String message;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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


	public String status;
	
	
}
