package com.cashway.service.impl;

import com.cashway.entity.CustomerMem;
import com.cashway.service.CustomerQueueMemService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Wayne on 2014/7/14.
 */
@Service("customerQueueServiceImpl")
public class CustomerQueueMemServiceImpl extends BaseServiceImpl<CustomerMem, Long> implements CustomerQueueMemService {


    @Override
    public List<CustomerMem> getRecentCustomers() {
        return null;
    }

    @Override
    public CustomerMem find(Long aLong) {
        return null;
    }

    @Override
    public List<CustomerMem> findList(Long... longs) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public void save(CustomerMem entity) {

    }

    @Override
    public CustomerMem update(CustomerMem entity) {
        return null;
    }

    @Override
    public CustomerMem update(CustomerMem entity, String... ignoreProperties) {
        return null;
    }

    @Override
    public void delete(Long... longs) {

    }
}
