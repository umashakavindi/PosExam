package com.example.pos.controller.Pos;

import com.example.pos.constant.EndpointConstants;
import com.example.pos.dto.CustomerResponse;
import com.example.pos.network.ApiResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(EndpointConstants.V1 + EndpointConstants.LOYALTY_CUSTOMERS + EndpointConstants.SALES + EndpointConstants.SUMMARY)
@Tag(
        name = "Loyalty Customers, sales , summary ",
        description = "APIs for managing Customer resources"
)
public interface ICustomerController {
    ResponseEntity<ApiResponseWrapper<CustomerResponse>> createCustomer(CustomerResponse request);

    ResponseEntity<ApiResponseWrapper<CustomerResponse>> findCustomer(Long id);
}
