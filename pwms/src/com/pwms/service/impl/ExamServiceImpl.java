package com.pwms.service.impl;

import javax.annotation.Resource;

import com.pwms.dao.ExamMapper;
import com.pwms.pojo.Exam;
import com.pwms.pojo.User;
import com.pwms.service.IExamService;

public class ExamServiceImpl implements IExamService {
	@Resource
	private ExamMapper examDao;
//	private ExamRecordMapper examRecordDao;
	@Override
	public Exam getExam(Integer id) {
		// TODO Auto-generated method stub
		return this.examDao.selectByPrimaryKey(id);
	}

	@Override
	public void save(Exam exam) {
		// TODO Auto-generated method stub
		this.examDao.insertSelective(exam);
	}

	@Override
	public void updateById(Exam exam) {
		// TODO Auto-generated method stub
		this.examDao.updateByPrimaryKeySelective(exam);
	}

	@Override
	public int getGrade(User user, Exam exam) {
		// TODO Auto-generated method stub
		return 0;
	}

}
