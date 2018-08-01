package com.yang.cloud.user.service.impl;

import com.yang.cloud.base.service.impl.BaseServiceImpl;
import com.yang.cloud.user.dto.SysUser;
import com.yang.cloud.user.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by yang on 2018/07/22-0022.
 */
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser> implements ISysUserService {
    @Autowired(required = false)
    private PasswordEncoder passwordEncoder;


    @Override
    public void signUp(SysUser user) {
        assert user.getUsername() != null;
        assert user.getUsername().length() > 0;
        assert user.getPassword() != null;
        assert user.getPassword().length() > 6;

        if (passwordEncoder != null) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        }
        mapper.insertSelective(user);
    }
}
