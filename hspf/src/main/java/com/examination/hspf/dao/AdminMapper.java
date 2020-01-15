package com.examination.hspf.dao;

import com.examination.hspf.domain.SysAdmin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    public SysAdmin selectByUsername(String username);

}
