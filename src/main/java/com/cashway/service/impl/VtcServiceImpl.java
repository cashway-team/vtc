package com.cashway.service.impl;

import com.cashway.dao.ArtificialAgentsDao;
import com.cashway.dao.ArtificialAgentsMemDao;
import com.cashway.dao.ArtificialAgentsMemHistoryDao;
import com.cashway.entity.Admin;
import com.cashway.entity.ArtificialAgents;
import com.cashway.entity.ArtificialAgentsMem;
import com.cashway.entity.ArtificialAgentsMemHistory;
import com.cashway.service.VtcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by mmzz on 2014/6/16.
 */
@Service
@Transactional
public class VtcServiceImpl implements VtcService {

    @Autowired
    private ArtificialAgentsDao artificialAgentsDao;

    @Autowired
    private ArtificialAgentsMemDao artificialAgentsMemDao;

    @Autowired
    private ArtificialAgentsMemHistoryDao artificialAgentsMemHistoryDao;

    public boolean register(Admin admin) {

        ArtificialAgents artificialAgents = admin.getArtificialAgents();

        ArtificialAgentsMem artificialAgentsMem = new ArtificialAgentsMem();
        artificialAgentsMem.setStatus(ArtificialAgentsMem.Status.FREE);
        artificialAgentsMem.setAgentsId(artificialAgents.getId().intValue());
        artificialAgentsMem.setAgentsType(artificialAgents.getAgentsTypesStr());
        artificialAgentsMem.setServiceType(artificialAgents.getAgentsServiceTypesStr());
        artificialAgentsMem.setWaitTime(1l);
        artificialAgentsMem.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        artificialAgentsMemDao.save(artificialAgentsMem);

        // TODO 日志
        ArtificialAgentsMemHistory artificialAgentsMemHistory = new ArtificialAgentsMemHistory();
//        artificialAgentsMemHistoryDao.save(artificialAgentsMemHistory);
        return true;
    }


}