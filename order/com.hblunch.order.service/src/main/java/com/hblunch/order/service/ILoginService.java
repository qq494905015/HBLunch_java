package com.hblunch.order.service;/**
 * Created by kong on 2017-10-12.
 */

import com.github.pagehelper.PageInfo;
import com.hblunch.order.manual.dto.LoginDTO;
import com.hblunch.order.manual.dto.OrderDTO;

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
public interface ILoginService {
    LoginDTO queryLoginInfo(LoginDTO loginDTO);
}
