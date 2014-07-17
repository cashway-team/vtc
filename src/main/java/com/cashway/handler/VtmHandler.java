package com.cashway.handler;

import com.cashway.service.VtmService;
import com.google.gson.Gson;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mmzz on 2014/6/6.
 */
@Component
public class VtmHandler extends IoHandlerAdapter {

    @Autowired
    private VtmService vtmService;

    @Override
    public void messageReceived(IoSession ioSession, Object o) throws Exception {
        Gson gson = new Gson();
        VtmObject vtmObject = gson.fromJson((String) o, VtmObject.class);
        vtmService.register(vtmObject);
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
