package com.cashway.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by mmzz on 2014/6/25.
 */
public class MemHibernateDao extends HibernateDaoSupport {

    @Autowired
    public void init(SessionFactory h2SessionFactory) {
        setSessionFactory(h2SessionFactory);
    }

}
