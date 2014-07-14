package com.cashway.dao;

import com.cashway.entity.CustomerMem;

import java.util.List;

/**
 * Created by Wayne on 2014/7/14.
 */
public interface CustomerQueueMemDao {

    List<CustomerMem> getRecentCustomers();

    void persist(CustomerMem customerMem);

    void remove(CustomerMem customerMem);

    CustomerMem find(Long id);
}