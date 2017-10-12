package com.hblunch.order.service.impl;/**
 * Created by kong on 2017-10-12.
 */

import com.hblunch.order.auto.dao.TestMapper;
import com.hblunch.order.auto.model.Test;
import com.hblunch.order.service.TestService;
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
@Service
@Transactional
public class TestServiceImpl implements TestService{
    @Resource
    private TestMapper testMapper;
    @Override
    public Test selectByPrimaryKey(String id) {
        return testMapper.selectByPrimaryKey("123");
    }
}
