package com.cashway.dao.impl;

import com.cashway.dao.ArtificialAgentsMemHistoryDao;
import com.cashway.entity.persis.ArtificialAgentsMemHistory;
import org.springframework.stereotype.Repository;

/**
 * Created by mmzz on 2014/6/25.
 */
@Repository("artificialAgentsMemHistoryDaoImpl")
public class ArtificialAgentsMemHistoryDaoImpl extends PersistenceDaoImpl<ArtificialAgentsMemHistory, Long>
        implements ArtificialAgentsMemHistoryDao {

    public void save(ArtificialAgentsMemHistory artificialAgentsMemHistory) {
        this.persist(artificialAgentsMemHistory);
    }


}
