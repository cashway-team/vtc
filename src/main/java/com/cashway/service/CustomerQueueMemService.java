package com.cashway.service;

import com.cashway.entity.CustomerMem;

import java.util.List;

/**
 * Created by Wayne on 2014/7/14.
 */
public interface CustomerQueueMemService {

    List<CustomerMem> getRecentCustomers();

    void persist(CustomerMem customerMem);

    void remove(CustomerMem customerMem);

    CustomerMem find(Long id);
}
