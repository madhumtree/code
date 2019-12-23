package com.example.smsservice.ServiceImpl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smsservice.DTO.Status;
import com.example.smsservice.DoaImpl.MessageDoaImpl;
import com.example.smsservice.Entities.MessageEntity;

@Service
public class SmsService {

	@Autowired
	MessageDoaImpl messagedoaimpl;
	
	public String persistAndSendMsg(HashMap<String, String> cc) {
		// TODO Auto-generated method stub
		MessageEntity msgentity=new MessageEntity();
		msgentity.setMessage(cc.get("message"));
		msgentity.setMobile(cc.get("mobile"));
		msgentity.setStatus(cc.get("status"));
		
		return messagedoaimpl.persistMessage(msgentity);
	}

	public Status getStatus(String mobile) {
		
		return messagedoaimpl.getMessage(mobile);

		// TODO Auto-generated method stub
		
	}

}
