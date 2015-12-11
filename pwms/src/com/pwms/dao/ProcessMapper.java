package com.pwms.dao;

import com.pwms.pojo.Process;

public interface ProcessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Process record);

    int insertSelective(Process record);

    Process selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Process record);

    int updateByPrimaryKeyWithBLOBs(Process record);
}