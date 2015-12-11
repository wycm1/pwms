package com.pwms.dao;

import com.pwms.pojo.ImportDoc;

public interface ImportDocMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImportDoc record);

    int insertSelective(ImportDoc record);

    ImportDoc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImportDoc record);

    int updateByPrimaryKeyWithBLOBs(ImportDoc record);

    int updateByPrimaryKey(ImportDoc record);
}