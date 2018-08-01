package com.yang.cloud.user.dto;

import com.yang.cloud.base.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by yang on 2018/07/22-0022.
 */
@Getter
@Setter
public class SysUser extends BaseDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String nickname;
    private String password;
    private String email;
    private Date lastChangePassword;
    private Boolean enable;
}
