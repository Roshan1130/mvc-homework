package com.restApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restApi.dtos.GuitarDto;

@RestController
@RequestMapping("/guitars")
public class GuitarController {
	
	@GetMapping("")
	public String forParam(@RequestParam Integer id) {
		System.out.println(id);
		String p = "Parameter: " +id+" entered";
		return p;
	}
	
	@GetMapping(value="{id}")
	public String forPath(@PathVariable String id) {
		String p ="Path Variable: "+id+" entered";
		return p;
	}
	
	@PostMapping("")
	public void forPost(@RequestBody GuitarDto gd) {
		System.out.println(gd.toString());
		
	}
	
	

}
