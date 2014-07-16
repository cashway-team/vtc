package com.cashway.dao;

import com.cashway.entity.mem.ArtificialAgentsMem;

/**
 * Created by mmzz on 2014/7/9.
 */
public interface ArtificialAgentsMemDao extends BaseDao<ArtificialAgentsMem, Long> {
    public void save(ArtificialAgentsMem artificialAgentsMem);
}
