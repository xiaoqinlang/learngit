package com.examination.hspf.domain;

import lombok.Data;

import java.util.List;

/**
 * 系统角色
 */
@Data
public class SysRole {
    private int id;
    private String roleName;//角色表示程序中判断使用，角色名称
    //角色关系，一个角色对应多个用户
    private List<SysAdmin> userlist;
    //权限关系，一个角色对应多个权限
    private List<SysPermission> perlist;
}
