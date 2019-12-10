package com.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table ( name = "guitars")
public class GuitarEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int guiatarID;
	
	@Column (name="name")
	private String name;
	
	@Column (name="model")
	private String model;
	
	@Column (name="price")
	private int price;
	
	@Column (name="body")
	private String body;

	public int getGuiatarID() {
		return guiatarID;
	}

	public void setGuiatarID(int guiatarID) {
		this.guiatarID = guiatarID;
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
 
	


}
