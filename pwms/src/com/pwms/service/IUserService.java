package com.pwms.service;


import javax.servlet.http.HttpSession;

import com.pwms.pojo.User;
import com.pwms.pojo.Userinfo;
import com.pwms.pojo.UserinfoModify;

public interface IUserService {
    public User getUserById(int userId);
    //ע��ʱ������Ƿ������
    public boolean chkinfo(String identity, String name, String studentid);
    //����Ƿ�������û��Լ������Ƿ���ȷ
    public boolean chkpasswd(String loginfo, String password);
    public boolean login(HttpSession session, String loginfo, String password);
    public boolean register(User user, String identity);
    public void logout(HttpSession session);
    public void modifyUserinfo(Userinfo userinfo);
    /**
     * ����û��޸���Ϣ
     * @param auditing 0:����ˣ�1�����ͨ�� 2 ��˲�ͨ�� 
     * @return 
     */
    public boolean auditUserinfo(UserinfoModify userinfoModify, int auditing);
    
    public int getUseridByStuid(String stuid);
    
    public void updateById(User user);
//    public boolean importXlsToVerify(File file);
}
