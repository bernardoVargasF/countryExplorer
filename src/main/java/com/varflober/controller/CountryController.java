package com.varflober.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView getCountries() {
//		ModelAndView model = new ModelAndView("index");
//		List<Country> countries = repository.getCountries(); 
//		model.addObject("countries", countries);
//		return model;
//	}
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView getCountryFlag(@PathVariable("countryCode") String countryCode) {
//		ModelAndView model = new ModelAndView("index");
//		String flagUrl = repository.getCountryFlag(countryCode); 
//		model.addObject("flagUrl", flagUrl);
//		return model;
//	}

}
