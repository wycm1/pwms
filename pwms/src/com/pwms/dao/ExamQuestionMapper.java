package com.pwms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pwms.pojo.ExamQuestion;

public interface ExamQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamQuestion record);

    int insertSelective(ExamQuestion record);

    ExamQuestion selectByPrimaryKey(Integer id);
    
    List<ExamQuestion> selectByExamId(Integer examid);
    /**
     * ���ݿ���id�����ȡcount��������
     * @param count Ҫ��ѯ������
     * @param examId ����id
     * @return count��������Ŀ
     */
    List<ExamQuestion> randomSelectByExamId(@Param("count")Integer count,@Param("examid")Integer examid);
    /**
     * ��ȡȫ��������Ŀ
     * @return
     */
    List<ExamQuestion> selectAll();

    int updateByPrimaryKeySelective(ExamQuestion record);

    int updateByPrimaryKeyWithBLOBs(ExamQuestion record);

    int updateByPrimaryKey(ExamQuestion record);
    
    
}