package com.hblunch.order.service.impl;/**
 * Created by kong on 2017-10-12.
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hblunch.order.manual.dao.OrderExtMapper;
import com.hblunch.order.manual.dao.OrderMenuExtMapper;
import com.hblunch.order.manual.dto.OrderDTO;
import com.hblunch.order.service.IOrderMenuService;
import com.hblunch.order.service.IOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
 * @date 2017-10-12
 */
@Service("orderMenuService")
@Transactional
public class OrderMenuServiceImpl implements IOrderMenuService {
    @Resource
    private OrderExtMapper orderExtMapper;
    @Resource
    private OrderMenuExtMapper orderMenuExtMapper;
}
