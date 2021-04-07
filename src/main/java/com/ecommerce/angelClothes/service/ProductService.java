package com.ecommerce.angelClothes.service;

import com.ecommerce.angelClothes.model.AngelClothesResponse;
import com.ecommerce.angelClothes.model.DefaultResponse;
import com.ecommerce.angelClothes.model.Product;
import com.ecommerce.angelClothes.repository.ProductRepository;
import org.hibernate.JDBCException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public AngelClothesResponse get(Product request){

        DefaultResponse response = new DefaultResponse();
        Product product = null;

        try{
            product = repository.findById(request.getId()).orElse(null);
            response.setProduct(product);
            response.setResponseCode(200);
            response.setDescription("Success");

            if(product==null) {
                response.setResponseCode(400);
                response.setDescription("Product doesn't exist");
            }

        }catch (Exception message){
            response.setResponseCode(500);
            response.setDescription("DataBase Error");
        }
        return product;

    }
    public AngelClothesResponse put(Product request){

        DefaultResponse response = new DefaultResponse();
        Product product = null;
        try {
            product = repository.save(request);
            response.setProduct(product);
            response.setResponseCode(200);
            response.setDescription("Product saved with success");
        }catch (ConstraintViolationException e){
            response.setResponseCode(e.getErrorCode());
            response.setDescription(e.getMessage());
        }
        return response;
    }
    public AngelClothesResponse findAllProduct(){
        DefaultResponse response = new DefaultResponse();
        try {
            List<Product> productList = repository.findAll();
            response.setProductList(productList);
            response.setResponseCode(200);
            response.setDescription("success");

            if(response.getProductList().isEmpty()){
                response.setResponseCode(400);
                response.setDescription("The list of products is empty");
            }
        }catch (JDBCException e){
            response.setResponseCode(e.getErrorCode());
            response.setDescription(e.getMessage());
        }catch (Exception e){
            response.setResponseCode(500);
            response.setDescription(e.getMessage());
        }
        return response;
    }
}
