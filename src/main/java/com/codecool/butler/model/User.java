package com.codecool.butler.model;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "butleruser")
@NamedQueries({
        @NamedQuery(name="butleruser.getUserNames",
                query="Select userName FROM butleruser"),
        @NamedQuery(name="butleruser.getId",
                query="Select id FROM butleruser"),
        @NamedQuery(name="butleruser.getFirstName",
                query="Select firstName FROM butleruser")
})

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private String userName;

    @ElementCollection
    @CollectionTable
    private List<String> phone;

    @ElementCollection
    @CollectionTable
    private List<String> email;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Item> items = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Message> messages = new ArrayList<>();

    public User(){}

    public User(String firstName,String lastName,String userName,List<String> phone, List<String> email){

        this.firstName = firstName;
        this.lastName = lastName;
        this.userName =  userName;
        this.phone = phone;
        this.email = email;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phones) {
        this.phone = phones;
    }

    public void addPhone(String phone){this.phone.add(phone);}

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> emails) {
        this.email = emails;
    }

    public void addEmail(String email){ this.email.add(email);}

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){this.items.add(item);}

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {this.messages = messages;}

    public void addMessage(Message message) {this.messages.add(message);}
}
