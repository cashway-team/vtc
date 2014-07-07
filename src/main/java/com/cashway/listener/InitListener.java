/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.cashway.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.io.File;
import java.util.logging.Logger;

@Component("initListener")
public class InitListener implements ServletContextAware, ApplicationListener<ContextRefreshedEvent> {

    private static final String INSTALL_INIT_CONFIG_FILE_PATH = "/install_init.conf";

    private static final Logger logger = Logger.getLogger(InitListener.class.getName());

    private ServletContext servletContext;


    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (servletContext != null && contextRefreshedEvent.getApplicationContext().getParent() == null) {
            File installInitConfigFile = new File(servletContext.getRealPath(INSTALL_INIT_CONFIG_FILE_PATH));
            if (installInitConfigFile.exists()) {

                installInitConfigFile.delete();
            } else {

            }
        }
    }

}