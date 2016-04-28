package com.pwms.service;

import com.pwms.pojo.ExamQuestion;
import com.pwms.pojo.User;
import com.pwms.pojo.UserAnswerResult;

public interface IUserAnswerResultService {
	//��ȡʵ��
	public UserAnswerResult getUserAnswerResult(Integer answerid);
	//����ʵ��
	public void updateById(UserAnswerResult userAnswerResult);
	//����ʵ��
	public void save(UserAnswerResult userAnswerResult);
	//�ж��Ƿ���ȷ 
	public boolean isRight(UserAnswerResult userAnswerResult, ExamQuestion question);
	//�û�����
	public void answerQuestion(User user, UserAnswerResult userAnswerResult);
	

}
