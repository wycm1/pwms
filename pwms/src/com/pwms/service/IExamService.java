package com.pwms.service;

import java.util.List;

import com.pwms.pojo.Exam;
import com.pwms.pojo.ExamRecord;
import com.pwms.pojo.User;

public interface IExamService {
	//获取对象
	public Exam getExam(Integer id);
	//保存考试
	public void save(Exam exam);
	//更新考试
	public void updateById(Exam exam);
	public void deleteExamById(Integer id);
	/**
	 * 查看考试的最新成绩  如果返回值是-1  则没有考试的记录
	 * @param user
	 * @param exam
	 * @return
	 */
	public int getGrade(User user, Exam exam);
	/**
	 * 增加一个新的考试完成的记录
	 * @param examRecord
	 */
	public void addRecord(ExamRecord examRecord);
	/**
	 * 获取用户的所有的考试记录列表
	 * @param user
	 * @return
	 */
	public List<ExamRecord> getRecord(User user);
	/**
	 * 获取用户某个考试的记录
	 * @param user
	 * @param exam
	 * @return
	 */
	public List<ExamRecord> getRecordByUserExam(User user, Exam exam);
	//按时间获取考试列表
	public List<Exam> getExamDesc();
	//计算考试的成绩
//	public int getGrade();
	//返回具体某个题的题的成绩
//	public int getQuestionGrade(ExamQuestion question , String question);
}
