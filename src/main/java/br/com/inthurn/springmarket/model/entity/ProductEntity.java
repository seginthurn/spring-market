package br.com.inthurn.springmarket.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Double price;

    @OneToMany
    private List<CategoryEntity> categoryEntity;


    public ProductEntity(Integer id, String name, String description, Double price, List<CategoryEntity> categoryEntity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryEntity = categoryEntity;
    }

    public ProductEntity() {
    }

    public ProductEntity(String name, String description, Double price, List<CategoryEntity> categoryEntity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryEntity = categoryEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<CategoryEntity> getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(List<CategoryEntity> categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
