package com.homedepot.mains;

import com.homedepot.entities.ProductEntity;
import com.homedepot.repositories.ProductRepository;

public class MainApp {

	public static void main(String[] args) {
		ProductEntity product = new ProductEntity();
		product.setModel("8jf8");
		product.setDescription("very thin but stron");
		product.setPrice(300);
		
		ProductRepository prodrepo = new ProductRepository();
		prodrepo.save(product);
	}

}
