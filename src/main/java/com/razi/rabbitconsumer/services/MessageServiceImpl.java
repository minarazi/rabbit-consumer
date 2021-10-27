package com.razi.rabbitconsumer.services;

import com.razi.rabbitconsumer.model.Message;
import com.razi.rabbitconsumer.repository.MessageRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Log4j2
@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    @Transactional
    public void saveMassage(Message message) {
        messageRepository.save(message);
        log.info("message saved!!!!!");
    }
}
