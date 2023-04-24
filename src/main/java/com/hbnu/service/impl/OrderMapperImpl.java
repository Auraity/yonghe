package com.hbnu.service.impl;

import com.hbnu.dao.OrderMapper;
import com.hbnu.pojo.Door;
import com.hbnu.pojo.Order;
import com.hbnu.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderMapperImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    public List<Order> findAllOrders() {
        return orderMapper.findAllOrders();
    }

    public int addOrder(Order order) {
        return orderMapper.addOrder(order);
    }

    public Order findOrderById(int id) {
        return orderMapper.findOrderById(id);
    }

    public int orderUpdate(Order order) {
        return orderMapper.orderUpdate(order);
    }

    public int deleteOrder(int id) {
        return orderMapper.deleteOrder(id);
    }
}
