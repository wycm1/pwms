package com.pwms.service;

import java.util.List;

import com.pwms.pojo.CoureseGroup;
import com.pwms.pojo.Course;
import com.pwms.pojo.UserCourseRecord;

public interface ICourseService {
	/**
	 * ��ȡ�γ�
	 * @param id
	 * @return
	 */
	public Course getCourse(Integer id);
	//�������
	public void save(Course course);
	//���¶���
	public void updateById(Course course);
	//��ӿγ̵���
	public void addGroup(CoureseGroup group, Course course);
	//�Ͽμ�¼,����������¼����ô�ø��¼�¼��ʼ�ձ������µ��Ͽμ�¼
	public void addRecord(Course course, UserCourseRecord record);
	
	public List<Course> getCourseByDate();
	/**
	 * ͨ�����id����ȡ�γ�
	 * @return
	 */
	public List<Course> getCourseByGroupId(int groupid);
}
