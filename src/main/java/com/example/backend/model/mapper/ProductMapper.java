package com.example.backend.model.mapper;

import com.example.backend.entity.Product;
import com.example.backend.model.dto.ProductDTO;

public class ProductMapper {
    public static ProductDTO productDTO (Product product) {
        ProductDTO tmp = new ProductDTO();
        tmp.setProdName(product.getProdName());
        tmp.setPrice(product.getPrice());
        tmp.setDescription(product.getDescription());
        tmp.setDateOfManf(product.getDateOfManf());
        return tmp;
    }
}
