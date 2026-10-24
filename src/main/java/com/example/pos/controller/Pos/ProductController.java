package com.example.pos.controller.Pos;

import com.example.pos.dto.ProductResponse;
import com.example.pos.network.ApiResponseWrapper;
import com.example.pos.network.NetworkUtils;
import com.example.pos.service.Product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ProductController implements IProductController{

    @Autowired
    private IProductService productService;

    @Override
    public ResponseEntity<ApiResponseWrapper<List<ProductResponse>>> createProduct(ProductResponse request) {
        return NetworkUtils.wrap(productService.createProduct(request));
    }

    @Override
    public ResponseEntity<ApiResponseWrapper<List<ProductResponse>>> findProduct(Long id) {
        return NetworkUtils.wrap(productService.findProduct(id));
    }
}
