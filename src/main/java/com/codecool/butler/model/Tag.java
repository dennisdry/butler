package com.codecool.butler.model;

import javax.persistence.*;


/**
 * Created by petya on 2017.06.21..
 */
@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    public Tag(){}

    public Tag(String name) {this.name = name;}
}