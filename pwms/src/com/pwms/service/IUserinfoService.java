package com.pwms.service;

import com.pwms.pojo.Userinfo;

public interface IUserinfoService {
	//��ȡUserinfo
	public Userinfo getUserinfo(int StuOrJobid);
/**
 * ͨ��userid�õ�userinfo����
 * @param userId 
 * @return Userinfo����
 */
	public Userinfo getUserinfoByUserid(int userId);
	//�޸���Ϣ
	public void updateUserinfo(Userinfo userinfo);
	//����
	public void save(Userinfo userinfo);
	//������һЩ���뵼��֮��Ĺ���
}
