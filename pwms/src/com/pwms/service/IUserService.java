package com.pwms.service;

import javax.servlet.http.HttpSession;

import com.pwms.pojo.User;

public interface IUserService {
    public User getUserById(int userId);
    //ע��ʱ������Ƿ������
    public boolean chkinfo(String identity, String name, String studentid);
    //����Ƿ�������û��Լ������Ƿ���ȷ
    public boolean chkpasswd(String loginfo, String password);
    public boolean login(HttpSession session, String loginfo, String password);
    public boolean register(User user, String identity);
    public void logout(HttpSession session);
    //public void completeUserinfo(Userinfo userinfo);
}
