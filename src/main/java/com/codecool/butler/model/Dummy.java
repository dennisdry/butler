package com.codecool.butler.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;


/**
 * Dummy class responsible for populating a database with dummy datas for test purposes.
 */
public class Dummy {

    private static final Logger logger = LoggerFactory.getLogger(Dummy.class);


    public static void main(String[] args) {
        populateDBWithDummies();
    }

    /**
     * This method instantiate every dummy object then persist them too through a transaction.
     */
    public static void populateDBWithDummies(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("butlerPU");
        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();

        logger.info("EntityManagerFactory found persistance unit successfully!");


        List<String> phone1 = new ArrayList<>();
        phone1.add("11232323232");
        phone1.add("12332323232");
        phone1.add("13423232322");

        List<String> phone2 = new ArrayList<>();
        phone2.add("11232323232");
        phone2.add("12332323232");
        phone2.add("13423232322");

        List<String> phone3 = new ArrayList<>();
        phone3.add("11232323232");
        phone3.add("12332323232");
        phone3.add("13423232322");

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

        logger.info("Dummy contacts created successfully!");

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

        List<Tag> taglist1 = new ArrayList<>();
        taglist1.add(tag1);
        taglist1.add(tag2);
        taglist1.add(tag3);

        List<Tag> taglist2 = new ArrayList<>();
        taglist1.add(tag4);
        taglist1.add(tag5);
        taglist1.add(tag6);
        taglist1.add(tag7);

        logger.info("Dummy tags(example: {}) with their types created successfully!", tag1.getName());


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

        message1.addTag(tag1);
        message1.addTag(tag2);
        message1.addTag(tag3);
        message2.addTag(tag2);
        message2.addTag(tag3);
        message2.addTag(tag4);
        message3.addTag(tag5);
        message3.addTag(tag6);

        List<Message> messageList1 = new ArrayList<>();
        messageList1.add(message1);
        messageList1.add(message2);
        messageList1.add(message3);

        logger.info("Dummy messages(example: '{}') created successfully!", message1.getMessage());


        Item laptop = new Item("laptop");
        Item desk = new Item("desk");
        Item pen = new Item("pen");

        StockType stockType1 = new StockType("stockType1");
        StockType stockType2 = new StockType("stockType2");
        StockType stockType3 = new StockType("stockType3");

        Stock stock1 = new Stock(laptop,2);
        Stock stock2 = new Stock(desk,1);
        Stock stock3 = new Stock(pen,5);

        Stock stock4 = new Stock(laptop,1);
        Stock stock5 = new Stock(desk,1);
        Stock stock6 = new Stock(pen,3);

        Stock stock7 = new Stock(laptop,1);
        Stock stock8 = new Stock(desk,2);
        Stock stock9 = new Stock(pen,6);

        stock1.setStockType(stockType1);
        stock2.setStockType(stockType2);
        stock3.setStockType(stockType3);
        stock4.setStockType(stockType1);
        stock5.setStockType(stockType2);
        stock6.setStockType(stockType3);
        stock7.setStockType(stockType1);
        stock8.setStockType(stockType2);
        stock9.setStockType(stockType3);

        List<Stock> inventory1 = new ArrayList<>();
            inventory1.add(stock4);
            inventory1.add(stock5);
            inventory1.add(stock6);

        List<Stock> inventory2 = new ArrayList<>();
            inventory1.add(stock7);
            inventory1.add(stock8);
            inventory1.add(stock9);

        List<Stock> inventory3 = new ArrayList<>();
            inventory1.add(stock1);
            inventory1.add(stock2);
            inventory1.add(stock3);

        laptop.setTags(taglist1);
        desk.setTags(taglist2);
        pen.setTags(taglist1);

        List<Item> inventory = new ArrayList<>();
        inventory.add(laptop);
        inventory.add(desk);
        inventory.add(pen);

        logger.info("Dummy items(example: {}:{}) with stocks created successfully!", stock1.getItem().getName(), stock1.getStock());

        User user1 = new User("Peter", "Magpie", "petya", phone1,email1);
        User user2 = new User("Dénes", "Dry", "dry", phone2,email2);
        User user3 = new User("Thomas", "Varga", "anarch", phone3,email3);
        User user4 = new User("Eszter", "Lukacs", "pengefutar", phone1,email2);

        user1.addMessage(message1);
        user1.addMessage(message2);
        user2.addMessage(message3);
        user2.addMessage(message4);
        user3.addMessage(message5);
        user3.addMessage(message6);
        user4.addMessage(message7);

        user1.setInventory(inventory1);
        user2.setInventory(inventory2);
        user3.setInventory(inventory3);

        user1.addTag(tag1);
        user1.addTag(tag2);
        user2.addTag(tag2);
        user2.addTag(tag3);
        user2.addTag(tag4);
        user3.setTags(taglist1);
        user4.setTags(taglist2);

        logger.info("Dummy users({},{},{},{}) with stocks created successfully!", user1.getFirstName(), user2.getFirstName(),user3.getFirstName(),user4.getFirstName());

        //Persisting all data

        transaction.begin();
        em.persist(user1);
        em.persist(user2);
        em.persist(user3);
        em.persist(user4);
        transaction.commit();

        logger.info("And after all, persists only the four user and fill 16 table. So incredible!!");

    }
}

