package com.cashway.dao.impl;

import com.cashway.dao.ArtificialAgentsMemHistoryDao;
import com.cashway.entity.ArtificialAgentsMem;
import com.cashway.entity.ArtificialAgentsMemHistory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by mmzz on 2014/6/25.
 */
@Repository
public class ArtificialAgentsMemHistoryDaoImpl extends BaseDaoImpl<ArtificialAgentsMemHistory, String>
        implements ArtificialAgentsMemHistoryDao {

    public void save(ArtificialAgentsMemHistory artificialAgentsMemHistory) {
        this.persist(artificialAgentsMemHistory);
    }


}
