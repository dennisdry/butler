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


    public User(){}

    public User(String firstName,String lastName,String userName,List<String> phone, List<String> email){

        this.firstName = firstName;
        this.lastName = lastName;
        this.userName =  userName;
        this.phone = phone;
        this.email = email;

    }
}
