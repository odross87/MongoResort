package com.sanguino.myresort.repositories;

import com.sanguino.myresort.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository  extends MongoRepository<Restaurant, String> {
}
