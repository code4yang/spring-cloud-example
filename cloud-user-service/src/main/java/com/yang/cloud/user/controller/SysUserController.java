package com.yang.cloud.user.controller;

import com.yang.cloud.user.dto.SysUser;
import com.yang.cloud.user.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yang on 2018/07/22-0022.
 */
@RestController
@RequestMapping("/sys/user")
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;

    @GetMapping("/selectAll")
    private ResponseEntity<List<SysUser>> selectAll() {
        return ResponseEntity.ok(sysUserService.select(null));
    }

    @PostMapping("/select")
    private ResponseEntity<List<SysUser>> select(@RequestBody SysUser user) {
        return ResponseEntity.ok(sysUserService.select(user));
    }

    @PostMapping("/signUp")
    private ResponseEntity signUn(@RequestBody SysUser user){
        sysUserService.signUp(user);
        return ResponseEntity.ok().build();
    }
}
