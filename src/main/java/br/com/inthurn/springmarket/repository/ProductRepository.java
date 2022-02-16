package br.com.inthurn.springmarket.repository;

import br.com.inthurn.springmarket.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
