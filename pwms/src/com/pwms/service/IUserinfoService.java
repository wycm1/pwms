package com.pwms.service;

import java.util.List;

import com.pwms.pojo.User;
import com.pwms.pojo.Userinfo;
import com.pwms.pojo.UserinfoModify;

public interface IUserinfoService {
	//��ȡUserinfo
	public Userinfo getUserinfo(int StuOrJobid);
	/**
	 * ͨ��userid�õ�userinfo����
	 * @param userId 
	 * @return Userinfo����
	 */
	public Userinfo getUserinfoByUserid(int userId);
	/**
	 * ͨ��id��ѯ�޸ļ�¼
	 * @param id
	 * @return
	 */
	public UserinfoModify getUserinfoModifyByid(int id);
	//�޸���Ϣ
	public void updateUserinfo(Userinfo userinfo);
	//����
	public void save(Userinfo userinfo);
	//������һЩ���뵼��֮��Ĺ���
	/**
	 * ��ȡ��֧����δ��˵���Ϣ�޸�
	 * @param user
	 * @return
	 */
	public List<UserinfoModify> getModifyNotEffect(User user);
	/**
	 * ��ȡ��֧������ͬ��־����Ϣ
	 * @param user
	 * @param flag
	 * @return
	 */
	public List<UserinfoModify> getModifyByUserFlag(User user, int flag);
	/**
	 * ������Ϣ�޸�
	 * @param modify,�������ݿ��ѯ�Ķ��󣬲���Ҫ�޸�
	 * @param flag����־ 0��δ��� 1�� ���ͨ�� 2��δͨ��
	 * @param msg��
	 */
	public void dealModify(UserinfoModify modify, int flag, String msg);
	/**
	 * ͨ����Ϣ�޸�
	 * @param modify
	 */
	public void dealPass(UserinfoModify modify);
	/**
	 * ��ͨ����Ϣ�޸�
	 * @param modify
	 */
	public void dealNotPass(UserinfoModify modify, String msg);
}
