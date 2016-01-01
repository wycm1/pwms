package com.pwms.service;

import java.util.List;

import com.pwms.pojo.NoticeTheroyContruction;

public interface INoticeService {
	final static int NOTICE_TYPE = 1;
	final static int THEORY_TYPE = 2;
	final static int PARTY_TYPE = 4;
	/**
	 * �������
	 * @param notice
	 */
	public void save(NoticeTheroyContruction notice);
	/**
	 * ͨ��id����ȡ����
	 * @param id
	 * @return
	 */
	public NoticeTheroyContruction getNoticeById(Integer id);
	/**
	 * ͨ�����������Ҷ���
	 * @param type 1:֪ͨ����  2������  4������ר��  ��1��2��4������λ���㣩
	 * @return
	 */
	public List<NoticeTheroyContruction> getNoticeByType(Integer type);
	
	public boolean modifyNotice(NoticeTheroyContruction notice);
	
	public boolean deleteNotice(NoticeTheroyContruction notice);
	
}
