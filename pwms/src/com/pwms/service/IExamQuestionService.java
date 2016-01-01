package com.pwms.service;

import java.util.List;
import java.util.Map;

import com.pwms.pojo.ExamQuestion;
import com.pwms.pojo.User;

public interface IExamQuestionService {
	/**����examid��ȡquestion�б�
	 * @param examid
	 * @return
	 */
	 public List<ExamQuestion> getQuestionsByExamId(int examid);
	 /**
	  * ����ʵ��
	  * @param examQuestion
	  */
	 public void saveQuestion(ExamQuestion examQuestion);
	 /**
	  * ����id��ȡ����
	  * @param examid
	  * @return
	  */
	 public ExamQuestion getExamQuestionById(int id);
	 /**
	  * ���ݴ𰸷��ر���ĳɼ�
	  * @param questionId
	  * @param question
	  * @return
	  */
	 public int getQuestionGrade(int questionId, String question);
	 /**
	  * ����Map������ÿ��Եĳɼ�
	  * @param examId
	  * @param answer
	  * @return
	  */
	 public int calcExamGrade(Map<Integer , String> answers );
	 /**
	  * ���濼�Եļ�¼
	  * @param examId
	  * @param score
	  * @param user
	  */
	 public void save2Record(int examId, int score, User user);
	 /**
	  * ����ɼ������濼�Լ�¼
	  * @param examId
	  * @param answers
	  * @param user
	  */
	 public int calcGrade2Record(int examId, Map<Integer , String> answers, User user);
}
