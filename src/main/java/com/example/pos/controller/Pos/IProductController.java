package com.example.pos.controller.Pos;

import com.example.pos.constant.EndpointConstants;
import com.example.pos.dto.ProductResponse;
import com.example.pos.network.ApiResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(EndpointConstants.V1 + EndpointConstants.PRODUCTS)
@Tag(
        name = "Products",
        description = "APIs for managing Products resources"
)
public interface IProductController {
    ResponseEntity<ApiResponseWrapper<List<ProductResponse>>> createProduct(ProductResponse request);

    ResponseEntity<ApiResponseWrapper<List<ProductResponse>>> findProduct(Long id);
}
