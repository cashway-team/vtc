package com.cashway.dao.impl;

import com.cashway.dao.CustomerQueueMemDao;
import com.cashway.entity.mem.CustomerMem;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wayne on 2014/7/14.
 */
@Repository("customerQueueDaoMemImpl")
public class CustomerQueueMemDaoImpl extends MemDaoImpl<CustomerMem, Long> implements CustomerQueueMemDao {
    @Override
    public List<CustomerMem> getRecentCustomers() {
        String jpql = "from CustomerMem customerMem";
        Query query = entityManager.createQuery(jpql);
        return query.getResultList();
    }

    @Override
    public void persist(CustomerMem customerMem) {
        entityManager.persist(customerMem);
    }

    @Override
    public void remove(CustomerMem customerMem) {
        entityManager.remove(customerMem);
    }

    @Override
    public CustomerMem find(Long id) {
        String jpql = "from CustomerMem customerMem where customerMem.id = :id";
        Query query = entityManager.createQuery(jpql);
        query.setParameter("id", id);
        return (CustomerMem) query.getResultList().get(0);
    }
}
