package com.flm.service;

import java.util.List;

import com.flm.dto.OrderRequest;
import com.flm.dto.OrderResponse;
import com.flm.model.OrderStatus;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);

    List<OrderResponse> getAllOrders();

    OrderResponse getOrderById(Long id);

    OrderResponse updateOrder(Long id, OrderRequest request);

    void deleteOrder(Long id);

    OrderResponse updateStatus(Long id, OrderStatus status);
}