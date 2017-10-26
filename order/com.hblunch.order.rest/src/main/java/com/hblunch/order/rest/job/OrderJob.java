package com.hblunch.order.rest.job;/**
 * Created by kong on 2017-10-24.
 */

import com.hblunch.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
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
//@Component
public class OrderJob {
    //单位是毫秒
    public final static long DELAY_TIME =  5 * 1000;

    @Autowired
    private IOrderService orderService;

    @Scheduled(fixedDelay=DELAY_TIME)
    public void autoCreateOrder(){
        System.out.println(orderService.queryOrderById("123"));
    }


}
