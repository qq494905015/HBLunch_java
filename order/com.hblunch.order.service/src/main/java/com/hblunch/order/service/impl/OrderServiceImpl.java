package com.hblunch.order.service.impl;/**
 * Created by kong on 2017-10-12.
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hblunch.order.manual.dao.OrderExtMapper;
import com.hblunch.order.manual.dao.OrderMenuExtMapper;
import com.hblunch.order.manual.dto.OrderDTO;
import com.hblunch.order.manual.dto.OrderMenuDTO;
import com.hblunch.order.service.IOrderService;
import com.hblunch.utils.DateUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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

    @Resource
    private OrderMenuExtMapper orderMenuExtMapper;

    @Override
    public OrderDTO queryOrderById(String id) {
        return orderExtMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<OrderDTO> queryOrderList(OrderDTO orderDTO) {
        if (orderDTO.getPage() != null && orderDTO.getRows() != null) {
            PageHelper.startPage(orderDTO.getPage(), orderDTO.getRows());
            PageHelper.orderBy("order_date desc");
        }
        return new PageInfo(orderExtMapper.queryOrderList(orderDTO));
    }

    @Override
    public PageInfo<OrderDTO> queryOrderListByTimeJob(OrderDTO orderDTO) {
        if (orderDTO.getPage() != null && orderDTO.getRows() != null) {
            PageHelper.startPage(orderDTO.getPage(), orderDTO.getRows());
            PageHelper.orderBy("order_date desc");
        }

        //获取今天到现在的时间段
        orderDTO.setSelectStartTime(DateUtils.FORMAT_YYYYMMDD.format(new Date())+" 00:00:00");
        orderDTO.setSelectEndTime(DateUtils.FORMAT_YYYYMMDDHHmmss.format(new Date()));
        return new PageInfo(orderExtMapper.queryOrderList(orderDTO));
    }

    @Override
    public List<OrderDTO> countOrderPriceForChart(OrderDTO orderDTO) {
        return orderExtMapper.countOrderPriceForChart(orderDTO);
    }

    @Override
    public List<OrderDTO> countOrderMenuForChart(OrderDTO orderDTO) {
        return orderExtMapper.countOrderMenuForChart(orderDTO);
    }
    @Override
    public Object insertOrder(OrderDTO orderDTO) {
        String id = UUID.randomUUID().toString();
        orderDTO.setId(id);
        String orderId = String.valueOf(System.currentTimeMillis());
        orderDTO.setOrderId(orderId);
        int flagCount = orderExtMapper.insert(orderDTO);
        String[] menuNameList = orderDTO.getMenuName().split(",");
        String[] menuPriceList = orderDTO.getMenuPrice().split(",");
        String[] menuCountList = orderDTO.getMenuCount().split(",");
        if(flagCount>0){
            for(int i= 0 ;i<menuNameList.length;i++){
                String menuName = menuNameList[i] ;
                String menuPrice = menuPriceList[i] ;
                String menuCount = menuCountList[i] ;
                OrderMenuDTO menuDto = new OrderMenuDTO();
                menuDto.setId(UUID.randomUUID().toString());
                menuDto.setOrderId(id);
                menuDto.setMenuName(menuName);
                menuDto.setMenuPrice(menuPrice);
                menuDto.setMenuCount(Integer.parseInt(menuCount));
                orderMenuExtMapper.insert(menuDto);
            }
        }
        return flagCount;
    }
}
