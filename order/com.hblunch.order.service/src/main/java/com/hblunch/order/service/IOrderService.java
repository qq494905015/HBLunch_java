package com.hblunch.order.service;/**
 * Created by kong on 2017-10-12.
 */

import com.github.pagehelper.PageInfo;
import com.hblunch.order.manual.dto.OrderDTO;

import java.util.List;

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
 * @date 2017-10-12
 */
public interface IOrderService {
    public OrderDTO queryOrderById(String id);

    PageInfo<OrderDTO> queryOrderList(OrderDTO orderDTO);

    /**
     * 只查询今天到当前时间的订单记录
     * @param orderDTO
     * @return
     */
    PageInfo<OrderDTO> queryOrderListByTimeJob(OrderDTO orderDTO);

    /**
     * 统计营业额
     * @param orderDTO
     * @return
     */
    List<OrderDTO> countOrderPriceForChart(OrderDTO orderDTO);


    /**
     * 统计菜品分布
     * @param orderDTO
     * @return
     */
    List<OrderDTO> countOrderMenuForChart(OrderDTO orderDTO);

}
