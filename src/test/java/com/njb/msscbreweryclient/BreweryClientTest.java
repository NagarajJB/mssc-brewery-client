package com.njb.msscbreweryclient;

import java.util.UUID;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.njb.msscbreweryclient.web.client.BreweryClient;
import com.njb.msscbreweryclient.web.model.BeerDto;

@SpringBootTest
class BreweryClientTest {

	@Autowired
	BreweryClient client;

	@Test
	void testGetBeerById() {

		BeerDto beerDto = client.getBeerById(UUID.randomUUID());
		assertNotNull(beerDto);
	}

}
