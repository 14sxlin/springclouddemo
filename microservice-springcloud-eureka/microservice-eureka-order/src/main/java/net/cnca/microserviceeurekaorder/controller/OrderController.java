package net.cnca.microserviceeurekaorder.controller;

import net.cnca.microserviceeurekaorder.po.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2020/2/3.23:03
 * @author: zpr
 * @description:
 */
@RestController
public class OrderController {
    @GetMapping("/order/{id}")
    public String findOrderById(@PathVariable String id){
        Order order = new Order();
        order.setId("123");
        order.setPrice(23.5);
        order.setReceiverAddress("beijing");
        order.setReceiverName("xiaoqiang");
        order.setReceiverPhone("13422343311");
        return order.toString();
    }
}
