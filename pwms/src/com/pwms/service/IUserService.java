package com.pwms.service;

import javax.servlet.http.HttpSession;

import com.pwms.pojo.User;

public interface IUserService {
    public User getUserById(int userId);
    //注册时，检查是否有这个
    public boolean chkinfo(String identity, String name, String studentid);
    //检查是否有这个用户以及密码是否正确
    public boolean chkpasswd(String loginfo, String password);
    public boolean login(HttpSession session, String loginfo, String password);
    public boolean register(User user, String identity);
    public void logout(HttpSession session);
    //public void completeUserinfo(Userinfo userinfo);
}
