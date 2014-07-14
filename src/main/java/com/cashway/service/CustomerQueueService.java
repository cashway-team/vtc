package com.cashway.service;

import com.cashway.entity.CustomerMem;

import java.util.List;

/**
 * Created by Wayne on 2014/7/14.
 */
public interface CustomerQueueService extends BaseService<CustomerMem, Long> {

    List<CustomerMem> getRecentCustomers();
}
