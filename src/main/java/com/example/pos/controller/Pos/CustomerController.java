package com.example.pos.controller.Pos;

import com.example.pos.dto.CustomerResponse;
import com.example.pos.network.ApiResponseWrapper;
import com.example.pos.network.NetworkUtils;
import com.example.pos.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController implements ICustomerController {

    @Autowired
    private ICustomerService customerService;

    @Override
    public ResponseEntity<ApiResponseWrapper<CustomerResponse>> createCustomer(CustomerResponse request) {
        return NetworkUtils.wrap(customerService.createCustomer(request));
    }

    @Override
    public ResponseEntity<ApiResponseWrapper<CustomerResponse>> findCustomer(Long id) {
        return NetworkUtils.wrap(customerService.findCustomer(id));
    }
}
