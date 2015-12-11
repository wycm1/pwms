package com.pwms.service;

import com.pwms.pojo.JoinOutRecord;

public interface IJoinOutRecordService {
	//保存对象
	public void save(JoinOutRecord joinrecord);
	//更新对象
	public void update(JoinOutRecord joinrecord);
	//获取对象
	public JoinOutRecord getJoinOutRecord(int id);
	
}
