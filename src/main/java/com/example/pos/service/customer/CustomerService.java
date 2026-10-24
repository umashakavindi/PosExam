package com.example.pos.service.customer;

import com.example.pos.dto.CustomerResponse;
import com.example.pos.network.ResponseData;

public class CustomerService implements ICustomerService{
    @Override
    public ResponseData<CustomerResponse> createCustomer(CustomerResponse request) {
        return null;
    }

    @Override
    public ResponseData<CustomerResponse> findCustomer(Long id) {
        return null;
    }
}
