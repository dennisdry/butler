package com.codecool.butler.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by petya on 2017.06.20..
 */
@Entity(name = "butleruser")
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

    @OneToMany
    private List<Item> items;


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

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
