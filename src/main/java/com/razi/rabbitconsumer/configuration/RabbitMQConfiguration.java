package com.razi.rabbitconsumer.configuration;

import com.razi.rabbitconsumer.stream.ConsumerMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

    @Bean
    public ConsumerMessage consumerMessage() {
        return new ConsumerMessage();
    }
}
