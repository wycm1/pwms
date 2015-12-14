package com.pwms.service.impl;

import javax.annotation.Resource;

import com.pwms.dao.CourseMapper;
import com.pwms.dao.UserCourseRecordMapper;
import com.pwms.pojo.CoureseGroup;
import com.pwms.pojo.Course;
import com.pwms.pojo.UserCourseRecord;
import com.pwms.service.ICourseService;

public class CourseServiceImpl implements ICourseService {
	@Resource
	private CourseMapper courseDao;
	private UserCourseRecordMapper userCourseRecordDao;
//	private UserCourseRecordMapper courseGroupDao;
	@Override
	public Course getCourse(Integer id) {
		// TODO Auto-generated method stub
		return this.courseDao.selectByPrimaryKey(id);
	}

	public CourseMapper getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseMapper courseDao) {
		this.courseDao = courseDao;
	}

	public UserCourseRecordMapper getUserCourseRecordDao() {
		return userCourseRecordDao;
	}

	public void setUserCourseRecordDao(UserCourseRecordMapper userCourseRecordDao) {
		this.userCourseRecordDao = userCourseRecordDao;
	}

	@Override
	public void save(Course course) {
		// TODO Auto-generated method stub
		this.courseDao.insertSelective(course);
	}

	@Override
	public void updateById(Course course) {
		// TODO Auto-generated method stub
		this.courseDao.updateByPrimaryKeySelective(course);
	}

	@Override
	public void addGroup(CoureseGroup group, Course course) {
		// TODO Auto-generated method stub
		course.setGroupId(group.getId());
		this.updateById(course);
	}

	@Override
	public void addRecord(Course course, UserCourseRecord record) {
		// TODO Auto-generated method stub
		record.setCourseId(course.getId());
		userCourseRecordDao.insertSelective(record);
	}

}
