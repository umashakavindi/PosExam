package com.example.pos.controller.Pos;

import com.example.pos.constant.EndpointConstants;
import com.example.pos.dto.OrderResponse;
import com.example.pos.network.ApiResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(EndpointConstants.V1 + EndpointConstants.ORDERS)
@Tag(
        name = "Orders",
        description = "APIs for managing Order resources"
)
public interface IOrderController {
    ResponseEntity<ApiResponseWrapper<OrderResponse>> createOrder(OrderResponse request);

    ResponseEntity<ApiResponseWrapper<OrderResponse>> findOrder(Long id);
}
