package com.cashway.service;

import com.cashway.entity.persis.Admin;

/**
 * Created by mmzz on 2014/7/9.
 */
public interface VtcService extends BaseService<Admin, Long> {
    public boolean register(Admin admin);
}
