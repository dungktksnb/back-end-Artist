package com.example.artists.controllers;

import com.example.artists.dto.response.Response;
import com.example.artists.model.Product;
import com.example.artists.service.product.IProductServices;
import com.example.artists.service.product.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private  IProductServices iProductServices;
    @GetMapping
    public ResponseEntity<Iterable<Product>> getProduct(){
        List<Product>productList= (List<Product>) iProductServices.findAll();
        if(productList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList,HttpStatus.OK);


    }


}
