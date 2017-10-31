package com.hblunch.order.service.impl;/**
 * Created by kong on 2017-10-31.
 */

import com.hblunch.order.manual.dao.LoginExtMapper;
import com.hblunch.order.manual.dao.OrderExtMapper;
import com.hblunch.order.manual.dto.LoginDTO;
import com.hblunch.order.service.ILoginService;
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
 * @date 2017-10-31
 */
@Service("loginService")
@Transactional
public class LoginServiceImpl implements ILoginService{
    @Resource
    private LoginExtMapper loginExtMapper;


    @Override
    public LoginDTO queryLoginInfo(LoginDTO loginDTO) {
        List<LoginDTO> loginDTOLIst = loginExtMapper.select(loginDTO);
        if(loginDTOLIst.isEmpty()){
            return null;
        }
        return loginDTOLIst.get(0);
    }
}
