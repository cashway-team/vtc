package com.cashway.service.impl;

import com.cashway.common.Filter;
import com.cashway.dao.CustomerQueueMemDao;
import com.cashway.entity.mem.CustomerMem;
import com.cashway.service.CustomerQueueMemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Wayne on 2014/7/14.
 */
@Service
@Transactional
public class CustomerQueueMemServiceImpl extends BaseServiceImpl<CustomerMem, Long> implements CustomerQueueMemService {

    @Autowired
    private CustomerQueueMemDao customerQueueMemDao;

    @Override
    public List<CustomerMem> getCustomers() {
        return customerQueueMemDao.getCustomers();
    }

    @Override
    public CustomerMem find(Long id) {
        return customerQueueMemDao.find(id);
    }

    @Override
    public boolean hasNextMark() {
        Filter filter = new Filter();
        filter.setProperty("nextMark");
        filter.setOperator(Filter.Operator.eq);
        filter.setValue(1);
        return super.exists(filter);
    }

    @Override
    public void persist(CustomerMem customerMem) {
        customerQueueMemDao.persist(customerMem);
    }

    @Override
    public void merge(CustomerMem customerMem) {
        customerQueueMemDao.merge(customerMem);
    }

    @Override
    public void remove(CustomerMem customerMem) {
        customerQueueMemDao.remove(customerMem);
    }
}
