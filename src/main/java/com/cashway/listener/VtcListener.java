package com.cashway.listener;


import com.cashway.vtc.VtmManager;

import javax.servlet.ServletContextEvent;

/**
 * Created by mmzz on 2014/6/6.
 */
public class VtcListener implements javax.servlet.ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        VtmManager.init();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
