package com.razi.rabbitconsumer.stream;

import com.razi.rabbitconsumer.model.Message;
import com.razi.rabbitconsumer.services.MessageService;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2
@RabbitListener(queues = "${rabbitmq.message.queue.name}")
public class ConsumerMessage {

    @Autowired
    MessageService messageService;

    @RabbitHandler
    public void receive(String inputMessage) {
        log.info("Received: '{}'", inputMessage);
        Message message = new Message();
        message.setMessage(inputMessage);
        messageService.saveMassage(message);
    }
}
