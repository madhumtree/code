package com.example.smsservice.DoaImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.smsservice.DTO.Status;
import com.example.smsservice.Entities.MessageEntity;
import com.example.smsservice.Repository.MessageRepository;

@Repository
public class MessageDoaImpl {

	
	@Autowired
	MessageRepository messagerepository;
	
	public MessageDoaImpl() {
		// TODO Auto-generated constructor stub
	}

	public String  persistMessage(MessageEntity msgentity) {
		// TODO Auto-generated method stub
		messagerepository.save(msgentity);
		return "Data saved successfully";
	}

	public Status getMessage(String mobile) {
		// TODO Auto-generated method stub
		Status status=new 
				Status();
		MessageEntity ent= messagerepository.findByMobile(mobile);
		status.setMessage(ent.getMessage());
		status.setMobile(ent.getMobile());
		status.setStatus(ent.getStatus());
		return status;
	}
	
	

}
