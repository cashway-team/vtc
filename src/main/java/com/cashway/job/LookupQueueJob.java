package com.cashway.job;

import com.cashway.service.CustomerQueueMemService;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Wayne on 2014/7/14.
 */
@Component("lookupJob")
@Lazy(false)
public class LookupQueueJob {

    @Resource(name = "customerQueueMemServiceImpl")
    private CustomerQueueMemService customerQueueMemService;

    @Scheduled(cron = "${job.customer_lookup.cron}")
    public void lookup() {
//        customerQueueMemService.getRecentCustomers();
        System.out.println("Look up ---------------------------------------------------------------- customer");
    }
}
