package com.example.pos.controller.Pos;

import com.example.pos.dto.OrderResponse;
import com.example.pos.network.ApiResponseWrapper;
import com.example.pos.network.NetworkUtils;
import com.example.pos.service.order.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController implements IOrderController {

    @Autowired
    private IOrderService orderService;

    @Override
    public ResponseEntity<ApiResponseWrapper<OrderResponse>> createOrder(OrderResponse request) {
        return NetworkUtils.wrap(orderService.createOrder(request));
    }

    @Override
    public ResponseEntity<ApiResponseWrapper<OrderResponse>> findOrder(Long id) {
        return NetworkUtils.wrap(orderService.findOrder(id));
    }
}
