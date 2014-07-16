package com.cashway.dao;

import com.cashway.entity.persis.ArtificialAgents;

/**
 * Created by mmzz on 2014/7/9.
 */
public interface ArtificialAgentsDao {

    public ArtificialAgents saveArtificialAgents(ArtificialAgents artificialAgents);
    public ArtificialAgents findArtificialAgents(Long agentsId);
}
