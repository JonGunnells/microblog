package com.theironyard;

import javax.persistence.*;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String text;

    public Message(int id, String text) {
        this.id = id;
        this.text = text;
    }
}
