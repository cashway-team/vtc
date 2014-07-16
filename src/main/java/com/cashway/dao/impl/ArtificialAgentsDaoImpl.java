package com.cashway.dao.impl;

import com.cashway.dao.ArtificialAgentsDao;
import com.cashway.entity.persis.ArtificialAgents;
import org.springframework.stereotype.Repository;

/**
 * Created by mmzz on 2014/6/16.
 */
@Repository
public class ArtificialAgentsDaoImpl extends BaseDaoImpl<ArtificialAgents, String>
        implements ArtificialAgentsDao {

    public ArtificialAgents saveArtificialAgents(ArtificialAgents artificialAgents) {
        this.persist(artificialAgents);
        return artificialAgents;
    }

    public ArtificialAgents findArtificialAgents(Long agentsId) {
        ArtificialAgents artificialAgents = this.find(String.valueOf(agentsId));
        return artificialAgents;
    }




}
