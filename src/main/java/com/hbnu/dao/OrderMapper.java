package com.hbnu.dao;

import com.hbnu.pojo.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> findAllOrders();
    int addOrder(Order order);
    Order findOrderById(int id);
    int orderUpdate(Order order);
    int deleteOrder(int id);
}
