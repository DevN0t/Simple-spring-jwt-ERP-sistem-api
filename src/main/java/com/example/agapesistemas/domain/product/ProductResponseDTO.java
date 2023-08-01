package com.example.agapesistemas.domain.product;

public record ProductResponseDTO(Long id, String name) {
    public ProductResponseDTO(Product product){
        this(product.getId(), product.getName());
    }

}
