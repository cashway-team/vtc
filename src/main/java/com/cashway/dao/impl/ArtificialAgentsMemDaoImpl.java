package com.cashway.dao.impl;

import com.cashway.dao.ArtificialAgentsMemDao;
import com.cashway.entity.ArtificialAgentsMem;
import org.springframework.stereotype.Repository;

/**
 * Created by mmzz on 2014/6/25.
 */
@Repository
public class ArtificialAgentsMemDaoImpl extends MemHibernateDao
        implements ArtificialAgentsMemDao {

    public void save(ArtificialAgentsMem artificialAgentsMem) {
        this.getHibernateTemplate().saveOrUpdate(artificialAgentsMem);
    }


}
