package com.pwms.service;

import com.pwms.pojo.ExamQuestion;
import com.pwms.pojo.User;
import com.pwms.pojo.UserAnswerResult;

public interface IUserAnswerResultService {
	//获取实例
	public UserAnswerResult getUserAnswerResult();
	//更新实体
	public void updateById(UserAnswerResult userAnswerResult);
	//保存实体
	public void save(UserAnswerResult userAnswerResult);
	//判断是否正确 ,正确返回1  错误返回0
	public int isRight(UserAnswerResult userAnswerResult, ExamQuestion question);
	//用户答题
	public void answerQuestion(User user, UserAnswerResult userAnswerResult);
	

}
