package com.pwms.service;

import java.util.List;

import com.pwms.pojo.JoinOutRecord;

public interface IJoinOutRecordService {
	public List<JoinOutRecord> findAll();
	//�������
	public void save(JoinOutRecord joinrecord);
	//���¶���
	public void update(JoinOutRecord joinrecord);
	//��ȡ����
	public JoinOutRecord getJoinOutRecord(int id);
	
}
