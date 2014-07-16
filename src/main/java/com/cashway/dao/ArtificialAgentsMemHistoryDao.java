package com.cashway.dao;

import com.cashway.entity.mem.ArtificialAgentsMem;
import com.cashway.entity.persis.ArtificialAgentsMemHistory;

/**
 * Created by mmzz on 2014/7/9.
 */
public interface ArtificialAgentsMemHistoryDao extends BaseDao<ArtificialAgentsMemHistory, Long> {
    public void save(ArtificialAgentsMemHistory artificialAgentsMemHistory);
}
