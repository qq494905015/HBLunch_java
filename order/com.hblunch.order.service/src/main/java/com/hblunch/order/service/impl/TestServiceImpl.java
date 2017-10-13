package com.hblunch.order.service.impl;/**
 * Created by kong on 2017-10-12.
 */

import com.github.pagehelper.PageHelper;
import com.hblunch.order.auto.dao.TestMapper;
import com.hblunch.order.auto.model.Test;
import com.hblunch.order.manual.dao.TestExtMapper;
import com.hblunch.order.manual.dto.TestDTO;
import com.hblunch.order.service.ITestService;
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
@Service("testService")
@Transactional
public class TestServiceImpl implements ITestService {
    @Resource
    private TestExtMapper testExtMapper;
    @Override
    public TestDTO queryTestById(String id) {
        return testExtMapper.selectByPrimaryKey("123");
    }

    @Override
    public List<TestDTO> queryList(TestDTO testDTO) {
        if (testDTO.getPage() != null && testDTO.getRows() != null) {
            PageHelper.startPage(testDTO.getPage(), testDTO.getRows());
        }
        return testExtMapper.selectAll();
    }
}
