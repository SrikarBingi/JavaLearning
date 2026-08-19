package com.flm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flm.dto.OrderRequest;
import com.flm.dto.OrderResponse;
import com.flm.exception.OrderNotFoundException;
import com.flm.model.Order;
import com.flm.model.OrderStatus;
import com.flm.dao.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public OrderResponse createOrder(OrderRequest request) {

        Order order = new Order();

        order.setCustomerName(request.getCustomerName());
        order.setProductName(request.getProductName());
        order.setQuantity(request.getQuantity());
        order.setPrice(request.getPrice());

        order.setStatus(OrderStatus.CREATED);

        Order savedOrder = repository.save(order);

        return convertToResponse(
                savedOrder,
                "Order created successfully"
        );
    }

    @Override
    public List<OrderResponse> getAllOrders() {

        return repository.findAll()
                .stream()
                .map(order -> convertToResponse(order, null))
                .toList();
    }

    @Override
    public OrderResponse getOrderById(Long id) {

        Order order = repository.findById(id)
                .orElseThrow(() ->
                        new OrderNotFoundException(
                                "Order not found with id: " + id
                        )
                );

        return convertToResponse(order, null);
    }

    @Override
    public OrderResponse updateOrder(
            Long id,
            OrderRequest request) {

        Order existingOrder = repository.findById(id)
                .orElseThrow(() ->
                        new OrderNotFoundException(
                                "Order not found with id: " + id
                        )
                );

        existingOrder.setCustomerName(
                request.getCustomerName()
        );

        existingOrder.setProductName(
                request.getProductName()
        );

        existingOrder.setQuantity(
                request.getQuantity()
        );

        existingOrder.setPrice(
                request.getPrice()
        );

        Order updatedOrder = repository.save(existingOrder);

        return convertToResponse(
                updatedOrder,
                "Order updated successfully"
        );
    }

    @Override
    public void deleteOrder(Long id) {

        Order existingOrder = repository.findById(id)
                .orElseThrow(() ->
                        new OrderNotFoundException(
                                "Order not found with id: " + id
                        )
                );

        repository.delete(existingOrder);
    }

    @Override
    public OrderResponse updateStatus(
            Long id,
            OrderStatus status) {

        Order existingOrder = repository.findById(id)
                .orElseThrow(() ->
                        new OrderNotFoundException(
                                "Order not found with id: " + id
                        )
                );

        existingOrder.setStatus(status);

        Order updatedOrder = repository.save(existingOrder);

        return convertToResponse(
                updatedOrder,
                "Order status updated successfully"
        );
    }

    private OrderResponse convertToResponse(
            Order order,
            String message) {

        OrderResponse response = new OrderResponse();

        response.setOrderId(order.getId());

        response.setCustomerName(
                order.getCustomerName()
        );

        response.setProductName(
                order.getProductName()
        );

        response.setQuantity(
                order.getQuantity()
        );

        response.setPrice(
                order.getPrice()
        );

        double totalPrice =
                order.getQuantity() * order.getPrice();

        response.setTotalPrice(totalPrice);

        response.setMessage(message);

        return response;
    }
}