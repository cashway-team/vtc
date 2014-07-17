package com.cashway.service.impl;

import com.cashway.dao.CustomerQueueMemDao;
import com.cashway.entity.persis.AgentsServiceType;
import com.cashway.entity.mem.CustomerMem;
import com.cashway.service.VtmService;
import com.cashway.handler.VtmObject;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by mmzz on 2014/7/14.
 */
@Service("vtmService")
public class VtmServiceImpl implements VtmService {

    @Autowired
    CustomerQueueMemDao customerQueueMemDao;

    @Override
    public boolean register(VtmObject vtmObject) {

        Gson gson = new Gson();

        CustomerMem customerMem = new CustomerMem();
        customerMem.setMessage(gson.toJson(vtmObject));
        customerMem.setName(vtmObject.getUserName());
        customerMem.setCardNo(vtmObject.getiDCardNo());
        customerMem.setServiceType(AgentsServiceType.Type.MALE_SERVICE);
        customerMem.setCustType(CustomerMem.Type.NORMAL);
        customerMem.setCreatedDate(new Date());

        customerQueueMemDao.persist(customerMem);
        return true;
    }
}
