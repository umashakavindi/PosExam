package com.example.pos.service.order;

import com.example.pos.dto.OrderResponse;
import com.example.pos.network.ResponseData;

public class OrderService implements IOrderService{

    @Override
    public ResponseData<OrderResponse> createOrder(OrderResponse request) {
        return null;
    }

    @Override
    public ResponseData<OrderResponse> findOrder(Long id) {
        return null;
    }
}
