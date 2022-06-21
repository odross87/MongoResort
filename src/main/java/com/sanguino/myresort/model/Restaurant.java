package com.sanguino.myresort.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document("restaurants")
public class Restaurant {

    @Id
    private String hotelId;

    private String name;

    private String price;

    private Hotel location;

    public Restaurant(String name, String price, Hotel hotel) {
        this.name = name;
        this.price = price;
        this.location = hotel;
    }
}
