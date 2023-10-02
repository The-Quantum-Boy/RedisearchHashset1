package com.sumit.service;


import com.sumit.model.Order;
import com.sumit.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    public List<Order> search(String commodityCode) {

        return orderRepo.search(commodityCode);
    }
}
