package com.example.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.entity.Product;
import com.example.proxy.ProductServiceProxy;

@Component
public class ProductServiceFallback implements ProductServiceProxy {

	@Override
	public List<Product> getAllProducts() {
		return new ArrayList<Product>();
		
	}

	@Override
	public Product getProductById(Integer id) {
		return new Product("IFB", 34343.0);
		
	}

}
