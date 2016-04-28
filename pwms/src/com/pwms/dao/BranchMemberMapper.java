package com.pwms.dao;

import java.util.List;

import com.pwms.pojo.Branch;
import com.pwms.pojo.BranchMember;
import com.pwms.pojo.User;

public interface BranchMemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BranchMember record);

    int insertSelective(BranchMember record);

    BranchMember selectByPrimaryKey(Integer id);
    
    //ͨ���û�id��ȡ����
    BranchMember selectByUserId(User user);

    int updateByPrimaryKeySelective(BranchMember record);

    int updateByPrimaryKey(BranchMember record);
    
    //�Զ��壬�д����
    BranchMember  selectSelective(BranchMember record);
    //��ȡ��֧�������еĶ���
    List<BranchMember>  selectByBranchId(Branch record);
    
}