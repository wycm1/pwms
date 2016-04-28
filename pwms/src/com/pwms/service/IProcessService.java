package com.pwms.service;

import java.util.List;

import com.pwms.pojo.ProcessRecord;
import com.pwms.pojo.User;
import com.pwms.pojo.Process;

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
	public List<ProcessRecord> getUserProcessRecord(User user);
	//�鿴�Ƿ����ĳ������
	public boolean isComplete(User user, Process process);
	/**
	 * ��ȡ���еĽ��ȣ����������
	 * @return
	 */
	public List<Process> getProcessList();
}
