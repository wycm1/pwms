package com.pwms.dao;

import java.util.List;

import com.pwms.pojo.NoticeTheroyContruction;

public interface NoticeTheroyContructionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NoticeTheroyContruction record);

    int insertSelective(NoticeTheroyContruction record);

    NoticeTheroyContruction selectByPrimaryKey(Integer id);
    /**
     * 根据类型查找文章，根据时间降序排列
     * @param type
     * @return
     */
    List<NoticeTheroyContruction> selectByType(Integer type);

    int updateByPrimaryKeySelective(NoticeTheroyContruction record);

    int updateByPrimaryKeyWithBLOBs(NoticeTheroyContruction record);

    int updateByPrimaryKey(NoticeTheroyContruction record);
}