package com.restApi.dtos;

import org.springframework.stereotype.Component;

@Component
public class GuitarDto {

	private String name;
	private String model;
	private String body;
	private int price;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "GuitarDto [name=" + name + ", model=" + model + ", body=" + body + ", price=" + price + "]";
	}
	
	
}
