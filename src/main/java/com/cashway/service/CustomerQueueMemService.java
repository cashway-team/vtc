package com.cashway.service;

import com.cashway.common.Filter;
import com.cashway.entity.mem.CustomerMem;

import java.util.List;

/**
 * Created by Wayne on 2014/7/14.
 */
public interface CustomerQueueMemService extends BaseService<CustomerMem, Long> {

    void persist(CustomerMem customerMem);

    void remove(CustomerMem customerMem);

    void merge(CustomerMem customerMem);

    boolean exists(Filter... filters);

    List<CustomerMem> getCustomers();

    CustomerMem find(Long id);

    boolean hasMarkedNext();

    void addNextMark(CustomerMem customerMem);

    List<CustomerMem> getMarkedNext();
}
