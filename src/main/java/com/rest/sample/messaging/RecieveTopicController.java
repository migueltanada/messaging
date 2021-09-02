package com.rest.sample.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class RecieveTopicController {


    // private static final String TOPIC_NAME = "topic";

    // private static final String SUBSCRIPTION_NAME_AUDIT = "audit";

    // private static final String SUBSCRIPTION_NAME_CHARGE="charge";

    // private final Logger logger = LoggerFactory.getLogger(RecieveTopicController.class);

    // @JmsListener(destination = TOPIC_NAME, containerFactory = "topicJmsListenerContainerFactory",
    //      subscription = SUBSCRIPTION_NAME_AUDIT)
    // public void topicRecieve1(Message message) {

    //         logger.info("Audit Service Received message: {}", message.getMessage());
    //         //DO SOMETHING HERE

    // }

    // @JmsListener(destination = TOPIC_NAME, containerFactory = "topicJmsListenerContainerFactory",
    // subscription = SUBSCRIPTION_NAME_CHARGE)
    // public void topicRecieve2(Message message) {

    //    logger.info("Charge Service Received message: {}", message.getMessage());
    //     //DO SOMETHING HERE
    // }
    
}
