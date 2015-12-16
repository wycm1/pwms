package com.pwms.dao;

import java.util.List;

import com.pwms.pojo.ImportDoc;

public interface ImportDocMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImportDoc record);

    int insertSelective(ImportDoc record);

    ImportDoc selectByPrimaryKey(Integer id);
    /**
     * 获得所有的对象List，按时间的降序排列
     * @return
     */
    List<ImportDoc> selectAll();

    int updateByPrimaryKeySelective(ImportDoc record);

    int updateByPrimaryKeyWithBLOBs(ImportDoc record);

    int updateByPrimaryKey(ImportDoc record);
}