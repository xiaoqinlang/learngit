package com.examination.hspf.domain;

import lombok.Data;

import java.util.List;

/**
 * 系统权限
 */

@Data
public class SysPermission {
    private int pid;
    private String perName;//权限名称
    private List<SysRole> sysRoleList;//角色关系，一个权限对应多个角色

}
