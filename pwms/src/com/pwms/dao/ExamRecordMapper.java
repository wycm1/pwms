package com.pwms.dao;

import java.util.List;

import com.pwms.pojo.ExamRecord;

public interface ExamRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamRecord record);

    int insertSelective(ExamRecord record);

    ExamRecord selectByPrimaryKey(Integer id);
    
    List<ExamRecord> selectByUserid(Integer userId);
    /**
     * ͨ���û�id�Ϳ���id����ȡ����ʱ�併�����е�List
     * @param examId
     * @param userId
     * @return
     */
    List<ExamRecord> selectByExamidUserid(Integer examId, Integer userId);
    /**
     * ��ȡ���п��Լ�¼�б�
     * @return
     */
    List<ExamRecord> selectAll();
    
    int updateByPrimaryKeySelective(ExamRecord record);

    int updateByPrimaryKey(ExamRecord record);
}