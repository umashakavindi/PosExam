package com.example.pos.service.Product;

import com.example.pos.dto.ProductResponse;
import com.example.pos.network.ResponseDataPack;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{
    @Override
    public ResponseDataPack<ProductResponse> createProduct(ProductResponse request) {
        return null;
    }

    @Override
    public ResponseDataPack<ProductResponse> findProduct(Long id) {
        return null;
    }
}
