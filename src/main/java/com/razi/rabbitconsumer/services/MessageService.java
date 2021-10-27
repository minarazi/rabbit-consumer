package com.razi.rabbitconsumer.services;

import com.razi.rabbitconsumer.model.Message;

public interface MessageService {

    void saveMassage(Message message);
}
