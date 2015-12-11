package com.pwms.service;

import com.pwms.pojo.ProcessRecord;
import com.pwms.pojo.User;

public interface IProcessService {
	//��ȡ��������
	public Process getProcess(Integer id);
	//�����������
	public void save(Process process);
	//���½�������
	public void updateById(Process process);
	//����û���ɽ��ȵļ�¼  ���Ǳ������µļ�¼
	public void addProcessRecord(ProcessRecord precord, User user);
	//��ȡ�û����¼�¼��
	public int getLastProcessNum(User user);
	//��ȡ�û����еļ�¼
	public ProcessRecord getUserProcessRecord(User user);
	//�鿴�Ƿ����ĳ������
	public boolean isComplete(User user, Process process);
}
