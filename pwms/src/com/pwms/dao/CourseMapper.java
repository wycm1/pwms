package com.pwms.dao;

import java.util.List;

import com.pwms.pojo.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer id);
    
    int deleteByGroupId(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKeyWithBLOBs(Course record);

    int updateByPrimaryKey(Course record);
    
    List<Course> selectByDate();
    /**
     * ͨ��groupid����ÿγ��б�
     * @param id group��id
     * @return
     */
    List<Course> selectByGroupId(int id);
}