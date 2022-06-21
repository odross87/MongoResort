package com.sanguino.myresort;

import com.sanguino.myresort.model.Hotel;
import com.sanguino.myresort.model.Restaurant;
import com.sanguino.myresort.repositories.RestaurantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.sanguino.myresort.repositories.HotelRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MyresortApplicationTests {

	@Autowired
	HotelRepository hotelRepository;

	@Autowired
	RestaurantRepository restaurantRepository;



	@Test
	void createNewHotels(){
		Hotel hotel1 = new Hotel("Santa Fe", "**", 1992, 1000,0);
		Hotel hotel2 = new Hotel("Cheyenne", "**", 1992, 1000, 0);
		Hotel hotel3= new Hotel("Sequoia Lodge", "***", 1992 , 1011, 1);

		Restaurant r1 = new Restaurant("Hunter's Grill", "€€", hotel3);
		Restaurant r2 = new Restaurant( "Beaver Creek Tavern", "€€", hotel3);
		Restaurant r3 = new Restaurant( "Chuck Wagon Cafe", "€€", hotel2);
		Restaurant r4 = new Restaurant( "La Cantina", "€€", hotel1);




		hotelRepository.save(hotel1);
		hotelRepository.save(hotel2);
		hotelRepository.save(hotel3);

		restaurantRepository.save(r1);
		restaurantRepository.save(r2);
		restaurantRepository.save(r3);
		restaurantRepository.save(r4);



	}

}
