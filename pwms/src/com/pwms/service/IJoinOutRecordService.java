package com.pwms.service;

import com.pwms.pojo.JoinOutRecord;

public interface IJoinOutRecordService {
	//�������
	public void save(JoinOutRecord joinrecord);
	//���¶���
	public void update(JoinOutRecord joinrecord);
	//��ȡ����
	public JoinOutRecord getJoinOutRecord(int id);
	
}
