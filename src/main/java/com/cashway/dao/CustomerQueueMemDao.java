package com.cashway.dao;

import com.cashway.entity.mem.CustomerMem;

import java.util.List;

/**
 * Created by Wayne on 2014/7/14.
 */
public interface CustomerQueueMemDao extends BaseDao<CustomerMem, Long> {

    List<CustomerMem> getCustomers();

    void persist(CustomerMem customerMem);

    void remove(CustomerMem customerMem);

    CustomerMem find(Long id);
}