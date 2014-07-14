package com.cashway.dao.impl;

import com.cashway.dao.CustomerQueueMemDao;
import com.cashway.entity.CustomerMem;
import net.sf.ehcache.search.expression.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wayne on 2014/7/14.
 */
@Repository("customerQueueDaoMemImpl")
public class CustomerQueueDaoMemImpl extends MemHibernateDao implements CustomerQueueMemDao {
    @Override
    public List<CustomerMem> getRecentCustomers() {
        String hql = "from CustomerMem customerMem";
        Query query = getSession().createQuery(hql);
        return query.list();
    }

    @Override
    public void persist(CustomerMem customerMem) {
        this.getHibernateTemplate().saveOrUpdate(customerMem);
    }

    @Override
    public void remove(CustomerMem customerMem) {
        this.getHibernateTemplate().delete(customerMem);
    }

    @Override
    public CustomerMem find(Long id) {
        String hql = "from CustomerMem customerMem where customerMem.id = :id";
        Query query = getSession().createQuery(hql);
        query.setParameter("id", id);
        return (CustomerMem) query.list().get(0);
    }
}
