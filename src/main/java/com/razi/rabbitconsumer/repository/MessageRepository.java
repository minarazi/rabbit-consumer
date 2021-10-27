package com.razi.rabbitconsumer.repository;

import com.razi.rabbitconsumer.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long>  {

}
