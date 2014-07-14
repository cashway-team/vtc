package com.cashway.service.impl;

import com.cashway.dao.CustomerQueueMemDao;
import com.cashway.entity.CustomerMem;
import com.cashway.service.CustomerQueueMemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Wayne on 2014/7/14.
 */
@Service("customerQueueMemServiceImpl")
public class CustomerQueueMemServiceImpl implements CustomerQueueMemService {

    @Resource(name = "customerQueueDaoMemImpl")
    private CustomerQueueMemDao customerQueueMemDao;

    @Override
    public List<CustomerMem> getRecentCustomers() {
        return customerQueueMemDao.getRecentCustomers();
    }

    @Override
    public CustomerMem find(Long id) {
        return customerQueueMemDao.find(id);
    }

    @Override
    public void persist(CustomerMem customerMem) {
        customerQueueMemDao.persist(customerMem);
    }

    @Override
    public void remove(CustomerMem customerMem) {
        customerQueueMemDao.remove(customerMem);
    }
}
