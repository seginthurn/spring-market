package br.com.inthurn.springmarket.repository;

import br.com.inthurn.springmarket.model.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}
