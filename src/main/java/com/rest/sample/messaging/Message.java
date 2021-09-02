package com.rest.sample.messaging;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Message  implements Serializable{


    private String message;
    
    // private String queue;

    public Message() {
    }

    public Message(String message){ //, String queue) {
        this.message = message;
        // this.queue = queue;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    // public String getQueue(){
    //     return queue;
    // }

    // public void setQueue(String queue){
    //     this.queue = queue;

    // }

}