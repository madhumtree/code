package com.example.smsservice.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.smsservice.DTO.ResponseDto;
import com.example.smsservice.DTO.Status;
import com.example.smsservice.ServiceImpl.SmsService;

@RestController
public class SMSController {

	@Autowired
   SmsService smsservice;
	
	@RequestMapping("/sms/message")
	@ResponseBody
	public ResponseEntity<?> sendsms(@RequestBody HashMap<String,String> greetingMsg ){
		
		String msg= smsservice.persistAndSendMsg(greetingMsg);	
		ResponseDto dtoObj=new ResponseDto(msg,"success","200");

	return new ResponseEntity<>(dtoObj,HttpStatus.OK);
	}
	
	@RequestMapping("/sms/status")
	public ResponseEntity<?> getstatus(@RequestParam String mobile ){
		
		Status status=smsservice.getStatus(mobile);	
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
}
