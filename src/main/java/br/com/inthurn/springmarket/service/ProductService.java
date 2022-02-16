package br.com.inthurn.springmarket.service;

import br.com.inthurn.springmarket.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Boolean save(){

        return true;
    }
}
