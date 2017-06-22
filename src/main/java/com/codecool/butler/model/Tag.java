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

    @OneToOne
    private TagType tagType;

    public Tag(){}

    public Tag(String name) {this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TagType getTagType() {
        return tagType;
    }

    public void setTagType(TagType tagType) {
        this.tagType = tagType;
    }

    public long getId() {
        return id;
    }
}