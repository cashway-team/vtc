package com.cashway.dao.impl;

import com.cashway.dao.ArtificialAgentsDao;
import com.cashway.entity.persis.ArtificialAgents;
import org.springframework.stereotype.Repository;

/**
 * Created by mmzz on 2014/6/16.
 */
@Repository("artificialAgentsDaoImpl")
public class ArtificialAgentsDaoImpl extends PersistenceDaoImpl<ArtificialAgents, Long>
        implements ArtificialAgentsDao {

    public ArtificialAgents saveArtificialAgents(ArtificialAgents artificialAgents) {
        persist(artificialAgents);
        return artificialAgents;
    }

    public ArtificialAgents findArtificialAgents(Long agentsId) {
        ArtificialAgents artificialAgents = find(agentsId);
        return artificialAgents;
    }




}
