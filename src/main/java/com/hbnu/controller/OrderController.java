package com.hbnu.controller;

import com.hbnu.pojo.Door;
import com.hbnu.pojo.Order;
import com.hbnu.service.DoorService;
import com.hbnu.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderController {
    @Resource
    private OrderService orderService;
    @Resource
    private DoorService doorService;

    @RequestMapping("/orderList")
    public String orderList(Model model) {
        List<Order> orders = orderService.findAllOrders();
        model.addAttribute("orderList", orders);
        List<Door> doorList = doorService.findAllDoors();
        model.addAttribute("doorList", doorList);
        return "order_list";
    }

    @RequestMapping("/findAllDoorToOrderAdd")
    public String addAllDoorToOrderAdd(Model model) {
        List<Door> doorList = doorService.findAllDoors();
        model.addAttribute("doorList", doorList);
        return "order_add";
    }

    @RequestMapping("/orderAdd")
    public String orderAdd(Order o) {
        int order = orderService.addOrder(o);
        if (order == 1) {
            return "redirect:/orderList";
        }
        return "redirect:500.jsp";
    }

    //    修改
    //    找到需要修改的订单
    @RequestMapping("/orderInfo")
    public String orderInfo(Model model, int id) {
        Order order = orderService.findOrderById(id);
        model.addAttribute("order", order);
        List<Door> doorList = doorService.findAllDoors();
        model.addAttribute("doorList", doorList);
        return "order_update";
    }

    //    进行修改操作
    @RequestMapping("/orderUpdate")
    public String orderUpdate(Model model, Order o) {
        int order=orderService.orderUpdate(o);
        if (order == 1) {
            return "redirect:/orderList";
        }
        return "redirect:500.jsp";
    }


    //    删除订单
    @RequestMapping("/orderDelete")
    public String deleteOrder(int id) {
        int delete = orderService.deleteOrder(id);
        if (delete == 1) {
            return "redirect:/orderList";
        }
        return "redirect:500.jsp";
    }
}
