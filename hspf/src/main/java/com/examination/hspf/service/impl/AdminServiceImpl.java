package com.examination.hspf.service.impl;

import com.examination.hspf.dao.AdminMapper;
import com.examination.hspf.domain.SysAdmin;
import com.examination.hspf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    /**
     * 根据用户名找到
     * @param username
     * @return
     */
    @Override
    public SysAdmin findByUsername(String username) {
        return adminMapper.selectByUsername(username);
    }
}
