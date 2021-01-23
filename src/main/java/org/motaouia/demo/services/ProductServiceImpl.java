package org.motaouia.demo.services;

import java.util.List;

import org.motaouia.demo.models.Product;
import org.motaouia.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements IProductService{

	@Autowired
	private ProductRepository productRepository;
	@Override
	public List<Product> listAll() {
		return productRepository.findAll();
	}

	@Override
	public void save(Product product) {
		productRepository.save(product);
	}

	@Override
	public Product get(long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public void delete(long id) {
		productRepository.delete(get(id));
		
	}

}
