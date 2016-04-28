package com.pwms.dao;

import java.util.List;

import com.pwms.pojo.TheoryCourse;

public interface TheoryCourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TheoryCourse record);

    int insertSelective(TheoryCourse record);

    TheoryCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TheoryCourse record);

    int updateByPrimaryKeyWithBLOBs(TheoryCourse record);

    int updateByPrimaryKey(TheoryCourse record);
    /**
     * ��ȡȫ�����ۿγ�
     * @return
     */
    List<TheoryCourse> selectAll();
    /**
     * ��ȡ����top5���ۿγ�
     * @return
     */
    List<TheoryCourse> selectTopCourse();
}