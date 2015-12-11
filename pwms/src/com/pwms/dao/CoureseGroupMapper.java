package com.pwms.dao;

import com.pwms.pojo.CoureseGroup;

public interface CoureseGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CoureseGroup record);

    int insertSelective(CoureseGroup record);

    CoureseGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CoureseGroup record);

    int updateByPrimaryKey(CoureseGroup record);
}