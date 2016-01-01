package com.pwms.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pwms.dao.ExamMapper;
import com.pwms.dao.ExamQuestionMapper;
import com.pwms.dao.ExamRecordMapper;
import com.pwms.pojo.Exam;
import com.pwms.pojo.ExamQuestion;
import com.pwms.pojo.ExamRecord;
import com.pwms.pojo.User;
import com.pwms.service.IExamQuestionService;

@Service("examQuestionService")
public class ExamQuestionServiceImpl implements IExamQuestionService {
	@Resource
	private ExamQuestionMapper examQuestionDao;
	@Resource
	private ExamMapper examDao;
	@Resource
	private ExamRecordMapper examRecordDao;

	public ExamQuestionMapper getExamQuestionDao() {
		return examQuestionDao;
	}

	public void setExamQuestionDao(ExamQuestionMapper examQuestionDao) {
		this.examQuestionDao = examQuestionDao;
	}

	public ExamMapper getExamDao() {
		return examDao;
	}

	public void setExamDao(ExamMapper examDao) {
		this.examDao = examDao;
	}

	public ExamRecordMapper getExamRecordDao() {
		return examRecordDao;
	}

	public void setExamRecordDao(ExamRecordMapper examRecordDao) {
		this.examRecordDao = examRecordDao;
	}

	@Override
	public List<ExamQuestion> getQuestionsByExamId(int examid) {
		// TODO Auto-generated method stub
		return this.examQuestionDao.selectByExamId(examid);
	}

	@Override
	public void saveQuestion(ExamQuestion examQuestion) {
		// TODO Auto-generated method stub
		this.examQuestionDao.insertSelective(examQuestion);
	}

	@Override
	public int getQuestionGrade(int questionId, String anwser) {
		// TODO Auto-generated method stub
		ExamQuestion questionObj = this.examQuestionDao
				.selectByPrimaryKey(questionId);
		Exam exam = this.examDao.selectByPrimaryKey(questionObj.getExamId());
		if(exam==null){
			return 0;
		}
		if (questionObj.getAnswer().equals(anwser)) {
			return exam.getSingleScore();
		} else {
			return 0;
		}
	}

	@Override
	public int calcExamGrade(Map<Integer, String> answers) {
		// TODO Auto-generated method stub
		int sumScore = 0;
		// List<ExamQuestion> questionList =
		// this.examQuestionDao.selectByExamId(examId);
		for (Map.Entry<Integer, String> entry : answers.entrySet()) {
			int score = getQuestionGrade(entry.getKey(), entry.getValue());
			sumScore = sumScore + score;
		}
		return sumScore;
	}

	@Override
	public ExamQuestion getExamQuestionById(int id) {
		// TODO Auto-generated method stub
		return this.examQuestionDao.selectByPrimaryKey(id);
	}

	@Override
	public void save2Record(int examId, int score, User user) {
		// TODO Auto-generated method stub
		Date date = new Date();
		ExamRecord record = new ExamRecord();
		record.setExamId(examId);
		record.setScore(score);
		record.setUserId(user.getId());
		record.setTime(date);
		examRecordDao.insertSelective(record);
	}

	@Override
	public int calcGrade2Record(int examId, Map<Integer, String> answers, User user) {
		// TODO Auto-generated method stub
		int score = calcExamGrade(answers);
		save2Record(examId, score, user);
		return score;
	}

}
