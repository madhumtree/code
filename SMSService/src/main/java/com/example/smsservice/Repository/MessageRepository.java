package com.example.smsservice.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.smsservice.DTO.Status;
import com.example.smsservice.Entities.MessageEntity;

public interface MessageRepository extends CrudRepository<MessageEntity,Long>{

	MessageEntity  findByMobile(String mobile);

	
}
