package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;
import com.lambdaschool.javaorders.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServicesImpl implements OrderServices {
    @Autowired
    private OrdersRepository orderRepos;

    @Override
    public Order save(Order order) {
        return orderRepos.save(order);
    }
}
