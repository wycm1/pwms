package com.pwms.service;

import com.pwms.pojo.Exam;
import com.pwms.pojo.User;

public interface IExamService {
	//获取对象
	public Exam getExam(Integer id);
	//保存考试
	public void save(Exam exam);
	//更新考试
	public void updateById(Exam exam);
	//计算成绩
	public int getGrade(User user, Exam exam);
}
