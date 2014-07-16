package com.cashway.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * Created by mmzz on 2014/6/25.
 */
public class PersistenceDaoImpl<T, ID extends Serializable> extends BaseDaoImpl<T, ID> {

    @PersistenceContext(unitName = "informix")
    public void setInformixEntityManager(EntityManager informixEntityManager) {
        this.informixEntityManager = informixEntityManager;
        setEntityManager(informixEntityManager);
    }

    @PersistenceContext(unitName = "informix")
    protected EntityManager informixEntityManager;
}
