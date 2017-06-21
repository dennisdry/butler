package com.codecool.butler.model;

import org.eclipse.persistence.annotations.CompositeMember;

import javax.persistence.*;
import java.util.List;

/**
 * Created by petya on 2017.06.21..
 */

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int stock;

    @OneToMany
    private List<Tag> tags;

    @ManyToOne
    private User user;


}
