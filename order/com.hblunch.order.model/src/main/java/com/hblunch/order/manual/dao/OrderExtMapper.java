package com.hblunch.order.manual.dao;

import com.hblunch.base.MyMapper;
import com.hblunch.order.manual.dto.OrderDTO;

import java.util.List;

public interface OrderExtMapper extends MyMapper<OrderDTO> {
    /**
     * 订单查询
     * @param orderDTO
     * @return
     */
    public List<OrderDTO> queryOrderList(OrderDTO orderDTO);

    /**
     * 统计营业额
     * @param orderDTO
     * @return
     */
    public List<OrderDTO> countOrderPriceForChart(OrderDTO orderDTO);

    /**
     * 统计菜品分布
     * @param orderDTO
     * @return
     */
    public List<OrderDTO> countOrderMenuForChart(OrderDTO orderDTO);

}