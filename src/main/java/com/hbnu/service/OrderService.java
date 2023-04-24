package com.hbnu.service;

import com.hbnu.pojo.Door;
import com.hbnu.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAllOrders();
    int addOrder(Order order);
    Order findOrderById(int id);
    int orderUpdate(Order order);
    int deleteOrder(int id);
}
