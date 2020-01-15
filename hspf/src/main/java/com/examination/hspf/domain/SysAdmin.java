package com.examination.hspf.domain;

import lombok.Data;

import java.util.List;

@Data
public class SysAdmin {
    private int id;
    private String username;//账号
    private String password;//密码
    private List<SysRole> sysRoleList;//一个用户具有多个角色
}
