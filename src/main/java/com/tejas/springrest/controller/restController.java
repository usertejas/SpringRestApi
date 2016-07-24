package com.tejas.springrest.controller;

 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tejas.springrest.DTO.personDTO;

@RestController
@RequestMapping(value = "/media")
public class restController {
	
	@RequestMapping(value = "/default", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public personDTO Home(){
		personDTO person = new personDTO("Tejas", "Nutan");
		System.out.println(person);
		System.out.println("returning pbject");
		return person;
	}
	
	@RequestMapping(value = "/withparameter/{name}/{school}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public personDTO withparameter(@PathVariable("name") String name,@PathVariable("school") String school ){
		personDTO person = new personDTO(name, school);
		System.out.println(person);
		System.out.println("returning object gh");
		return person;
	}

}
