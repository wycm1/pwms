package com.pwms.dao;

import com.pwms.pojo.JoinOutRecord;

public interface JoinOutRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JoinOutRecord record);

    int insertSelective(JoinOutRecord record);

    JoinOutRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JoinOutRecord record);

    int updateByPrimaryKey(JoinOutRecord record);
}