package br.com.inthurn.springmarket.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {

//    @InjectMocks
    private ProductService productService;

    public ProductServiceTest(ProductService productService) {
        this.productService = productService;
    }

    @Test
    private void shouldReturnHTTPResponseOk(){

        assertEquals(false, productService.save());
    }

}
