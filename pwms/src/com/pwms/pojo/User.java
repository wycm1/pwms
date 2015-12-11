package com.pwms.pojo;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private String StuOrJobid;
    private String password;
    private Date registerTime;
    public Integer getId() {
		return id;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuOrJobid() {
		return StuOrJobid;
	}
	public void setStuOrJobid(String stuOrJobid) {
		StuOrJobid = stuOrJobid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	private Integer processId;
    public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}
	private Integer type;
   
}