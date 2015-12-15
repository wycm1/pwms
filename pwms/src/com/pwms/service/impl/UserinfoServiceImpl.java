package com.pwms.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pwms.dao.UserinfoMapper;
import com.pwms.pojo.Userinfo;
import com.pwms.service.IUserinfoService;

@Service("userinfoService")
public class UserinfoServiceImpl implements IUserinfoService {

	@Resource
	private UserinfoMapper userinfoDao;
	public UserinfoMapper getUserinfoDao() {
		return userinfoDao;
	}

	public void setUserinfoDao(UserinfoMapper userinfoDao) {
		this.userinfoDao = userinfoDao;
	}

	@Override
	public Userinfo getUserinfo(int StuOrJobid) {
		// TODO Auto-generated method stub
		return this.userinfoDao.selectByStuOrJobId(StuOrJobid);
	}

	@Override
	public void updateUserinfo(Userinfo userinfo) {
		// TODO Auto-generated method stub
		userinfoDao.updateByPrimaryKeySelective(userinfo);
	}

	@Override
	public void save(Userinfo userinfo) {
		// TODO Auto-generated method stub
		userinfoDao.insertSelective(userinfo);
	}
   
}
