package com.example.pos.service.order;

import com.example.pos.dto.OrderResponse;
import com.example.pos.network.ResponseData;

public interface IOrderService {

    ResponseData<OrderResponse> createOrder(OrderResponse request);

    ResponseData<OrderResponse> findOrder(Long id);
}
