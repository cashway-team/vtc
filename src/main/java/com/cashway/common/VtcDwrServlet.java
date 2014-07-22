package com.cashway.common;

import com.cashway.entity.persis.Admin;
import com.cashway.service.AdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.directwebremoting.Container;
import org.directwebremoting.ScriptSession;
import org.directwebremoting.ServerContextFactory;
import org.directwebremoting.event.ScriptSessionEvent;
import org.directwebremoting.event.ScriptSessionListener;
import org.directwebremoting.extend.ScriptSessionManager;
import org.directwebremoting.servlet.DwrServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import static com.cashway.common.Constants.ARTIFICIAL_AGENTS_KEY;

/**
 * Created by mmzz on 2014/7/18.
 */
public class VtcDwrServlet extends DwrServlet {

    private AdminService adminService;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);

         adminService = (AdminService) WebApplicationContextUtils.
                 getRequiredWebApplicationContext(getServletContext()).getBean("adminServiceImpl");

        Container container = ServerContextFactory.get().getContainer();
        ScriptSessionManager scriptSessionManager = container
                .getBean(ScriptSessionManager.class);


        ScriptSessionListener scriptSessionListener = new ScriptSessionListener() {
            public void sessionCreated(ScriptSessionEvent ev) {
                ScriptSession scriptSession = ev.getSession();

                Subject subject = SecurityUtils.getSubject();
                Session session = subject.getSession();

                scriptSession.setAttribute(ARTIFICIAL_AGENTS_KEY, session.getAttribute(ARTIFICIAL_AGENTS_KEY));
                System.err.println("创建---" + scriptSession.getId());
            }

            public void sessionDestroyed(ScriptSessionEvent ev) {
                System.out.println("销毁-----" + ev.getSession().getId());
            }
        };
        scriptSessionManager.addScriptSessionListener(scriptSessionListener);
    }


}
