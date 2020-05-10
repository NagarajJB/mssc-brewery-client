package com.njb.msscbreweryclient.web.client;

import java.util.UUID;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.njb.msscbreweryclient.web.model.BeerDto;

@Component
@ConfigurationProperties("sfg.brewery")
public class BreweryClient {

	public final String BEER_PATH_V1 = "/api/v1/beer/";

	private String apiHost;

	private final RestTemplate restTempalte;

	public BreweryClient(RestTemplateBuilder restTemplateBuilder) {
		this.restTempalte = restTemplateBuilder.build();
	}

	public BeerDto getBeerById(UUID id) {
		System.out.println(apiHost + BEER_PATH_V1 + id.toString());
		return restTempalte.getForObject(apiHost + BEER_PATH_V1 + id.toString(), BeerDto.class);
	}

	public void setApiHost(String apiHost) {
		this.apiHost = apiHost;
	}

}
