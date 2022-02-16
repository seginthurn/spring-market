package br.com.inthurn.springmarket.model.transport;

import br.com.inthurn.springmarket.model.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private String name;
    private String description;
    private Double price;
    private List<CategoryDTO> categoryDTOList;

    private ProductEntity convertDTOToEntity(){
        return new ProductEntity(this.name, this.description, this.price, new ArrayList<>());
    }

}

