package com.pwms.service;

import com.pwms.pojo.Userinfo;

public interface IUserinfoService {
	//获取Userinfo
	public Userinfo getUserinfo(int StuOrJobid);
/**
 * 通过userid得到userinfo对象
 * @param userId 
 * @return Userinfo对象
 */
	public Userinfo getUserinfoByUserid(int userId);
	//修改信息
	public void updateUserinfo(Userinfo userinfo);
	//保存
	public void save(Userinfo userinfo);
	//再增加一些导入导出之类的功能
}
