package com.varflober.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.varflober.model.Country;
import com.varflober.service.CountryService;

@Controller
public class CountryController {

	@Autowired
	CountryService repository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getCountries(HttpSession session) {
		List<Country> countries = repository.getCountries(); 
		session.setAttribute("countries", countries);
		return "index.jsp";
	}
	
}
