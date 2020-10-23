package com.varflober.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.varflober.model.Country;

@Component
public class CountryService {
	
	public List<Country> getCountries() {
		List<Country> countries = new ArrayList<>();

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://rapidapi.p.rapidapi.com/all"))
				.header("x-rapidapi-host", "restcountries-v1.p.rapidapi.com")
				.header("x-rapidapi-key", "4d5dc2c681mshdf9ab6d8dc3b9f2p152b8ajsn69363d887e17")
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			countries = Arrays.asList(mapper.readValue(response.body(), Country[].class));
			System.out.println("Retrieved: " + Arrays.toString(countries.toArray()));
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return countries;
	}
	
	public String getCountryFlag(String countryCode) {
		return "https://www.countryflags.io/" + countryCode + "/shiny/64.png";
	}

}
