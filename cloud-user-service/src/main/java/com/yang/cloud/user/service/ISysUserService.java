package com.yang.cloud.user.service;

import com.yang.cloud.base.service.IBaseService;
import com.yang.cloud.user.dto.SysUser;

/**
 * Created by yang on 2018/07/22-0022.
 */
public interface ISysUserService extends IBaseService<SysUser> {
    void signUp(SysUser user);
}
