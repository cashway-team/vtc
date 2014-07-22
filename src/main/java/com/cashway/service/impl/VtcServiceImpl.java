package com.cashway.service.impl;

import com.cashway.dao.ArtificialAgentsMemDao;
import com.cashway.dao.ArtificialAgentsMemHistoryDao;
import com.cashway.dao.CustomerQueueMemDao;
import com.cashway.entity.mem.ArtificialAgentsMem;
import com.cashway.entity.mem.CustomerMem;
import com.cashway.entity.persis.Admin;
import com.cashway.entity.persis.AgentsServiceType;
import com.cashway.entity.persis.ArtificialAgents;
import com.cashway.entity.persis.ArtificialAgentsMemHistory;
import com.cashway.handler.VtmObject;
import com.cashway.service.VtcService;
import com.google.gson.Gson;
import org.directwebremoting.Container;
import org.directwebremoting.ScriptSession;
import org.directwebremoting.ServerContextFactory;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.event.ScriptSessionEvent;
import org.directwebremoting.event.ScriptSessionListener;
import org.directwebremoting.extend.ScriptSessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.cashway.common.Constants.ARTIFICIAL_AGENTS_KEY;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by mmzz on 2014/6/16.
 */
@Service("vtcService")
@Transactional
public class VtcServiceImpl extends BaseServiceImpl<Admin, Long> implements VtcService {

    @Autowired
    private ArtificialAgentsMemDao artificialAgentsMemDao;

    @Autowired
    private ArtificialAgentsMemHistoryDao artificialAgentsMemHistoryDao;

    @Autowired
    CustomerQueueMemDao customerQueueMemDao;

    public boolean registeredArtificialAgentsMem(Admin admin) {

        ArtificialAgents artificialAgents = admin.getArtificialAgents();

        ArtificialAgentsMem artificialAgentsMem = new ArtificialAgentsMem();
        artificialAgentsMem.setStatus(ArtificialAgentsMem.Status.OFFLINE);
        artificialAgentsMem.setAgentsId(artificialAgents.getId().intValue());
        artificialAgentsMem.setAgentsType(artificialAgents.getAgentsTypesStr());
        artificialAgentsMem.setServiceType(artificialAgents.getAgentsServiceTypesStr());
        artificialAgentsMem.setWaitTime(1l);
        artificialAgentsMem.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        artificialAgentsMemDao.save(artificialAgentsMem);

        ArtificialAgentsMemHistory artificialAgentsMemHistory = new ArtificialAgentsMemHistory();
        artificialAgentsMemHistory.setCreatedDate(new Date());
        artificialAgentsMemHistory.setAction(ArtificialAgentsMemHistory.Action.REGISTRATION);
        artificialAgentsMemHistory.setArtificialAgents(artificialAgents);
        artificialAgentsMemHistoryDao.save(artificialAgentsMemHistory);

        return true;
    }

    @Override
    public boolean registeredCustomerMem(VtmObject vtmObject) {

        Gson gson = new Gson();

        CustomerMem customerMem = new CustomerMem();
        customerMem.setMessage(gson.toJson(vtmObject));
        customerMem.setName(vtmObject.getUserName());
        customerMem.setCardNo(vtmObject.getiDCardNo());
        customerMem.setServiceType(AgentsServiceType.Type.MALE_SERVICE);
        customerMem.setCustType(CustomerMem.Type.NORMAL);
        customerMem.setCreatedDate(new Date());
        customerMem.setWaitTime(1);

        customerQueueMemDao.persist(customerMem);
        return true;
    }


}
