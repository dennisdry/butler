package com.codecool.butler.model;

import javax.jws.soap.SOAPBinding;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by petya on 2017.06.22..
 */
public class Dummy {

    public static void main(String[] args) {
        populateDBWithDummies();
    }

    public static void populateDBWithDummies(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("butlerPU");
        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();


        List<String> phone1 = new ArrayList<>();
        phone1.add("11232323232");
        phone1.add("12332323232");
        phone1.add("13423232322");

        List<String> phone2 = new ArrayList<>();
        phone2.add("11232323232");
        phone2.add("12332323232");
        phone2.add("13423232322");

        List<String> phone3 = new ArrayList<>();
        phone1.add("11232323232");
        phone1.add("12332323232");
        phone1.add("13423232322");

        List<String> email1 = new ArrayList<>();
        email1.add("dummy11@gmail.com");
        email1.add("dummy12@gmail.com");
        email1.add("dummy13@gmail.com");

        List<String> email2 = new ArrayList<>();
        email2.add("dummy21@gmail.com");
        email2.add("dummy22@gmail.com");
        email2.add("dummy23@gmail.com");

        List<String> email3 = new ArrayList<>();
        email3.add("dummy31@gmail.com");
        email3.add("dummy32@gmail.com");
        email3.add("dummy33@gmail.com");

        TagType tagType1 =  new TagType("tagType1");
        TagType tagType2 =  new TagType("tagType2");
        TagType tagType3 =  new TagType("tagType3");
        TagType tagType4 =  new TagType("tagType4");
        TagType tagType5 =  new TagType("tagType5");

        Tag tag1 = new Tag("tag1",tagType1);
        Tag tag2 = new Tag("tag2",tagType2);
        Tag tag3 = new Tag("tag3",tagType3);
        Tag tag4 = new Tag("tag4",tagType4);
        Tag tag5 = new Tag("tag5",tagType5);

        //repeated tagtype
        Tag tag6 = new Tag("tag6", tagType1);
        Tag tag7 = new Tag("tag7", tagType2);

        MessageType messageType1 = new MessageType("messageType1");
        MessageType messageType2 = new MessageType("messageType2");
        MessageType messageType3 = new MessageType("messageType3");
        MessageType messageType4 = new MessageType("messageType4");
        MessageType messageType5 = new MessageType("messageType5");

        Message message1 = new Message("Hi! This is dummy message1.", messageType1);
        Message message2 = new Message("Hi! This is dummy message2.", messageType2);
        Message message3 = new Message("Hi! This is dummy message3.", messageType3);
        Message message4 = new Message("Hi! This is dummy message4.", messageType4);
        Message message5 = new Message("Hi! This is dummy message5.", messageType5);

        //repeated messageType
        Message message6 = new Message("Hi! This is dummy message6.", messageType1);
        Message message7 = new Message("Hi! This is dummy message7.", messageType2);

        List<Tag> taglist1 = new ArrayList<>();
        taglist1.add(tag1);
        taglist1.add(tag2);
        taglist1.add(tag3);

        List<Tag> taglist2 = new ArrayList<>();
        taglist1.add(tag4);
        taglist1.add(tag5);
        taglist1.add(tag6);
        taglist1.add(tag7);

        List<Message> messageList1 = new ArrayList<>();
        messageList1.add(message1);
        messageList1.add(message2);
        messageList1.add(message3);

        User user1 = new User("Peter", "Magpie", "petya", phone1,email1);
        User user2 = new User("Dénes", "Dry", "dry", phone2,email2);
        User user3 = new User("Thomas", "Varga", "anarch", phone3,email3);
        User user4 = new User("Eszter", "Lukacs", "pengefutar", phone1,email2);

        user1.setMessage(message1);
        user1.setMessage(message2);
        user2.setMessage(message3);
        user2.setMessage(message4);
        user3.setMessage(message5);
        user4.setMessage(message6);
        user4.setMessage(message7);

        em.persist(user1);
        em.persist(user2);
        em.persist(user3);
        em.persist(user4);
        em.persist(tagType1);
        em.persist(tagType2);
        em.persist(tagType3);
        em.persist(tagType4);
        em.persist(tagType5);
        em.persist(tag1);
        em.persist(tag2);
        em.persist(tag3);
        em.persist(tag4);
        em.persist(messageType1);
        em.persist(messageType2);
        em.persist(messageType3);
        em.persist(messageType4);
        em.persist(messageType5);
        em.persist(message1);
        em.persist(message2);
        em.persist(message3);
        em.persist(message4);
        em.persist(message5);
        em.persist(message6);
        em.persist(message7);
        transaction.commit();
    }
}

