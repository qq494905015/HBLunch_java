package com.hblunch.order.service.impl;/**
 * Created by kong on 2017-10-12.
 */

import com.github.pagehelper.PageHelper;
import com.hblunch.order.manual.dao.OrderExtMapper;
import com.hblunch.order.manual.dao.TestExtMapper;
import com.hblunch.order.manual.dto.OrderDTO;
import com.hblunch.order.manual.dto.TestDTO;
import com.hblunch.order.service.IOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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
@Service("orderService")
@Transactional
public class OrderServiceImpl implements IOrderService {
    @Resource
    private OrderExtMapper orderExtMapper;
    @Override
    public OrderDTO queryOrderById(String id) {
        return orderExtMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OrderDTO> queryOrderList(OrderDTO orderDTO) {
        if (orderDTO.getPage() != null && orderDTO.getRows() != null) {
            PageHelper.startPage(orderDTO.getPage(), orderDTO.getRows());
        }
        return orderExtMapper.select(orderDTO);
    }
}
