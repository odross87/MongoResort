package com.sanguino.myresort.model;

import lombok.*;
import org.bson.types.Binary;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document("hotelImage")
public class HotelImage {
        @Id
        private String id;
        private String name;
        private Binary image;

}

