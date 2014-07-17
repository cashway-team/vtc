package com.cashway.dao.impl;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * Created by mmzz on 2014/6/25.
 */
@Transactional(value="informixEM")
public class PersistenceDaoImpl<T, ID extends Serializable> extends BaseDaoImpl<T, ID> {

    @PersistenceContext(unitName = "informixUnit")
    public void setInformixEntityManager(EntityManager informixEntityManager) {
        this.informixEntityManager = informixEntityManager;
        setEntityManager(informixEntityManager);
    }

    @PersistenceContext(unitName = "informixUnit")
    protected EntityManager informixEntityManager;
}
