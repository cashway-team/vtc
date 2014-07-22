package com.cashway.handler;

import com.cashway.service.VtcService;
import com.google.gson.Gson;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.directwebremoting.Browser;
import org.directwebremoting.ScriptBuffer;
import org.directwebremoting.ScriptSession;
import org.directwebremoting.ScriptSessionFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.cashway.common.Constants.ARTIFICIAL_AGENTS_KEY;

import java.util.Collection;

/**
 * Created by mmzz on 2014/6/6.
 */
@Component
public class VtmHandler extends IoHandlerAdapter {

    @Autowired
    private VtcService vtcService;

    @Override
    public void messageReceived(IoSession ioSession, Object o) throws Exception {
        Gson gson = new Gson();
        VtmObject vtmObject = gson.fromJson((String) o, VtmObject.class);
        vtcService.registeredCustomerMem(vtmObject);


        //TODO 以下测试用, 当找到服务的坐席后调用
        send(1l, (String) o);
    }

    private void send(final Long receivedId, final String msg) {
        Browser.withAllSessionsFiltered(new ScriptSessionFilter() {
            public boolean match(ScriptSession session) {
                if (session.getAttribute(ARTIFICIAL_AGENTS_KEY) == null)
                    return false;
                else
                    return session.getAttribute(ARTIFICIAL_AGENTS_KEY) == receivedId;
            }
        }, new Runnable() {
            private ScriptBuffer scriptBuffer = new ScriptBuffer();

            public void run() {
                scriptBuffer.appendCall("showMessage", msg);
                Collection<ScriptSession> scriptSessions = Browser.getTargetSessions();

                for (ScriptSession scriptSession : scriptSessions) {
                    scriptSession.addScript(scriptBuffer);
                }
            }

        });
    }

    @Override
    public void messageSent(IoSession ioSession, Object o) throws Exception {

    }

    @Override
    public void sessionCreated(IoSession ioSession) throws Exception {

    }

    @Override
    public void sessionOpened(IoSession ioSession) throws Exception {

    }

    @Override
    public void sessionClosed(IoSession ioSession) throws Exception {

    }

    @Override
    public void sessionIdle(IoSession ioSession, IdleStatus idleStatus) throws Exception {

    }

    @Override
    public void exceptionCaught(IoSession ioSession, Throwable throwable) throws Exception {
        System.out.println(throwable);
    }
}
