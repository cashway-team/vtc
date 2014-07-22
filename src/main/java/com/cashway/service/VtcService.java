package com.cashway.service;

import com.cashway.entity.persis.Admin;
import com.cashway.handler.VtmObject;

/**
 * Created by mmzz on 2014/7/9.
 */
public interface VtcService extends BaseService<Admin, Long> {
    public boolean registeredArtificialAgentsMem(Admin admin);
    public boolean registeredCustomerMem(VtmObject vtmObject);
}
