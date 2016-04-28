package com.pwms.service;

import java.util.List;

import com.pwms.pojo.TheoryCourse;

public interface ITheoryCourseService {
	//�������
	public void save(TheoryCourse tc);
	//���¶���
	public void updateById(TheoryCourse tc);
	//ɾ������ 
	public void deleteById(TheoryCourse tc);
	//��ȡ����
	public TheoryCourse getTheoryCourseById(Integer id);
	/**
	 * ���пγ�
	 * @param id
	 * @return
	 */
	public List<TheoryCourse> getTheoryCourseList();
	/**
	 * ��ȡ����top5���ۿγ�
	 * @return
	 */
	public List<TheoryCourse> selectTopCourse();

}
