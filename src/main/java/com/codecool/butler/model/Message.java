package com.codecool.butler.model;

import javax.persistence.*;

@Entity(name = "butler_message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String message;

    @ManyToOne
    private MessageType messageType;

    public Message(){}

    public Message(String name, MessageType messageType) {
        this.message = name;
        this.messageType = messageType;
    }

    public String getName() {
        return message;
    }

    public void setName(String name) {
        this.message = name;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}
