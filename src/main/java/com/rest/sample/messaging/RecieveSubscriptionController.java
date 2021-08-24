package com.rest.sample.messaging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class RecieveSubscriptionController {
    

    private static final String QUEUE_NAME = "queue";

    private final Logger logger = LoggerFactory.getLogger(RecieveSubscriptionController.class);

    @JmsListener(destination = QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
    public void queueRecieve1(Message message) {


        logger.info("Queue Instance 1 Received message : {}", message.getMessage());

        //do stuff here
    }

    @JmsListener(destination = QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
    public void queueRecieve2(Message message) {


        logger.info("Queue Instance 2 Received message: {}", message.getMessage());

        //do stuff here
    }


    @JmsListener(destination = QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
    public void queueRecieve3(Message message) {


        logger.info("Queue Instnace 3 Received message: {}", message.getMessage());

        //do stuff here
    }
}

