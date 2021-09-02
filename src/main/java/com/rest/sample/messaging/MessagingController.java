package com.rest.sample.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingController {

    private static final Logger logger = LoggerFactory.getLogger(MessagingController.class);

    private static final String QUEUE_NAME = "queue";
    private static final String TOPIC_NAME = "topic";

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/messages/queue")
    public Message postQueue(@RequestBody Message message) throws Exception {

        // logger.info(String.format("Sending message: \"%s\" to queue: \"queue\"]", message.getMessage()));

        jmsTemplate.convertAndSend(QUEUE_NAME, message.getMessage());  

        return message;
    }

    @PostMapping("/messages/topic")
    public Message postTopic(@RequestBody Message message) throws Exception {

        logger.info(String.format("Sending message: \"%s\" to queue: \"topic\"]", message.getMessage()));

        jmsTemplate.convertAndSend(TOPIC_NAME, message.getMessage());  

        return message;
    }



}