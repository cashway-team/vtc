package com.cashway.dao.impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.poi.ss.formula.functions.T;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * Created by Wayne on 2014/7/15.
 */
public class MemDaoImpl<T, ID extends Serializable> extends BaseDaoImpl<T, ID> {

    @PersistenceContext(unitName = "h2")
    protected EntityManager h2EntityManager;

    @PersistenceContext(unitName = "h2")
    public void setH2EntityManager(EntityManager h2EntityManager) {
        this.h2EntityManager = h2EntityManager;
        setEntityManager(h2EntityManager);
    }
}
