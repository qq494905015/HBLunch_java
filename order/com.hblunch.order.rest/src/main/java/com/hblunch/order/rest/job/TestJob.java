package com.hblunch.order.rest.job;/**
 * Created by kong on 2017-10-24.
 */

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * <pre>
 *
 * </pre>
 *
 * @author kong@foresee.com.cn
 * @version 1.00.00
 *          <p>
 *          <pre>
 *          修改记录
 *             修改后版本:     修改人：  修改日期:     修改内容:
 *                   </pre>
 * @date 2017-10-24
 */
@Component
public class TestJob {
    public final static long ONE_Minute =  1 * 1000;

    /*@Scheduled(fixedDelay=ONE_Minute)
    public void fixedDelayJob(){
        System.out.println("fixedDelayJob"+System.currentTimeMillis());
    }

    @Scheduled(fixedRate=ONE_Minute)
    public void fixedRateJob(){
        System.out.println("fixedRateJob"+System.currentTimeMillis());
    }

    @Scheduled(cron="0 15 3 * * ?")
    public void cronJob(){
        System.out.println("haha");
    }*/

}
