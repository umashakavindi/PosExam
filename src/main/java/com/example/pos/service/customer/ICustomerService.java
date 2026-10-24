package com.example.pos.service.customer;

import com.example.pos.dto.CustomerResponse;
import com.example.pos.network.ResponseData;

public interface ICustomerService {

    ResponseData<CustomerResponse> createCustomer(CustomerResponse request);

    ResponseData<CustomerResponse> findCustomer(Long id);
}
