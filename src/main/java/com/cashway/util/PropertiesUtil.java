package com.cashway.util;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by mmzz on 2014/6/6.
 */
public class PropertiesUtil {

    public static final String SOCKET_PROPERTIES = "/settings.properties";

    private static final String VTM_PORT_KEY = "vtm.port";

    public static Integer getVtmPort() {
        Resource resource = new ClassPathResource(SOCKET_PROPERTIES);
        Properties props = null;
        try {
            props = PropertiesLoaderUtils.loadProperties(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Integer(props.getProperty(VTM_PORT_KEY));
    }



}
