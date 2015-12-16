package com.pwms.dao;

import com.pwms.pojo.NoticeTheroyContruction;

public interface NoticeTheroyContructionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NoticeTheroyContruction record);

    int insertSelective(NoticeTheroyContruction record);

    NoticeTheroyContruction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NoticeTheroyContruction record);

    int updateByPrimaryKeyWithBLOBs(NoticeTheroyContruction record);

    int updateByPrimaryKey(NoticeTheroyContruction record);
}