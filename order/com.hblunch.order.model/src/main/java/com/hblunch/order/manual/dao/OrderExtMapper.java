package com.hblunch.order.manual.dao;

import com.hblunch.base.MyMapper;
import com.hblunch.order.manual.dto.OrderDTO;

import java.util.List;

public interface OrderExtMapper extends MyMapper<OrderDTO> {
    public List<OrderDTO> queryOrderList(OrderDTO orderDTO);
}