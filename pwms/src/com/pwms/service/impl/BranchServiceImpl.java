package com.pwms.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pwms.dao.BranchMapper;
import com.pwms.dao.BranchMemberMapper;
import com.pwms.dao.UserMapper;
import com.pwms.pojo.Branch;
import com.pwms.pojo.BranchMember;
import com.pwms.pojo.User;
import com.pwms.service.IBranchService;
@Service("branchService")
public class BranchServiceImpl implements IBranchService {
	@Resource
	private BranchMapper branchDao;
	@Resource
	private BranchMemberMapper branchMemberDao;
	@Resource
	private UserMapper userDao;
	public BranchMapper getBranchDao() {
		return branchDao;
	}

	public void setBranchDao(BranchMapper branchDao) {
		this.branchDao = branchDao;
	}

	public BranchMemberMapper getBranchMemberDao() {
		return branchMemberDao;
	}

	public void setBranchMemberDao(BranchMemberMapper branchMemberDao) {
		this.branchMemberDao = branchMemberDao;
	}

	public UserMapper getUserDao() {
		return userDao;
	}

	public void setUserDao(UserMapper userDao) {
		this.userDao = userDao;
	}

	@Override
	public Branch getBranch(Integer id) {
		// TODO Auto-generated method stub
		return this.branchDao.selectByPrimaryKey(id);
	}

	@Override
	public void save(Branch branch) {
		// TODO Auto-generated method stub
		this.branchDao.insertSelective(branch);
	}

	@Override
	public void update(Branch branch) {
		// TODO Auto-generated method stub
		this.branchDao.updateByPrimaryKeySelective(branch);
	}

	@Override
	public void addMember(Branch branch, User user) {
		// TODO Auto-generated method stub
		BranchMember branchMember = new BranchMember(branch.getId(),user.getId());
		BranchMember branchMemberTmp  =branchMemberDao.selectSelective(branchMember);
		if(branchMemberTmp==null){
		    branchMemberDao.insertSelective(branchMember);
		}
	}

//	@Override
//	public void publishNotice(Branch branch, NoticeTheroyContruction notice) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public List<User> getBranchMember(Branch branch) {
		// TODO Auto-generated method stub
		List<BranchMember> branchMemberList = this.branchMemberDao.selectByBranchId(branch);
		if(branchMemberList == null||branchMemberList.size()==0){
		    return null;
		}
		List<User> userList = new ArrayList<User>();
		for(int i=0;i<branchMemberList.size();i++){
			BranchMember bMember = branchMemberList.get(i);
			int userId = bMember.getUserId();
			User user = userDao.selectByPrimaryKey(userId);
			if(user!=null){
			    userList.add(user);
			}
		}
		return userList;
	}

	@Override
	public boolean isMember(Branch branch, User user) {
		// TODO Auto-generated method stub
		BranchMember bMember = new BranchMember(branch.getId(), user.getId());
		BranchMember bMemberTmp=branchMemberDao.selectSelective(bMember);
		if(bMemberTmp==null){
		    return false;
		}
		return true;
	}

	@Override
	public Branch getUserBranch(User user) {
		// TODO Auto-generated method stub
		BranchMember bMember = this.branchMemberDao.selectByUserId(user);
//		int branchid = bMember.getBranchId();
		Branch branch = branchDao.selectByPrimaryKey(bMember.getBranchId());
		return branch;
	}

	@Override
	public List<Branch> findAll() {
		// TODO Auto-generated method stub
		return branchDao.findAll();
	}

}
