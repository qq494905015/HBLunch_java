package com.hblunch.order.rest.ui.back;/**
 * Created by kong on 2017-10-16.
 */

import com.hblunch.order.auto.dao.TestMapper;
import com.hblunch.order.manual.dao.TestExtMapper;
import com.hblunch.order.manual.dto.OrderDTO;
import com.hblunch.order.manual.dto.TestDTO;
import com.hblunch.order.service.IOrderService;
import com.hblunch.order.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
 * @date 2017-10-16
 */
@RestController("/back/orderResource")
@RequestMapping("/back/orderResource")
public class OrderResource {

    @Autowired
    private IOrderService orderService;


    @RequestMapping(value = "/queryOrderById")
    public Object queryOrderById() {
        return orderService.queryOrderById("123");
    }

    @RequestMapping(value = "/queryOrderList")
    public Object queryOrderList(OrderDTO orderDTO) {
        return orderService.queryOrderList(orderDTO);
    }

}
