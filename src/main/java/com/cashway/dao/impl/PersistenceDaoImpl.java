package com.cashway.dao.impl;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * Created by mmzz on 2014/6/25.
 */
@Transactional(value="oracleEM")
public class PersistenceDaoImpl<T, ID extends Serializable> extends BaseDaoImpl<T, ID> {

    @PersistenceContext(unitName = "oracleUnit")
    public void setOracleEntityManager(EntityManager oracleEntityManager) {
        this.oracleEntityManager = oracleEntityManager;
        setEntityManager(oracleEntityManager);
    }

    @PersistenceContext(unitName = "oracleUnit")
    protected EntityManager oracleEntityManager;
}
