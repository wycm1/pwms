package com.pwms.service;

import com.pwms.pojo.Userinfo;

public interface IUserinfoService {
	//��ȡUserinfo
	public Userinfo getUserinfo(int StuOrJobid);
	//�޸���Ϣ
	public void updateUserinfo(Userinfo userinfo);
	//����
	public void save(Userinfo userinfo);
	//������һЩ���뵼��֮��Ĺ���
}
