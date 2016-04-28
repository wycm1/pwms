package com.pwms.service;

import java.util.List;

import com.pwms.pojo.CoureseGroup;
import com.pwms.pojo.Course;

public interface ICourseGroupService {
	final static int POSITIVE_TYPE=1;
	final static int PARTY_TYPE=2;
	final static int ALL_TYPE=4;
	/**
	 * ��ѯ���еĿγ���
	 * @return
	 */
	public List<CoureseGroup> getCourseGroupList();
	/**
	 * �鿴ĳһ���γ���
	 * @param id
	 * @return
	 */
	public CoureseGroup getCourseGroupById(int id);
//	/**
//	 * �鿴�γ������еĿγ�
//	 * @param id
//	 * @return
//	 */
//	public List<Course> getCourseListById(int id);
	/**
	 * ����һ���γ���
	 * @param group
	 */
	public void addCourseGroup(String name, int type);
	/**
	 * ɾ���γ���
	 * @param id
	 */
	public void deleteGroupById(int id);
//	/**���ӿγ̵��γ���
//	 * 
//	 * @param course
//	 * @param group
//	 */
//	public void addCourse2Group(Course course, CoureseGroup group);
	
	/**
	 * ��ӵ�Ա�γ�
	 * @param name
	 */
	public void addPartyCourse(String name);
	/**
	 * ��ӻ������ӿγ�
	 * @param name
	 */
	public void addPositiveCourse(String name);
	/**
	 * ������еĿγ�
	 * @param name
	 */
	public void addAllCourse(String name);
	
}
