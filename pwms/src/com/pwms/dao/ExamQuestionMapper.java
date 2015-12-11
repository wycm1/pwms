package com.pwms.dao;

import com.pwms.pojo.ExamQuestion;

public interface ExamQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamQuestion record);

    int insertSelective(ExamQuestion record);

    ExamQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamQuestion record);

    int updateByPrimaryKeyWithBLOBs(ExamQuestion record);

    int updateByPrimaryKey(ExamQuestion record);
}