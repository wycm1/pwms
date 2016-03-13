package com.pwms.service;

import java.util.List;

import com.pwms.pojo.Exam;
import com.pwms.pojo.ExamRecord;
import com.pwms.pojo.User;

public interface IExamService {
	//��ȡ����
	public Exam getExam(Integer id);
	//���濼��
	public void save(Exam exam);
	//���¿���
	public void updateById(Exam exam);
	public void deleteExamById(Integer id);
	/**
	 * �鿴���Ե����³ɼ�  �������ֵ��-1  ��û�п��Եļ�¼
	 * @param user
	 * @param exam
	 * @return
	 */
	public int getGrade(User user, Exam exam);
	/**
	 * ����һ���µĿ�����ɵļ�¼
	 * @param examRecord
	 */
	public void addRecord(ExamRecord examRecord);
	/**
	 * ��ȡ�û������еĿ��Լ�¼�б�
	 * @param user
	 * @return
	 */
	public List<ExamRecord> getRecord(User user);
	/**
	 * ��ȡ�û�ĳ�����Եļ�¼
	 * @param user
	 * @param exam
	 * @return
	 */
	public List<ExamRecord> getRecordByUserExam(User user, Exam exam);
	//��ʱ���ȡ�����б�
	public List<Exam> getExamDesc();
	//���㿼�Եĳɼ�
//	public int getGrade();
	//���ؾ���ĳ�������ĳɼ�
//	public int getQuestionGrade(ExamQuestion question , String question);
}
