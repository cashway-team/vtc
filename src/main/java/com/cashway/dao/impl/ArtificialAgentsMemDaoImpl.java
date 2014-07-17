package com.cashway.dao.impl;

import com.cashway.dao.ArtificialAgentsMemDao;
import com.cashway.entity.mem.ArtificialAgentsMem;
import org.springframework.stereotype.Repository;

/**
 * Created by mmzz on 2014/6/25.
 */
@Repository
public class ArtificialAgentsMemDaoImpl extends MemDaoImpl<ArtificialAgentsMem, Long>
        implements ArtificialAgentsMemDao {

    @Override
    public void save(ArtificialAgentsMem artificialAgentsMem) {
        entityManager.persist(artificialAgentsMem);
    }
}
