package com.pwms.dao;

import com.pwms.pojo.UserinfoModify;

public interface UserinfoModifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserinfoModify record);

    int insertSelective(UserinfoModify record);

    UserinfoModify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserinfoModify record);

    int updateByPrimaryKey(UserinfoModify record);
}