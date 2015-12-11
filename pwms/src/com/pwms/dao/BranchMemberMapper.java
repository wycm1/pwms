package com.pwms.dao;

import com.pwms.pojo.BranchMember;

public interface BranchMemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BranchMember record);

    int insertSelective(BranchMember record);

    BranchMember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BranchMember record);

    int updateByPrimaryKey(BranchMember record);
}