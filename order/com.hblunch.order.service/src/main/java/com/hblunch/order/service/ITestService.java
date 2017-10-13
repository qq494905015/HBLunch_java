package com.hblunch.order.service;/**
 * Created by kong on 2017-10-12.
 */

import com.hblunch.order.auto.model.Test;
import com.hblunch.order.manual.dto.TestDTO;

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
public interface ITestService {
    public TestDTO queryTestById(String id);

    List<TestDTO> queryList(TestDTO testDTO);
}
