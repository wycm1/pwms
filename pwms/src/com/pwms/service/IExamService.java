package com.pwms.service;

import com.pwms.pojo.Exam;
import com.pwms.pojo.User;

public interface IExamService {
	//��ȡ����
	public Exam getExam(Integer id);
	//���濼��
	public void save(Exam exam);
	//���¿���
	public void updateById(Exam exam);
	//����ɼ�
	public int getGrade(User user, Exam exam);
}
