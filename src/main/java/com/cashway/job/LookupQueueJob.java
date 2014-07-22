package com.cashway.job;

import com.cashway.entity.mem.CustomerMem;
import com.cashway.service.CustomerQueueMemService;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

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
        List<CustomerMem> customers = customerQueueMemService.getCustomers();
        for (CustomerMem customer : customers) {

            customer.setNextMark(1);
            customerQueueMemService.merge(customer);
        }


        System.out.println("Look up ---------------------------------------------------------------- customer");
    }
}
