package com.homedepot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="desk")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deskId;
	
	@Column (name="deskModel")
	private String model;
	

	@Column (name="deskDescription")
	private String description;
	

	@Column (name="deskPrice")
	private Integer price;


	public Integer getDeskId() {
		return deskId;
	}


	public void setDeskId(Integer deskId) {
		this.deskId = deskId;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "DeskEntity [deskId=" + deskId + ", model=" + model + ", description=" + description + ", price=" + price
				+ "]";
	}
	
	
	
	
}
