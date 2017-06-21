package com.codecool.butler.model;

import javax.persistence.*;

/**
 * Created by petya on 2017.06.21..
 */
@Entity(name = "butler_message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToOne
    private MessageType messageType;

    public Message(){}

    public Message(String name) {this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}
