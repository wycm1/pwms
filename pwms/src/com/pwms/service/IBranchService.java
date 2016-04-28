package com.pwms.service;

import java.util.List;

import com.pwms.pojo.Branch;
import com.pwms.pojo.BranchMember;
//import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.pojo.User;

public interface IBranchService {
	//��ȡ֧������
	public Branch getBranch(Integer id);
	//�������
	public void save(Branch branch);
	//���¶���
	public void update(Branch branch);
	//���ӳ�Ա
	public void addMember(Branch branch, User user);
    //����֧������
//	public void publishNotice(Branch branch, NoticeTheroyContruction notice);
	//��ȡ֧����Ա
	public List<BranchMember> getBranchMember(Branch branch);
	//����Ƿ���֧����Ա
	public boolean isMember(Branch branch, User user);
	//��ȡ�û�֧��
	public Branch getUserBranch(User user);

	public List<Branch> findAll();
	
	public List<Branch> findByName(String name);
}
