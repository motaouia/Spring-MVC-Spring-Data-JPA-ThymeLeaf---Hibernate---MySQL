package org.motaouia.demo.services;

import java.util.List;

import org.motaouia.demo.models.Product;

public interface IProductService {
	
	public List<Product> listAll();
	public void save(Product product);
	public Product get(long id);
	public void delete(long id);

}
