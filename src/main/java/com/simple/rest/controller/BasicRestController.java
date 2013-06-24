package com.simple.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.simple.dto.ResponseDTO;

@Controller
@RequestMapping("/simple")
public class BasicRestController {

	@RequestMapping(value = "/{id}", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody ResponseDTO postMethod(@PathVariable("id") String id){
		
		System.out.println(id);
	    return new ResponseDTO(12345);
		
	}
	
	@RequestMapping(value="/status", method=RequestMethod.GET)
	public @ResponseBody String getStatus(){
		return "status";
	}
	
}
