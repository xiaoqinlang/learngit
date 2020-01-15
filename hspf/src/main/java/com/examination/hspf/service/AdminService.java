package com.examination.hspf.service;

import com.examination.hspf.domain.SysAdmin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    SysAdmin findByUsername(String username);
}
