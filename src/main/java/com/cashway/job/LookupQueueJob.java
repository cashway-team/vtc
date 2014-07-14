package com.cashway.job;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by Wayne on 2014/7/14.
 */
@Component("lookupJob")
@Lazy(false)
public class LookupQueueJob {
    public void lookup(){

    }
}
