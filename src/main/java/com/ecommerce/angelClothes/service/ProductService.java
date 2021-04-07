package com.ecommerce.angelClothes.service;

import com.ecommerce.angelClothes.model.AngelClothesResponse;
import com.ecommerce.angelClothes.model.Product;
import com.ecommerce.angelClothes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product get(Product request){
        return repository.findById(request.getId()).orElse(new Product());
    }
    public Product put(Product request){
        return repository.save(request);
    }
}
