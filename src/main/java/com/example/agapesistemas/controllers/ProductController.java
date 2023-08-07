package com.example.agapesistemas.controllers;

import com.example.agapesistemas.domain.product.Product;
import com.example.agapesistemas.domain.product.ProductRepository;
import com.example.agapesistemas.domain.product.ProductRequestDTO;
import com.example.agapesistemas.domain.product.ProductResponseDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @CrossOrigin(maxAge = 10, allowedHeaders = "*",origins = "http://localhost:5173")
    @PostMapping("/cadastro")
    public ResponseEntity postProduct(@RequestBody @Valid ProductRequestDTO data){
        Product newProduct = new Product(data);

        this.productRepository.save(newProduct);
        return ResponseEntity.ok().build();
    }

    @CrossOrigin(maxAge = 10, allowedHeaders = "*",origins = "http://localhost:5173")
    @GetMapping("/visualize")
    public ResponseEntity getAllProducts(){
        List<ProductResponseDTO> productList = this.productRepository.findAll().stream().map(ProductResponseDTO::new).toList();

        return ResponseEntity.ok(productList);
    }

}
