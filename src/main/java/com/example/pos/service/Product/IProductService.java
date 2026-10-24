package com.example.pos.service.Product;

import com.example.pos.dto.ProductResponse;
import com.example.pos.network.ResponseDataPack;

public interface IProductService {

    ResponseDataPack<ProductResponse> createProduct(ProductResponse request);

    ResponseDataPack<ProductResponse> findProduct(Long id);
}
