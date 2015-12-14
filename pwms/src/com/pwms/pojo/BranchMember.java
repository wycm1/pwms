package com.pwms.pojo;

public class BranchMember {
	
    private Integer id;

    private Integer branchId;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public BranchMember(){}
    public BranchMember(int branchId, int userId){
    	this.branchId=branchId;
    	this.userId=userId;
    }
    
}