package com.pwms.service;

import java.util.List;

import com.pwms.pojo.Exam;
import com.pwms.pojo.ExamRecord;
import com.pwms.pojo.User;
/**
 * Exam��ExamRecord��������ڸýӿ�
 * @author Administrator
 *
 */
public interface IExamService {
	//��ȡ����
	public Exam getExam(Integer id);
	
	public ExamRecord getExamRecord(Integer id);
	//���濼��
	public void save(Exam exam);
	//���¿���
	public void updateById(Exam exam);
	/**
	 * �޸Ŀ��Գɼ���¼
	 * @param er
	 */
	public void updateExamRecord(ExamRecord er);
	
	public void deleteExamById(Integer id);
	
	public void deleteExamRecordById(Integer id);
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
	/**
	 * �����û�id��ȡ���û����гɼ���¼
	 * @param id
	 * @return
	 */
	public List<ExamRecord> getRecordByUserId(Integer id);
	/**
	 * ��ȡ���п��Լ�¼
	 * @param user
	 * @param exam
	 * @return
	 */
	public List<ExamRecord> selectAll();
	/**
	 * ��ȡ���п����б�
	 * @return
	 */
	public List<Exam> getExamDesc();
	/**
	 * �����û�id��ȡ���û���δ�μӵĿ����б�
	 * @param userId
	 * @return
	 */
	public List<Exam> getExamListByUserId(Integer userId);
	//���㿼�Եĳɼ�
//	public int getGrade();
	//���ؾ���ĳ�������ĳɼ�
//	public int getQuestionGrade(ExamQuestion question , String question);
}
