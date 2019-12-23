package com.example.smsservice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler  {

	public GlobalExceptionHandler() {
		// TODO Auto-generated constructor stub
	}

	@ExceptionHandler(ApplicationException.class)
	public ResponseEntity<ApplicationException> appExceptionHandler(Throwable t){
		ApplicationException apperror=new ApplicationException();
		return  new ResponseEntity<>(apperror,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
