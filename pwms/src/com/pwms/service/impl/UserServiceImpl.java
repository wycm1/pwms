package com.pwms.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.pwms.dao.UserMapper;
import com.pwms.dao.UserinfoMapper;
import com.pwms.dao.UserinfoModifyMapper;
import com.pwms.dao.VerifyUserinfoMapper;
import com.pwms.pojo.User;
import com.pwms.pojo.Userinfo;
import com.pwms.pojo.UserinfoModify;
import com.pwms.pojo.VerifyUserinfo;
import com.pwms.service.IUserService;
import com.pwms.tools.Md5Util;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;
    private VerifyUserinfoMapper verifyuserinfoDao;
    private UserinfoMapper userinfoDao;
    private UserinfoModifyMapper userinfoModifyDao;
    
	public UserinfoModifyMapper getUserinfoModifyDao() {
		return userinfoModifyDao;
	}
	public void setUserinfoModifyDao(UserinfoModifyMapper userinfoModifyDao) {
		this.userinfoModifyDao = userinfoModifyDao;
	}
	public UserinfoMapper getUserinfoDao() {
		return userinfoDao;
	}
	public void setUserinfoDao(UserinfoMapper userinfoDao) {
		this.userinfoDao = userinfoDao;
	}
	public UserMapper getUserDao() {
		return userDao;
	}
	public void setUserDao(UserMapper userDao) {
		this.userDao = userDao;
	}
	public VerifyUserinfoMapper getVerifyuserinfoDao() {
		return verifyuserinfoDao;
	}
	public void setVerifyuserinfoDao(VerifyUserinfoMapper verifyuserinfoDao) {
		this.verifyuserinfoDao = verifyuserinfoDao;
	}
	@Override
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
	@Override
	public boolean chkinfo(String identity, String name, String studentid) {
		// TODO Auto-generated method stub
		List<VerifyUserinfo> verifyUserinfoList = verifyuserinfoDao.selectByVerifyuserinfo(identity, name, studentid);
		System.out.println("verify:"+verifyUserinfoList.get(0).getName());
		if(verifyUserinfoList==null||verifyUserinfoList.size()==0)
		{
			return false;
		}
		return true;
	}
	//����û��û����������Ƿ��Ӧ
	@Override
	public boolean chkpasswd(String loginfo, String password) {
		// TODO Auto-generated method stub
		User user=userDao.selectByNameOrFid(loginfo,password);
		if(user!=null)
		{
			return true;
		}
		return false;
	}
	//��½
	@Override
	public boolean login(HttpSession session, String loginfo, String password) {
		// TODO Auto-generated method stub
		String passwdMd5=Md5Util.Convert2Md5(password);
		User user=userDao.selectByNameOrFid(loginfo,passwdMd5);
		if(user!=null)
		{
			session.setAttribute("user", user);
			return true;
		}
		return false;
	}
	//ע��
	@Override
	public void logout(HttpSession session)
	{
		session.removeAttribute("user");
	}
    //ע���û��������ݿ���user���б���
	@Override
	public boolean register(User user, String identity) {
		// TODO 
		User userDb=userDao.selectByLoginfo(user.getStuOrJobid());
		if(userDb!=null)
		{
			return false;
		}
		String passwordMd5=Md5Util.Convert2Md5(user.getPassword());
		user.setPassword(passwordMd5);
		userDao.insertSelective(user);
		return true;
	}
    //�û���Ϣ��ȫ
	@Override
	public void modifyUserinfo(Userinfo userinfo) {
		// TODO Auto-generated method stub
		UserinfoModify userinfoModify = new UserinfoModify();
		userinfoModify.setUserinfo(userinfo);
		userinfoModify.setAuditingFlag(0);//0:����ˣ�1�����ͨ�� 2 ��˲�ͨ��
		userinfoModifyDao.insertSelective(userinfoModify);
	}
	//����û��޸���Ϣ
	@Override
	public boolean auditUserinfo(UserinfoModify userinfoModify, int auditing) {
		// TODO Auto-generated method stub
		Userinfo userinfo = userinfoDao.selectByUserid(userinfoModify.getUserId());
		if(userinfo != null){
			userinfo.setUserinfoModify(userinfoModify);
			return true;
		}
		else{
			return false;
		}
	}
	@Override
	public int getUseridByStuid(String stuid) {
		// TODO Auto-generated method stub
		return this.userDao.selectdByStuid(stuid).getId();
	}
	@Override
	public void updateById(User user) {
		// TODO Auto-generated method stub
		this.userDao.updateByUserid(user);
	}

}
