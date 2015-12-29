package com.pwms.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.pwms.pojo.ExamQuestion;
import com.pwms.service.IExamQuestionService;
@Service("examQuestionService")
public class ExamQuestionServiceImpl implements IExamQuestionService{

	@Override
	public List<ExamQuestion> getQuestionsByExamId(int examid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveQuestion(ExamQuestion examQuestion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ExamQuestion getExamQuestionByExamId(int examid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getQuestionGrade(int questionId, String question) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calcExamGrade(int examId, Map<Integer, String> answer) {
		// TODO Auto-generated method stub
		return 0;
	}

}
