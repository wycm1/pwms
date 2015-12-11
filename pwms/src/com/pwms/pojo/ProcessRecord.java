package com.pwms.pojo;

import java.util.Date;

public class ProcessRecord {
    private Integer id;

    private Integer processId;

    private String filepath;

    private Integer grade;

    private Date dateline;

    private int UserId;
    public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getDateline() {
        return dateline;
    }

    public void setDateline(Date dateline) {
        this.dateline = dateline;
    }
}