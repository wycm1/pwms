package com.pwms.service;

import java.util.List;
import java.util.Map;

import com.pwms.pojo.ExamQuestion;

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
	 public ExamQuestion getExamQuestionByExamId(int examid);
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
	 public int calcExamGrade(int examId, Map<Integer , String> answer );
}
