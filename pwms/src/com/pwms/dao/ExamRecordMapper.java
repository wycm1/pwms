package com.pwms.dao;

import java.util.List;

import com.pwms.pojo.ExamRecord;

public interface ExamRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamRecord record);

    int insertSelective(ExamRecord record);

    ExamRecord selectByPrimaryKey(Integer id);
    
    List<ExamRecord> selectByUserid(Integer userId);
    
    List<ExamRecord> selectByExamidUserid(Integer examId, Integer userId);

    int updateByPrimaryKeySelective(ExamRecord record);

    int updateByPrimaryKey(ExamRecord record);
}